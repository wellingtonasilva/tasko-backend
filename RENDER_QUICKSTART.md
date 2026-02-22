# Guia Rápido de Deploy no Render.com

Este guia fornece instruções passo a passo para fazer o deploy da aplicação Tasko Backend no Render.com.

## 📋 Pré-requisitos

1. Conta no [Render.com](https://render.com)
2. Código do projeto em um repositório Git (GitHub, GitLab ou Bitbucket)
3. Arquivos necessários (já incluídos no projeto):
   - `Dockerfile`
   - `render.yaml`
   - `application-prod.properties`

## 🚀 Deploy Automático (Usando Blueprint)

### Passo 1: Preparar o Repositório

1. Faça commit e push de todos os arquivos para seu repositório:
   ```bash
   git add .
   git commit -m "Add Docker and Render configuration"
   git push origin main
   ```

### Passo 2: Criar o Blueprint no Render

1. Acesse [Render Dashboard](https://dashboard.render.com)
2. Clique no botão **"New"** → **"Blueprint"**
3. Conecte seu repositório Git
4. O Render detectará automaticamente o arquivo `render.yaml`
5. Clique em **"Apply"**

### Passo 3: Aguardar o Deploy

O Render criará automaticamente:
- ✅ **PostgreSQL Database** (tasko-db)
- ✅ **Web Service** (tasko-backend)

O primeiro deploy pode levar de 10-15 minutos (build + inicialização).

### Passo 4: Verificar o Deploy

1. Acesse a URL gerada pelo Render (ex: `https://tasko-backend.onrender.com`)
2. Verifique o health check: `https://tasko-backend.onrender.com/actuator/health`
3. Acesse a documentação da API: `https://tasko-backend.onrender.com/swagger-ui.html`

## 🔧 Deploy Manual

Se preferir configurar manualmente:

### Passo 1: Criar o Banco de Dados

1. No Render Dashboard, clique em **"New"** → **"PostgreSQL"**
2. Configure:
   - **Name**: `tasko-db`
   - **Database**: `tasko`
   - **User**: (gerado automaticamente)
   - **Region**: `Oregon` (ou mais próximo de você)
   - **PostgreSQL Version**: `15`
   - **Plan**: `Starter` ($7/mês) ou `Free` (para testes)

3. Clique em **"Create Database"**
4. Aguarde a criação (1-2 minutos)
5. **IMPORTANTE**: Anote as credenciais:
   - Internal Database URL
   - Username
   - Password

### Passo 2: Criar o Web Service

1. No Render Dashboard, clique em **"New"** → **"Web Service"**
2. Conecte seu repositório Git
3. Configure:

   **Basic Settings:**
   - **Name**: `tasko-backend`
   - **Region**: `Oregon` (mesma do banco de dados)
   - **Branch**: `main`
   - **Runtime**: `Docker`
   
   **Build Settings:**
   - **Dockerfile Path**: `./Dockerfile`
   
   **Plan:**
   - `Starter` ($7/mês) - Recomendado para produção
   - `Free` - Apenas para testes (hiberna após 15min de inatividade)

4. Clique em **"Advanced"** e adicione as variáveis de ambiente:

   ```
   SPRING_PROFILES_ACTIVE=prod
   DATABASE_URL=<internal-database-url-do-passo-1>
   DB_USERNAME=<username-do-passo-1>
   DB_PASSWORD=<password-do-passo-1>
   JAVA_OPTS=-Xms512m -Xmx1024m -XX:+UseG1GC
   ```

5. Configure o **Health Check Path**: `/actuator/health`

6. Clique em **"Create Web Service"**

### Passo 3: Monitorar o Deploy

1. Acompanhe os logs de build na interface do Render
2. O build pode levar 5-10 minutos na primeira vez
3. Após o build, a aplicação iniciará
4. Status deve mudar para **"Live"**

## ✅ Verificação Pós-Deploy

### 1. Health Check

```bash
curl https://seu-app.onrender.com/actuator/health
```

Resposta esperada:
```json
{
  "status": "UP"
}
```

### 2. API Documentation

Acesse no navegador:
```
https://seu-app.onrender.com/swagger-ui.html
```

### 3. Testar um Endpoint

```bash
curl https://seu-app.onrender.com/api/v1/supervisores
```

## 🔍 Troubleshooting

### Problema: Build Falhou

**Sintomas**: Build termina com erro

**Soluções**:
1. Verifique os logs de build no Render Dashboard
2. Teste o build localmente: `docker build -t tasko-backend:latest .`
3. Verifique se todas as dependências do Maven estão acessíveis
4. Certifique-se de que o Java 21 está sendo usado

### Problema: Aplicação Não Inicia

**Sintomas**: Build OK, mas aplicação não fica "Live"

**Soluções**:
1. Verifique os logs da aplicação
2. Confirme que as variáveis de ambiente estão corretas
3. Verifique a conectividade com o banco de dados
4. Aumente o timeout de inicialização (Settings → Health Check)

### Problema: Erro de Conexão com Banco

**Sintomas**: Logs mostram erro de conexão com PostgreSQL

**Soluções**:
1. Use o **Internal Database URL** (não o External)
2. Verifique se DATABASE_URL, DB_USERNAME e DB_PASSWORD estão corretos
3. Certifique-se de que o banco de dados está na mesma região
4. Verifique se o banco de dados está "Available"

### Problema: Health Check Falhando

**Sintomas**: Service marca como "Unhealthy"

**Soluções**:
1. Verifique se `/actuator/health` está respondendo
2. Aumente o "Initial Delay" do health check para 60-90 segundos
3. Verifique os logs para erros de inicialização
4. Confirme que a porta está configurada corretamente (${PORT})

### Problema: 502 Bad Gateway

**Sintomas**: Acesso à URL retorna erro 502

**Soluções**:
1. A aplicação pode ainda estar inicializando (aguarde 2-3 minutos)
2. Verifique se há erros nos logs
3. Reinicie o serviço: Deploy → "Manual Deploy" → "Clear build cache & deploy"

## 🔄 Redeploy

### Deploy Automático

Render faz deploy automático sempre que há push na branch configurada:

```bash
git add .
git commit -m "Update feature"
git push origin main
```

### Deploy Manual

No Render Dashboard:
1. Acesse seu Web Service
2. Clique em **"Manual Deploy"**
3. Selecione a branch
4. Clique em **"Deploy"**

### Rollback

Para voltar a uma versão anterior:
1. Vá em **"Deploys"** no seu serviço
2. Encontre o deploy desejado
3. Clique em **"Redeploy"**

## 💰 Estimativa de Custos

### Plan Free (Para Testes)

- **Web Service**: Grátis
  - Hiberna após 15min de inatividade
  - Demora ~30s para acordar
  - 750 horas/mês gratuitas
  
- **PostgreSQL**: Grátis
  - Expires após 90 dias
  - 1GB de storage
  - Backups limitados

**Total: $0/mês** (limitações aplicadas)

### Plan Starter (Recomendado para Produção)

- **Web Service**: $7/mês
  - Sempre ativo (sem hibernação)
  - 512MB RAM
  - 0.5 CPU
  
- **PostgreSQL**: $7/mês
  - 1GB de storage
  - Backups automáticos
  - Alta disponibilidade

**Total: $14/mês**

### Plan Standard (Alta Performance)

- **Web Service**: $25/mês
  - 2GB RAM
  - 1 CPU
  - Maior throughput
  
- **PostgreSQL**: $20/mês
  - 10GB de storage
  - Backups frequentes
  - Melhor performance

**Total: $45/mês**

## 🔒 Segurança

### Variáveis de Ambiente

⚠️ **NUNCA** commite valores sensíveis no código!

Use apenas variáveis de ambiente para:
- Credenciais de banco de dados
- API keys
- Secrets

### SSL/HTTPS

✅ Render fornece SSL gratuito automaticamente
- Certificado gerenciado automaticamente
- Renovação automática
- Redirecionamento HTTP → HTTPS

### Rede Privada

O banco de dados Render usa conexão interna privada:
- Use o **Internal Database URL**
- Mais rápido e seguro
- Sem custos de egress

## 📊 Monitoramento

### Logs

Acesse os logs em tempo real:
1. Render Dashboard → Seu serviço → **"Logs"**
2. Use filtros para buscar erros específicos
3. Baixe logs para análise offline

### Métricas

Verifique métricas do serviço:
1. Render Dashboard → Seu serviço → **"Metrics"**
2. CPU, Memória, Network
3. Response times
4. Request counts

### Alertas

Configure alertas para:
- Deploy failures
- Health check failures  
- High memory usage
- Crash loops

## 🎯 Próximos Passos

Após o deploy bem-sucedido:

1. ✅ Configure um domínio customizado (opcional)
2. ✅ Configure backups do banco de dados
3. ✅ Configure monitoramento de uptime
4. ✅ Implemente CI/CD pipeline
5. ✅ Configure logs centralizados
6. ✅ Implemente rate limiting
7. ✅ Configure CORS apropriadamente

## 📚 Recursos Adicionais

- [Documentação Oficial do Render](https://render.com/docs)
- [Render Community](https://community.render.com)
- [Status do Render](https://status.render.com)
- [Preços do Render](https://render.com/pricing)

## 🆘 Suporte

Se encontrar problemas:

1. Consulte este guia primeiro
2. Verifique os logs no Render Dashboard
3. Consulte a documentação do Render
4. Entre em contato com a equipe de desenvolvimento
5. Abra um ticket no suporte do Render (planos pagos)

---

**Última atualização**: Fevereiro 2026

