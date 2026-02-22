# Multi-stage build for tasko-backend
# Stage 1: Build the application
FROM maven:3.9-eclipse-temurin-21 AS build

# Set working directory
WORKDIR /app

# Copy the parent pom.xml and module pom.xml files first (for better layer caching)
COPY pom.xml .
COPY tasko-common/pom.xml tasko-common/
COPY tasko-vendedor/pom.xml tasko-vendedor/
COPY tasko-application/pom.xml tasko-application/

# Download dependencies (this layer will be cached if pom.xml files don't change)
RUN mvn dependency:go-offline -B

# Copy the source code
COPY tasko-common/src tasko-common/src
COPY tasko-vendedor/src tasko-vendedor/src
COPY tasko-application/src tasko-application/src

# Build the application (skip tests for faster builds in production)
RUN mvn clean package -DskipTests -B

# Stage 2: Create the runtime image
FROM eclipse-temurin:21-jre-alpine

# Install dumb-init and wget for proper signal handling and health checks
RUN apk add --no-cache dumb-init wget

# Create a non-root user for running the application
RUN addgroup -g 1001 -S tasko && \
    adduser -u 1001 -S tasko -G tasko

# Set working directory
WORKDIR /app

# Copy the built JAR from the build stage
COPY --from=build /app/target/tasko-application-*.jar app.jar

# Change ownership of the application files
RUN chown -R tasko:tasko /app

# Switch to non-root user
USER tasko

# Expose the port (Render.com will set PORT environment variable)
EXPOSE 8080

# Set environment variables for production
ENV JAVA_OPTS="-Xms512m -Xmx1024m -XX:+UseG1GC -XX:MaxGCPauseMillis=200 -XX:+HeapDumpOnOutOfMemoryError" \
    SPRING_PROFILES_ACTIVE=prod

# Use dumb-init to handle signals properly
ENTRYPOINT ["dumb-init", "--"]

# Run the application with explicit Spring profile
CMD ["sh", "-c", "java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -Dserver.port=${PORT:-8080} -Dspring.profiles.active=${SPRING_PROFILES_ACTIVE:-prod} -jar app.jar"]

