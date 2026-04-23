ALTER TABLE crm.empresa
    ADD COLUMN emp_nmempresa VARCHAR(255),
    ADD COLUMN emp_nncnpj VARCHAR(30),
    ADD COLUMN emp_dsemail VARCHAR(255),
    ADD COLUMN emp_dslogradouro VARCHAR(255),
    ADD COLUMN emp_nnporta VARCHAR(20),
    ADD COLUMN emp_nmbairro VARCHAR(255),
    ADD COLUMN emp_nmcidade VARCHAR(255),
    ADD COLUMN emp_cduf VARCHAR(2),
    ADD COLUMN emp_nmtelefone VARCHAR(255),
    ADD COLUMN emp_tmcriado_em TIMESTAMP,
    ADD COLUMN emp_tmatualizado_em TIMESTAMP,
    ADD COLUMN emp_icativo BOOLEAN;

COMMENT ON COLUMN crm.empresa.emp_id IS
    'Id. Empresa';

COMMENT ON COLUMN crm.empresa.emp_nmempresa IS
    'Nome da Empresa';

COMMENT ON COLUMN crm.empresa.emp_nncnpj IS
    'Número do CNPJ';

COMMENT ON COLUMN crm.empresa.emp_dsemail IS
    'Email da Empresa';

COMMENT ON COLUMN crm.empresa.emp_dslogradouro IS
    'Logradouro (Rua, Av.. etc)';

COMMENT ON COLUMN crm.empresa.emp_nnporta IS
    'Número do Endereço';

COMMENT ON COLUMN crm.empresa.emp_nmbairro IS
    'Nome do Bairro';

COMMENT ON COLUMN crm.empresa.emp_nmcidade IS
    'Nome da Cidade';

COMMENT ON COLUMN crm.empresa.emp_cduf IS
    'UF da Cidade';

COMMENT ON COLUMN crm.empresa.emp_nmtelefone IS
    'Número de Telefone';

COMMENT ON COLUMN crm.empresa.emp_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.empresa.emp_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.empresa.emp_icativo IS
    'Indicador de Registro Ativo';

CREATE TABLE crm.usuario (
                         usur_id              BIGSERIAL NOT NULL,
                         vend_id              BIGINT,
                         usur_nmusuario       VARCHAR(255),
                         usur_dssenha         VARCHAR(255),
                         usur_tmcriado_em     TIMESTAMP,
                         usur_tmatualizado_em TIMESTAMP,
                         usur_icativo         BOOLEAN
);

COMMENT ON COLUMN crm.usuario.usur_id IS
    'Id. da Tabela';

COMMENT ON COLUMN crm.usuario.vend_id IS
    'Id. do Vendedor';

COMMENT ON COLUMN crm.usuario.usur_nmusuario IS
    'Nome do Usuário';

COMMENT ON COLUMN crm.usuario.usur_dssenha IS
    'Senha de Acesso';

COMMENT ON COLUMN crm.usuario.usur_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.usuario.usur_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.usuario.usur_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.usuario ADD CONSTRAINT usuario_pk PRIMARY KEY ( usur_id );

CREATE TABLE crm.usuario_empresa (
                                 usem_id              BIGSERIAL NOT NULL,
                                 usur_id              BIGINT,
                                 emp_id               BIGINT,
                                 usem_tmcriado_em     TIMESTAMP,
                                 usem_tmatualizado_em TIMESTAMP,
                                 usem_icativo         BOOLEAN
);

COMMENT ON COLUMN crm.usuario_empresa.usem_id IS
    'Id. da Tabela';

COMMENT ON COLUMN crm.usuario_empresa.usur_id IS
    'Id. do Usuário';

COMMENT ON COLUMN crm.usuario_empresa.emp_id IS
    'Id. da Empresa';

COMMENT ON COLUMN crm.usuario_empresa.usem_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.usuario_empresa.usem_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.usuario_empresa.usem_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.usuario_empresa ADD CONSTRAINT usuario_empresa_pk PRIMARY KEY ( usem_id );

CREATE TABLE crm.usuario_perfil (
                                uspf_id              BIGSERIAL,
                                uspt_id              BIGINT NOT NULL,
                                usur_id              BIGINT NOT NULL,
                                usur_tmcriado_em     TIMESTAMP,
                                usur_tmatualizado_em TIMESTAMP,
                                usur_icativo         BOOLEAN
);

COMMENT ON COLUMN crm.usuario_perfil.uspf_id IS
    'Id. da tabela';

COMMENT ON COLUMN crm.usuario_perfil.uspt_id IS
    'Id. Usuário Perfil';

COMMENT ON COLUMN crm.usuario_perfil.usur_id IS
    'Id. Usuário';

COMMENT ON COLUMN crm.usuario_perfil.usur_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.usuario_perfil.usur_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.usuario_perfil.usur_icativo IS
    'Indicador de Registro Ativo';

CREATE TABLE crm.usuario_perfil_tipo (
                                     uspt_id              BIGSERIAL NOT NULL,
                                     uspt_nmperfil        VARCHAR(255),
                                     uspt_tmcriado_em     TIMESTAMP,
                                     uspt_tmatualizado_em TIMESTAMP,
                                     uspt_icativo         BOOLEAN
);

COMMENT ON COLUMN crm.usuario_perfil_tipo.uspt_id IS
    'Id. da tabela';

COMMENT ON COLUMN crm.usuario_perfil_tipo.uspt_nmperfil IS
    'Nome do Perfil (ADMIN, USER)';

COMMENT ON COLUMN crm.usuario_perfil_tipo.uspt_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.usuario_perfil_tipo.uspt_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.usuario_perfil_tipo.uspt_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.usuario_perfil_tipo ADD CONSTRAINT usuario_perfil_tipo_pk PRIMARY KEY ( uspt_id );

ALTER TABLE crm.usuario_empresa
    ADD CONSTRAINT xfk1_usuario_empresa FOREIGN KEY ( emp_id )
        REFERENCES crm.empresa ( emp_id );

ALTER TABLE crm.usuario_empresa
    ADD CONSTRAINT xfk2_usuario_empresa FOREIGN KEY ( usur_id )
        REFERENCES crm.usuario ( usur_id );

ALTER TABLE crm.usuario_perfil
    ADD CONSTRAINT xfk1_usuario_perfil FOREIGN KEY ( usur_id )
        REFERENCES crm.usuario ( usur_id );

ALTER TABLE crm.usuario_perfil
    ADD CONSTRAINT xfk2_usuario_perfil FOREIGN KEY ( uspt_id )
        REFERENCES crm.usuario_perfil_tipo ( uspt_id );

ALTER TABLE crm.usuario
    ADD CONSTRAINT xkf1_usuario_vendedor FOREIGN KEY ( vend_id )
        REFERENCES crm.vendedor ( vend_id );