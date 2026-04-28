CREATE TABLE crm.usuario_reset_senha
(
    usrs_id              BIGSERIAL    NOT NULL PRIMARY KEY,
    usrs_dsemail         VARCHAR(255) NOT NULL,
    usrs_token           VARCHAR(255) NOT NULL,
    usrs_tmvalido_ate    TIMESTAMP,
    usrs_icutilizado     BOOLEAN,
    usrs_tmcriado_em     TIMESTAMP,
    usrs_tmatualizado_em TIMESTAMP,
    usrs_icativo         BOOLEAN
);