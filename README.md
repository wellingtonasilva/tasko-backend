# Tasko Backend

Sistema de Gestão de Vendas - Backend

## 📋 Índice

- [Sobre](#sobre)
- [Tecnologias](#tecnologias)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Pré-requisitos](#pré-requisitos)
- [Instalação e Execução](#instalação-e-execução)
- [Docker](#docker)
- [Deploy](#deploy)
- [API Documentation](#api-documentation)
- [Contribuindo](#contribuindo)

## 🎯 Sobre

Tasko Backend é uma aplicação Spring Boot para gestão de vendas, desenvolvida usando Clean Architecture e princípios de Domain-Driven Design (DDD).

## 🚀 Tecnologias

- **Java 21**
- **Spring Boot 3.5.10**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**
- **MapStruct** - Mapeamento de objetos
- **Lombok** - Redução de boilerplate
- **Flyway** - Migrações de banco de dados
- **SpringDoc OpenAPI** - Documentação da API
- **Docker** - Containerização

## 📁 Estrutura do Projeto

O projeto segue uma arquitetura modular multi-módulo Maven:

```
tasko-backend/
├── tasko-common/           # Módulo comum com entidades, exceções e validators
├── tasko-vendedor/         # Módulo de vendedor (Hexagonal Architecture)
│   ├── adapter/
│   │   ├── in/web/        # Controladores REST
│   │   └── out/persistence/ # Repositórios e entidades JPA
│   ├── application/        # Use cases e ports
│   └── domain/            # Entidades de domínio
├── tasko-application/      # Módulo principal (ponto de entrada)
└── pom.xml                # POM pai
```

### Arquitetura Hexagonal

O módulo `tasko-vendedor` segue os princípios da Arquitetura Hexagonal (Ports & Adapters):

- **Domain**: Regras de negócio puras, sem dependências externas
- **Application**: Use cases e definição de ports (interfaces)
- **Adapters**: Implementações concretas
  - **In**: Entrada (Controllers REST)
  - **Out**: Saída (Repositories, APIs externas)

## 📋 Pré-requisitos

- Java 21 ou superior
- Maven 3.9 ou superior
- PostgreSQL 15 ou superior
- Docker (opcional, para containerização)

## 🔧 Instalação e Execução

### 1. Clone o repositório

```bash
git clone <repository-url>
cd tasko-backend
```

### 2. Configure o banco de dados

Crie um banco de dados PostgreSQL:

```sql
CREATE DATABASE tasko;
```

### 3. Configure as variáveis de ambiente

Edite o arquivo `tasko-application/src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/tasko
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

### 4. Compile o projeto

```bash
mvn clean install
```

### 5. Execute a aplicação

```bash
cd tasko-application
mvn spring-boot:run
```

A aplicação estará disponível em: `https://localhost:8443`

## 🐳 Docker

### Usando Docker Compose (Recomendado)

O jeito mais fácil de executar a aplicação com todas as dependências:

```bash
# Iniciar a aplicação e o banco de dados
docker-compose up -d

# Ver os logs
docker-compose logs -f

# Parar os containers
docker-compose down
```

### Script de Deploy

Use o script `deploy.sh` para facilitar operações comuns:

```bash
# Ver comandos disponíveis
./deploy.sh help

# Build da imagem Docker
./deploy.sh build

# Executar com docker-compose
./deploy.sh run

# Ver logs
./deploy.sh logs

# Parar containers
./deploy.sh stop

# Limpeza completa
./deploy.sh clean
```

### Build Manual

```bash
# Build da imagem
docker build -t tasko-backend:latest .

# Executar o container
docker run -p 8080:8080 \
  -e SPRING_PROFILES_ACTIVE=prod \
  -e DATABASE_URL=jdbc:postgresql://host:5432/tasko \
  -e DB_USERNAME=postgres \
  -e DB_PASSWORD=postgres \
  tasko-backend:latest
```

## 🚀 Deploy

### Deploy no Render.com

Para instruções detalhadas de deploy no Render.com, consulte [DOCKER_DEPLOYMENT.md](DOCKER_DEPLOYMENT.md).

**Resumo rápido:**

1. Faça push do código para GitHub/GitLab
2. Acesse o [Render Dashboard](https://dashboard.render.com)
3. Clique em "New" → "Blueprint"
4. Conecte seu repositório
5. O Render usará o `render.yaml` para criar automaticamente:
   - Web Service (aplicação)
   - PostgreSQL Database

### Variáveis de Ambiente (Produção)

```bash
SPRING_PROFILES_ACTIVE=prod
DATABASE_URL=jdbc:postgresql://host:5432/database
DB_USERNAME=usuario
DB_PASSWORD=senha
JAVA_OPTS=-Xms512m -Xmx1024m -XX:+UseG1GC
```

## 📚 API Documentation

A documentação da API está disponível através do Swagger UI:

- **Local (Desenvolvimento)**: https://localhost:8443/swagger-ui.html
- **Produção**: https://seu-app.onrender.com/swagger-ui.html

### Endpoints Principais

#### Vendedor Supervisor

- `POST /api/v1/supervisores` - Adicionar supervisor
- `GET /api/v1/supervisores` - Listar supervisores
- `GET /api/v1/supervisores/{id}` - Obter supervisor por ID
- `DELETE /api/v1/supervisores/{id}` - Excluir supervisor

#### Vendedor

- `POST /api/v1/vendedores` - Adicionar vendedor
- `GET /api/v1/vendedores` - Listar vendedores
- `GET /api/v1/vendedores/{id}` - Obter vendedor por ID
- `PUT /api/v1/vendedores/{id}` - Atualizar vendedor
- `DELETE /api/v1/vendedores/{id}` - Excluir vendedor

#### Health Check

- `GET /actuator/health` - Status da aplicação
- `GET /actuator/info` - Informações da aplicação

## 🧪 Testes

```bash
# Executar todos os testes
mvn test

# Executar testes de um módulo específico
cd tasko-vendedor
mvn test

# Executar com relatório de cobertura
mvn clean test jacoco:report
```

## 📝 Profiles do Spring

- **default**: Desenvolvimento local (SSL habilitado, H2/PostgreSQL local)
- **prod**: Produção (SSL desabilitado no app, gerenciado pelo Render)

Ativar um profile:

```bash
# Via linha de comando
java -jar app.jar --spring.profiles.active=prod

# Via variável de ambiente
export SPRING_PROFILES_ACTIVE=prod
```

## 🔒 Segurança

- SSL/HTTPS configurado para desenvolvimento (keystore.p12)
- Em produção, SSL é gerenciado pelo Render.com
- Variáveis sensíveis devem ser configuradas via environment variables
- Validação de entrada com Bean Validation
- Exception handling centralizado

## 🛠️ Desenvolvimento

### Padrões de Código

- Clean Code
- SOLID Principles
- Domain-Driven Design (DDD)
- Hexagonal Architecture (Ports & Adapters)

### Ferramentas Recomendadas

- **IDE**: IntelliJ IDEA, Eclipse ou VS Code
- **Database Client**: DBeaver, pgAdmin
- **API Testing**: Postman, Insomnia
- **Container Management**: Docker Desktop

### MapStruct

O projeto usa MapStruct para mapeamento entre DTOs e entidades. Os mappers são gerados automaticamente durante a compilação.

```bash
# Gerar os mappers
mvn clean compile
```

## 🤝 Contribuindo

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📄 Licença

Este projeto é proprietário e confidencial.

## 👥 Equipe

Desenvolvido por WAS Sistemas

## 📞 Suporte

Para questões e suporte, entre em contato com a equipe de desenvolvimento.

---

**Nota**: Este README é um documento vivo e deve ser atualizado conforme o projeto evolui.

