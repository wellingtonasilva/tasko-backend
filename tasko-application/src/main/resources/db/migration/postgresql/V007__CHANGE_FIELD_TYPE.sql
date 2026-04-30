-- Altera o tipo da coluna para BIGINT (caso não seja)
ALTER TABLE crm.pedido_status_tipo
    ALTER COLUMN pstp_id TYPE BIGINT;

-- Cria a sequência
CREATE SEQUENCE IF NOT EXISTS crm.pedido_status_tipo_pstp_id_seq;

-- Ajusta a sequência para o maior valor atual da coluna
SELECT setval('crm.pedido_status_tipo_pstp_id_seq', COALESCE((SELECT MAX(pstp_id) FROM crm.pedido_status_tipo), 1));

-- Define o default da coluna para usar a sequência
ALTER TABLE crm.pedido_status_tipo
    ALTER COLUMN pstp_id SET DEFAULT nextval('crm.pedido_status_tipo_pstp_id_seq');

-- (Opcional) Se quiser garantir que a coluna seja auto-incremento e NOT NULL
-- ALTER TABLE crm.pedido_status_tipo ALTER COLUMN pstp_id SET NOT NULL;

-- Se necessário, adiciona a sequence como owned by
ALTER SEQUENCE crm.pedido_status_tipo_pstp_id_seq OWNED BY crm.pedido_status_tipo.pstp_id;
