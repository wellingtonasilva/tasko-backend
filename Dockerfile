# =============================================================================
# Multi-stage build for tasko-backend
# Módulos: common, vendedor, cliente, produto, pedido, agenda, empresa, application
# =============================================================================

# ---------------------------------------------------------------------------
# Stage 1: Build – compila todos os módulos com Maven
# ---------------------------------------------------------------------------
FROM maven:3.9-eclipse-temurin-21-alpine AS build

WORKDIR /app

# 1) Copiar apenas os pom.xml de cada módulo (layer de cache de dependências)
COPY pom.xml .
COPY tasko-common/pom.xml      tasko-common/
COPY tasko-vendedor/pom.xml    tasko-vendedor/
COPY tasko-cliente/pom.xml     tasko-cliente/
COPY tasko-produto/pom.xml     tasko-produto/
COPY tasko-pedido/pom.xml      tasko-pedido/
COPY tasko-agenda/pom.xml      tasko-agenda/
COPY tasko-empresa/pom.xml     tasko-empresa/
COPY tasko-usuario/pom.xml     tasko-usuario/
COPY tasko-application/pom.xml tasko-application/

# 2) Baixar dependências offline (cache – só invalida se algum pom.xml mudar)
RUN mvn dependency:go-offline -B -q

# 3) Copiar código-fonte de todos os módulos
COPY tasko-common/src      tasko-common/src
COPY tasko-vendedor/src     tasko-vendedor/src
COPY tasko-cliente/src      tasko-cliente/src
COPY tasko-produto/src      tasko-produto/src
COPY tasko-pedido/src       tasko-pedido/src
COPY tasko-agenda/src       tasko-agenda/src
COPY tasko-empresa/src      tasko-empresa/src
COPY tasko-usuario/src      tasko-usuario/src
COPY tasko-application/src  tasko-application/src

# 4) Build do projeto (skip tests para builds de produção)
RUN mvn clean package -DskipTests -B -q \
    && mv /app/target/tasko-application-*.jar /app/app.jar

# ---------------------------------------------------------------------------
# Stage 2: Runtime – imagem enxuta apenas com JRE
# ---------------------------------------------------------------------------
FROM eclipse-temurin:21-jre-alpine

# Instalar dumb-init (signal handling), curl (health checks) e criar usuário não-root
RUN apk add --no-cache dumb-init curl \
    && rm -rf /var/cache/apk/* \
    && addgroup -g 1001 -S tasko \
    && adduser -u 1001 -S tasko -G tasko

WORKDIR /app

# Copiar o fat-jar já renomeado do estágio de build
COPY --from=build --chown=tasko:tasko /app/app.jar app.jar

# Não é necessário chown separado pois --chown já foi aplicado acima
USER tasko

EXPOSE 8080

# Variáveis de ambiente padrão (podem ser sobrescritas em runtime)
ENV JAVA_OPTS="-Xms128m -Xmx512m \
    -XX:+UseG1GC \
    -XX:MaxGCPauseMillis=200 \
    -XX:+HeapDumpOnOutOfMemoryError \
    -XX:+UseStringDeduplication" \
    SPRING_PROFILES_ACTIVE=prod

# Health check embutido (funciona em Docker standalone, Compose e Render)
HEALTHCHECK --interval=30s --timeout=10s --start-period=60s --retries=3 \
    CMD curl -sf http://localhost:${PORT:-8080}/actuator/health || exit 1

ENTRYPOINT ["dumb-init", "--"]

CMD ["sh", "-c", "java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -Dserver.port=${PORT:-8080} -Dspring.profiles.active=${SPRING_PROFILES_ACTIVE:-prod} -jar app.jar"]

