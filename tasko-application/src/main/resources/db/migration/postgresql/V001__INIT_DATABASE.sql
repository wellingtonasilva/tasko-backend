CREATE SCHEMA IF NOT EXISTS crm AUTHORIZATION CURRENT_USER;

CREATE TABLE crm.agenda_visita (
    avis_id                 BIGSERIAL NOT NULL,
    avis_dtagendada         TIMESTAMP,
    avis_dtrealizada        TIMESTAMP,
    avis_nnduracao_prevista INTEGER,
    avis_nnduracao_real     INTEGER,
    avis_objetivo           TEXT,
    avis_observacao         TEXT,
    avis_resultado          TEXT,
    vend_id                 BIGINT,
    clie_id                 BIGINT,
    agst_id                 BIGINT,
    avis_nnlatitude         NUMERIC(10, 8),
    avis_nnlongitude        NUMERIC(10, 8),
    avis_icpedido_gerado    BOOLEAN,
    pedi_id                 BIGINT,
    avis_lvpedido           NUMERIC(15, 2),
    avis_icsincronizado     BOOLEAN,
    avis_iccriado_offline   BOOLEAN,
    avis_uuid_offline       VARCHAR(200),
    avis_tmcriado_em        TIMESTAMP,
    avis_tmatualizado_em    TIMESTAMP,
    avis_icativo            BOOLEAN
);

COMMENT ON COLUMN crm.agenda_visita.avis_dtagendada IS
    'Data/Hora Agendamento';

COMMENT ON COLUMN crm.agenda_visita.avis_dtrealizada IS
    'Data/Hora Visita Realizada';

COMMENT ON COLUMN crm.agenda_visita.avis_nnduracao_prevista IS
    'Duração Prevista em Minutos';

COMMENT ON COLUMN crm.agenda_visita.avis_nnduracao_real IS
    'Duração Real em Minutos';

COMMENT ON COLUMN crm.agenda_visita.avis_objetivo IS
    'Objertivo da Visita';

COMMENT ON COLUMN crm.agenda_visita.avis_observacao IS
    'Observações';

COMMENT ON COLUMN crm.agenda_visita.avis_resultado IS
    'Resultado';

COMMENT ON COLUMN crm.agenda_visita.vend_id IS
    'Id. do Vendedor';

COMMENT ON COLUMN crm.agenda_visita.clie_id IS
    'Id. do Cliente';

COMMENT ON COLUMN crm.agenda_visita.agst_id IS
    'Id. Status da Visita';

COMMENT ON COLUMN crm.agenda_visita.avis_nnlatitude IS
    'Localização - Latitude';

COMMENT ON COLUMN crm.agenda_visita.avis_nnlongitude IS
    'Localização - Longitude';

COMMENT ON COLUMN crm.agenda_visita.avis_icpedido_gerado IS
    'Indicador de Pedido Gerado';

COMMENT ON COLUMN crm.agenda_visita.pedi_id IS
    'Id. do Pedido';

COMMENT ON COLUMN crm.agenda_visita.avis_lvpedido IS
    'Valor do Pedido';

COMMENT ON COLUMN crm.agenda_visita.avis_icsincronizado IS
    'Sincronização - Indicador de Sincronizado com o servidor';

COMMENT ON COLUMN crm.agenda_visita.avis_iccriado_offline IS
    'Sincronização - Indicador de Criado em modo Offline';

COMMENT ON COLUMN crm.agenda_visita.avis_uuid_offline IS
    'Sincronização - Id. criado automaticamente';

COMMENT ON COLUMN crm.agenda_visita.avis_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.agenda_visita.avis_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.agenda_visita.avis_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.agenda_visita ADD CONSTRAINT agenda_visita_pk PRIMARY KEY ( avis_id );

CREATE TABLE crm.agenda_visita_checkins (
    vchk_id                      BIGSERIAL NOT NULL,
    avis_id                      BIGINT,
    vend_id                      BIGINT,
    clie_id                      BIGINT,
    chtp_id                      BIGINT,
    vchk_observacao              TEXT,
    vchk_nnlatitude              NUMERIC(10, 8),
    vchk_nnlongitude             NUMERIC(10, 8),
    vchk_nndistancia_cliente     NUMERIC(10, 2),
    vchk_icdentro_raio_permitido BOOLEAN,
    vchk_icsincronizado          BOOLEAN,
    vchk_uuid_offline            VARCHAR(200),
    vchk_tmcriado_em             TIMESTAMP,
    vchk_tmatualizado_em         TIMESTAMP,
    vchk_icativo                 BOOLEAN
);

COMMENT ON COLUMN crm.agenda_visita_checkins.avis_id IS
    'Id. Agenda Visita';

COMMENT ON COLUMN crm.agenda_visita_checkins.vend_id IS
    'Id. Vendedor';

COMMENT ON COLUMN crm.agenda_visita_checkins.clie_id IS
    'Id. Cliente';

COMMENT ON COLUMN crm.agenda_visita_checkins.chtp_id IS
    'Tipo Checkin';

COMMENT ON COLUMN crm.agenda_visita_checkins.vchk_observacao IS
    'Observação sobre o Checkin';

COMMENT ON COLUMN crm.agenda_visita_checkins.vchk_nnlatitude IS
    'Localização - Latitude';

COMMENT ON COLUMN crm.agenda_visita_checkins.vchk_nnlongitude IS
    'Localização - Longitude';

COMMENT ON COLUMN crm.agenda_visita_checkins.vchk_nndistancia_cliente IS
    'Distancia Calculada do Cliente em Metros';

COMMENT ON COLUMN crm.agenda_visita_checkins.vchk_icdentro_raio_permitido IS
    'Indicador que o Vendedor está no Raio permitido para esse Cliente';

COMMENT ON COLUMN crm.agenda_visita_checkins.vchk_icsincronizado IS
    'Sincronização - Indicador de Sincronizado com o servidor';

COMMENT ON COLUMN crm.agenda_visita_checkins.vchk_uuid_offline IS
    'Sincronização - Id. criado automaticamente';

COMMENT ON COLUMN crm.agenda_visita_checkins.vchk_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.agenda_visita_checkins.vchk_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.agenda_visita_checkins.vchk_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.agenda_visita_checkins ADD CONSTRAINT agenda_visita_checkins_pk PRIMARY KEY ( vchk_id );

CREATE TABLE crm.agenda_visita_status (
    agst_id              BIGSERIAL NOT NULL,
    agst_dsvisita_status VARCHAR(255),
    agst_tmcriado_em     TIMESTAMP,
    agst_tmatualizado_em TIMESTAMP,
    agst_icativo         BOOLEAN
);

COMMENT ON COLUMN crm.agenda_visita_status.agst_dsvisita_status IS
    'Descrição Visita Status';

COMMENT ON COLUMN crm.agenda_visita_status.agst_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.agenda_visita_status.agst_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.agenda_visita_status.agst_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.agenda_visita_status ADD CONSTRAINT agenda_visita_status_pk PRIMARY KEY ( agst_id );

CREATE TABLE crm.checkins_tipo (
    chtp_id              BIGSERIAL NOT NULL,
    chtp_dscheckin_tipo  VARCHAR(50),
    chtp_tmcriado_em     TIMESTAMP,
    chtp_tmatualizado_em TIMESTAMP,
    chtp_icativo         BOOLEAN
);

COMMENT ON COLUMN crm.checkins_tipo.chtp_dscheckin_tipo IS
    'Descrição do Checkin Tipo:
 - CHECK_IN
 - CHECK_OUT';

COMMENT ON COLUMN crm.checkins_tipo.chtp_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.checkins_tipo.chtp_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.checkins_tipo.chtp_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.checkins_tipo ADD CONSTRAINT checkins_tipo_pk PRIMARY KEY ( chtp_id );

CREATE TABLE crm.cliente (
    clie_id                   BIGSERIAL NOT NULL,
    vend_id                   BIGINT,
    clie_cdcliente            VARCHAR(20),
    clie_dsrazao_social       VARCHAR(255),
    clie_nmfantasia           VARCHAR(255),
    clie_nncnpj_cpf           VARCHAR(20),
    clie_nninscricao_estadual VARCHAR(20),
    clie_cdtipo               VARCHAR(2),
    clie_dssegmento           VARCHAR(255),
    clie_cdcategoria          VARCHAR(1),
    clie_cdcep                VARCHAR(20),
    clie_nmlogradouro         VARCHAR(255),
    clie_dscomplemento        VARCHAR(255),
    clie_nmbairro             VARCHAR(255),
    clie_nmcidade             VARCHAR(255),
    clie_cdestado             VARCHAR(255),
    clie_vllatitude           NUMERIC(10, 8),
    clie_vllongitude          NUMERIC(10, 8),
    clie_vllimite_credito     NUMERIC(15, 2),
    clie_nnprazo_pagamento    SMALLINT,
    clie_dtultimo_pedido      DATE,
    clie_vlultima_compra      NUMERIC(15, 2),
    clie_icbloqueado          BOOLEAN,
    clie_dsmotivo_bloqueio    TEXT,
    clie_tmcriado_em          TIMESTAMP,
    clie_tmatualizado_em      TIMESTAMP,
    clie_icativo              BOOLEAN
);

COMMENT ON COLUMN crm.cliente.clie_cdcliente IS
    'Código do Cliente';

COMMENT ON COLUMN crm.cliente.clie_dsrazao_social IS
    'Razação Social';

COMMENT ON COLUMN crm.cliente.clie_nmfantasia IS
    'Nome Fantasia';

COMMENT ON COLUMN crm.cliente.clie_nncnpj_cpf IS
    'CNPJ ou CPF do Cliente';

COMMENT ON COLUMN crm.cliente.clie_nninscricao_estadual IS
    'Número Inscrição Estadual';

COMMENT ON COLUMN crm.cliente.clie_cdtipo IS
    'Tipo do Cliente
 - PF
 - PJ
 ';

COMMENT ON COLUMN crm.cliente.clie_dssegmento IS
    'Descrição do Segmento';

COMMENT ON COLUMN crm.cliente.clie_cdcategoria IS
    'Categoria do Cliente
 - A
 - B
 - C
 - D';

COMMENT ON COLUMN crm.cliente.clie_cdcep IS
    'CEP';

COMMENT ON COLUMN crm.cliente.clie_nmlogradouro IS
    'Rua/Nome do Logradouro ';

COMMENT ON COLUMN crm.cliente.clie_dscomplemento IS
    'Complemento do Endereço';

COMMENT ON COLUMN crm.cliente.clie_nmbairro IS
    'Nome do Bairro';

COMMENT ON COLUMN crm.cliente.clie_nmcidade IS
    'Nome da Cidade';

COMMENT ON COLUMN crm.cliente.clie_cdestado IS
    'Código do Estado (UF)';

COMMENT ON COLUMN crm.cliente.clie_vllatitude IS
    'Endereço - Latitude';

COMMENT ON COLUMN crm.cliente.clie_vllongitude IS
    'Endereço - Longitude';

COMMENT ON COLUMN crm.cliente.clie_vllimite_credito IS
    'Comercial  - Limite de Crédito';

COMMENT ON COLUMN crm.cliente.clie_nnprazo_pagamento IS
    'Comercial  - Número de Dias para Pagamento';

COMMENT ON COLUMN crm.cliente.clie_dtultimo_pedido IS
    'Comercial  - Data Último do Pedido do Cliente';

COMMENT ON COLUMN crm.cliente.clie_vlultima_compra IS
    'Comercial  - Valor da Última Compra';

COMMENT ON COLUMN crm.cliente.clie_icbloqueado IS
    'Status - Cliente bloqueado';

COMMENT ON COLUMN crm.cliente.clie_dsmotivo_bloqueio IS
    'Motivo do Bloqueio do Cliente';

COMMENT ON COLUMN crm.cliente.clie_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.cliente.clie_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.cliente.clie_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.cliente ADD CONSTRAINT cliente_pk PRIMARY KEY ( clie_id );

CREATE TABLE crm.cliente_tabela_preco (
    cltb_id              BIGSERIAL NOT NULL,
    clie_id              BIGINT,
    tpre_id              BIGINT,
    cltb_dtinicio        DATE,
    cltb_dtfim           DATE,
    cltb_tmcriado_em     TIMESTAMP,
    cltb_tmatualizado_em TIMESTAMP,
    cltb_icativo         BOOLEAN
);

COMMENT ON COLUMN crm.cliente_tabela_preco.cltb_dtinicio IS
    'Data Início da Vigência da Tabela de Preços';

COMMENT ON COLUMN crm.cliente_tabela_preco.cltb_dtfim IS
    'Data Final da Vigência da Tabela de Preços';

COMMENT ON COLUMN crm.cliente_tabela_preco.cltb_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.cliente_tabela_preco.cltb_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.cliente_tabela_preco.cltb_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.cliente_tabela_preco ADD CONSTRAINT cliente_tabela_preco_pk PRIMARY KEY ( cltb_id );

CREATE TABLE crm.codigo_barras_tipo (
    cbtp_id              BIGSERIAL NOT NULL,
    cbtp_nmtipo          VARCHAR(50),
    cbtp_tmcriado_em     TIMESTAMP,
    cbtp_tmatualizado_em TIMESTAMP,
    cbtp_icativo         BOOLEAN
);

COMMENT ON COLUMN crm.codigo_barras_tipo.cbtp_id IS
    'Indicador de Registro Ativo';

COMMENT ON COLUMN crm.codigo_barras_tipo.cbtp_nmtipo IS
    'Nome do Tipo de Código de Barras:
- EAN13
- EAN8
- UPC
- CODE128
- CODE39
- INTERNO';

COMMENT ON COLUMN crm.codigo_barras_tipo.cbtp_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.codigo_barras_tipo.cbtp_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.codigo_barras_tipo.cbtp_icativo IS
    'prcb_icativo';

ALTER TABLE crm.codigo_barras_tipo ADD CONSTRAINT codigo_barras_tipo_pk PRIMARY KEY ( cbtp_id );

CREATE TABLE crm.condicao_pagamento (
    cndp_id                   BIGSERIAL NOT NULL,
    cndp_dscondicao_pagamento VARCHAR(255),
    cndp_condicao_pagamento   VARCHAR(255),
    cndp_tmcriado_em          TIMESTAMP,
    cndp_tmatualizado_em      TIMESTAMP,
    cndp_icativo              BOOLEAN
);

COMMENT ON COLUMN crm.condicao_pagamento.cndp_dscondicao_pagamento IS
    'Descrição Condição Pagamento';

COMMENT ON COLUMN crm.condicao_pagamento.cndp_condicao_pagamento IS
    'Formatação da condição de pagamento.';

COMMENT ON COLUMN crm.condicao_pagamento.cndp_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.condicao_pagamento.cndp_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.condicao_pagamento.cndp_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.condicao_pagamento ADD CONSTRAINT condicao_pagamento_pk PRIMARY KEY ( cndp_id );

CREATE TABLE crm.empresa (
    emp_id BIGSERIAL NOT NULL
);

COMMENT ON COLUMN crm.empresa.emp_id IS
    'Id. Empresa';

ALTER TABLE crm.empresa ADD CONSTRAINT empresa_pk PRIMARY KEY ( emp_id );

CREATE TABLE crm.empresa_localizacao (
    emlc_id              BIGSERIAL NOT NULL,
    emp_id               BIGINT,
    emlc_nmlocalizacao   VARCHAR(255),
    lctp_id              BIGINT,
    emlc_tmcriado_em     TIMESTAMP,
    emlc_tmatualizado_em TIMESTAMP,
    emlc_icativo         BOOLEAN
);

COMMENT ON COLUMN crm.empresa_localizacao.emlc_id IS
    'Id. Empresa Localização';

COMMENT ON COLUMN crm.empresa_localizacao.emp_id IS
    'Id. da Empresa';

COMMENT ON COLUMN crm.empresa_localizacao.emlc_nmlocalizacao IS
    'Nome da Localização';

COMMENT ON COLUMN crm.empresa_localizacao.lctp_id IS
    'Id. Localização Tipo';

COMMENT ON COLUMN crm.empresa_localizacao.emlc_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.empresa_localizacao.emlc_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.empresa_localizacao.emlc_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.empresa_localizacao ADD CONSTRAINT empresa_localizacao_pk PRIMARY KEY ( emlc_id );

CREATE TABLE crm.entidade_tipo (
    entp_id              BIGSERIAL NOT NULL,
    entp_dsentidade_tipo VARCHAR(255),
    entp_tmcriado_em     TIMESTAMP,
    entp_tmatualizado_em TIMESTAMP,
    entp_icativo         BOOLEAN
);

COMMENT ON COLUMN crm.entidade_tipo.entp_dsentidade_tipo IS
    'Descrição da Entidade Tipo:
 - PRODUTO
 - CLIENTE
 - VISITA
 - COMPROVANTE';

COMMENT ON COLUMN crm.entidade_tipo.entp_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.entidade_tipo.entp_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.entidade_tipo.entp_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.entidade_tipo ADD CONSTRAINT entidade_tipo_pk PRIMARY KEY ( entp_id );

CREATE TABLE crm.forma_pagamento (
    fpag_id                BIGSERIAL NOT NULL,
    fpag_dsforma_pagamento VARCHAR(255),
    fpag_tmcriado_em       TIMESTAMP,
    fpag_tmatualizado_em   TIMESTAMP,
    fpag_icativo           BOOLEAN
);

COMMENT ON COLUMN crm.forma_pagamento.fpag_dsforma_pagamento IS
    'Descrição da Forma de Pagamento:
 - DINHEIRO
 - PIX
 - CARTAO_CREDITO
 - CARTAO_DEBITO
 - PRAZO';

COMMENT ON COLUMN crm.forma_pagamento.fpag_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.forma_pagamento.fpag_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.forma_pagamento.fpag_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.forma_pagamento ADD CONSTRAINT forma_pagamento_pk PRIMARY KEY ( fpag_id );

CREATE TABLE crm.fotos (
    foto_id              BIGSERIAL NOT NULL,
    entp_id              BIGINT,
    vend_id              BIGINT,
    foto_nmarquivo       VARCHAR(255),
    foto_path            VARCHAR(255),
    foto_vllatitude      NUMERIC(10, 8),
    foto_vllongitude     NUMERIC(10, 8),
    foto_icsincronizado  BOOLEAN,
    foto_tmcriado_em     TIMESTAMP,
    foto_tmatualizado_em TIMESTAMP,
    foto_icativo         BOOLEAN
);

COMMENT ON COLUMN crm.fotos.entp_id IS
    'Id. Entidade Tipo';

COMMENT ON COLUMN crm.fotos.vend_id IS
    'Id. Vendedor';

COMMENT ON COLUMN crm.fotos.foto_nmarquivo IS
    'Nome do Arquivo';

COMMENT ON COLUMN crm.fotos.foto_path IS
    'Caminho da Imagem';

COMMENT ON COLUMN crm.fotos.foto_vllatitude IS
    'Latitude';

COMMENT ON COLUMN crm.fotos.foto_vllongitude IS
    'Longitude';

COMMENT ON COLUMN crm.fotos.foto_icsincronizado IS
    'Imagem já sincronizada/enviada?';

COMMENT ON COLUMN crm.fotos.foto_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.fotos.foto_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.fotos.foto_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.fotos ADD CONSTRAINT fotos_pk PRIMARY KEY ( foto_id );

CREATE TABLE crm.localizacao_tipo (
    lctp_id                 BIGSERIAL NOT NULL,
    lctp_dslocalizacao_tipo VARCHAR(255),
    lctp_tmcriado_em        TIMESTAMP,
    lctp_tmatualizado_em    TIMESTAMP,
    lctp_icativo            BOOLEAN
);

COMMENT ON TABLE crm.localizacao_tipo IS
    'Localização Tipo:
- ARMAZEM
- LOJA
- CENTRO_DISTRIBUICAO
- FABRICA';

COMMENT ON COLUMN crm.localizacao_tipo.lctp_dslocalizacao_tipo IS
    'Descrição Localização Tipo';

COMMENT ON COLUMN crm.localizacao_tipo.lctp_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.localizacao_tipo.lctp_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.localizacao_tipo.lctp_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.localizacao_tipo ADD CONSTRAINT localizacao_tipo_pk PRIMARY KEY ( lctp_id );

CREATE TABLE crm.pedido (
    pedi_id                 BIGSERIAL NOT NULL,
    pedi_nnpedido           VARCHAR(20),
    clie_id                 BIGINT,
    vend_id                 BIGINT,
    pstp_id                 BIGINT,
    pedi_dtpedido           TIMESTAMP,
    pedi_dtentrega_prevista DATE,
    pedi_observacao         TEXT,
    pedi_vlsubtotal         NUMERIC(15, 2),
    pedi_per_desconto       NUMERIC(5, 2),
    pedi_vldesconto         NUMERIC(15, 2),
    pedi_vlfrete            NUMERIC(15, 2),
    pedi_vltotal            NUMERIC(15, 2),
    fpag_id                 BIGINT,
    cndp_id                 BIGINT,
    pedi_nnlatitude         NUMERIC(10, 8),
    pedi_nnlongitude        NUMERIC(10, 8),
    pedi_icsincronizado     BOOLEAN,
    pedi_iccriado_offline   BOOLEAN,
    pedi_uuid_offline       VARCHAR(200),
    pedi_tmcriado_em        TIMESTAMP,
    pedi_tmatualizado_em    TIMESTAMP,
    pedi_icativo            BOOLEAN
);

COMMENT ON COLUMN crm.pedido.pedi_nnpedido IS
    'Número do Pedido';

COMMENT ON COLUMN crm.pedido.clie_id IS
    'Id. do Cliente';

COMMENT ON COLUMN crm.pedido.vend_id IS
    'Id. do Vendedor';

COMMENT ON COLUMN crm.pedido.pstp_id IS
    'Id. Status do Pedido';

COMMENT ON COLUMN crm.pedido.pedi_dtpedido IS
    'Dados do Pedido - Data/Hora do Pedido';

COMMENT ON COLUMN crm.pedido.pedi_dtentrega_prevista IS
    'Dados do Pedido - Data de Entrega Prevista';

COMMENT ON COLUMN crm.pedido.pedi_observacao IS
    'Dados do Pedido - Observação sobre o Pedido';

COMMENT ON COLUMN crm.pedido.pedi_vlsubtotal IS
    'Valores - Subtotal';

COMMENT ON COLUMN crm.pedido.pedi_per_desconto IS
    'Valores - Desconto Percentual';

COMMENT ON COLUMN crm.pedido.pedi_vldesconto IS
    'Valores - Valor Desconto ';

COMMENT ON COLUMN crm.pedido.pedi_vlfrete IS
    'Valores - Valor Frete ';

COMMENT ON COLUMN crm.pedido.pedi_vltotal IS
    'Valores - Valor Total';

COMMENT ON COLUMN crm.pedido.fpag_id IS
    'Id. Forma Pagamento';

COMMENT ON COLUMN crm.pedido.cndp_id IS
    'Id. Condição Pagamento';

COMMENT ON COLUMN crm.pedido.pedi_nnlatitude IS
    'Localização - Latitude';

COMMENT ON COLUMN crm.pedido.pedi_nnlongitude IS
    'Localização - Longitude';

COMMENT ON COLUMN crm.pedido.pedi_icsincronizado IS
    'Sincronização - Indicador de Sincronizado com o servidor';

COMMENT ON COLUMN crm.pedido.pedi_iccriado_offline IS
    'Sincronização - Indicador de Criado em modo Offline';

COMMENT ON COLUMN crm.pedido.pedi_uuid_offline IS
    'Sincronização - Id. criado automaticamente';

COMMENT ON COLUMN crm.pedido.pedi_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.pedido.pedi_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.pedido.pedi_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.pedido ADD CONSTRAINT pedidos_pk PRIMARY KEY ( pedi_id );

CREATE TABLE crm.pedido_item (
    peit_id               BIGSERIAL NOT NULL,
    pedi_id               BIGINT,
    prod_id               BIGINT,
    peit_qtd_item         NUMERIC(10, 2),
    peit_vlpreco_unitario NUMERIC(15, 2),
    peit_per_desconto     NUMERIC(5, 2),
    peit_vldesconto       NUMERIC(15, 2),
    peit_vltotal          NUMERIC(15, 2),
    peit_tmcriado_em      TIMESTAMP,
    peit_tmatualizado_em  TIMESTAMP,
    peit_icativo          BOOLEAN
);

COMMENT ON COLUMN crm.pedido_item.pedi_id IS
    'Id. do Pedido';

COMMENT ON COLUMN crm.pedido_item.prod_id IS
    'Id. do Produto';

COMMENT ON COLUMN crm.pedido_item.peit_qtd_item IS
    'Quantidade do Item';

COMMENT ON COLUMN crm.pedido_item.peit_vlpreco_unitario IS
    'Preço Unitário do Produto';

COMMENT ON COLUMN crm.pedido_item.peit_per_desconto IS
    'Desconto Percentual';

COMMENT ON COLUMN crm.pedido_item.peit_vldesconto IS
    'Valor Desconto';

COMMENT ON COLUMN crm.pedido_item.peit_vltotal IS
    'Valor Total';

COMMENT ON COLUMN crm.pedido_item.peit_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.pedido_item.peit_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.pedido_item.peit_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.pedido_item ADD CONSTRAINT pedido_item_pk PRIMARY KEY ( peit_id );

CREATE TABLE crm.pedido_status_tipo (
    pstp_id              BIGINT NOT NULL,
    pstp_dsstatus_tipo   VARCHAR(255),
    pstp_tmcriado_em     TIMESTAMP,
    pstp_tmatualizado_em TIMESTAMP,
    pstp_icativo         BOOLEAN
);

COMMENT ON COLUMN crm.pedido_status_tipo.pstp_dsstatus_tipo IS
    'Descrição do Pedido Status Tipo:
 - RASCUNHO
 - PENDENTE
 - APROVADO
 - FATURADO
 - ENTREGUE
 - CANCELADO';

COMMENT ON COLUMN crm.pedido_status_tipo.pstp_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.pedido_status_tipo.pstp_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.pedido_status_tipo.pstp_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.pedido_status_tipo ADD CONSTRAINT pedido_status_tipo_pk PRIMARY KEY ( pstp_id );

CREATE TABLE crm.produto (
    prod_id                   BIGSERIAL NOT NULL,
    prod_nmproduto            VARCHAR(255),
    prod_dsproduto            TEXT,
    unmd_id                   BIGINT,
    grup_id                   BIGINT,
    subg_id                   BIGINT,
    prod_nnpeso_liquido       NUMERIC(10, 3),
    prod_nmmarca              VARCHAR(255),
    prod_nmfornecedor         VARCHAR(255),
    prod_per_aliquota_icms    NUMERIC(10, 2),
    prod_per_aliquota_ipi     NUMERIC(10, 2),
    prod_dimesao_altura       NUMERIC(10, 3),
    prod_dimesao_largura      NUMERIC(10, 3),
    prod_dimesao_profundidade NUMERIC(10, 3),
    prod_vlpreco_custo        NUMERIC(15, 2),
    prod_vlpreco_sugerido     NUMERIC(15, 2),
    prod_vlmargem_minima      NUMERIC(5, 2),
    prod_qtd_disponivel       NUMERIC(10, 2),
    prod_qtd_reservada        NUMERIC(10, 2),
    prod_tmcriado_em          TIMESTAMP,
    prod_tmatualizado_em      TIMESTAMP,
    prod_icativo              BOOLEAN
);

COMMENT ON COLUMN crm.produto.prod_nmproduto IS
    'Nome do Produto';

COMMENT ON COLUMN crm.produto.prod_dsproduto IS
    'Descrição do Produto';

COMMENT ON COLUMN crm.produto.unmd_id IS
    'Id. Unidade de Medida';

COMMENT ON COLUMN crm.produto.grup_id IS
    'Id. Grupo';

COMMENT ON COLUMN crm.produto.subg_id IS
    'Id. Subgrupo';

COMMENT ON COLUMN crm.produto.prod_nnpeso_liquido IS
    'Peso Líquido do Produto';

COMMENT ON COLUMN crm.produto.prod_nmmarca IS
    'Nome da Marca';

COMMENT ON COLUMN crm.produto.prod_nmfornecedor IS
    'Nome do Fornecedor';

COMMENT ON COLUMN crm.produto.prod_per_aliquota_icms IS
    'Percentual de Aliquota de ICMS';

COMMENT ON COLUMN crm.produto.prod_per_aliquota_ipi IS
    'Percentual de Aliquota de IPI';

COMMENT ON COLUMN crm.produto.prod_dimesao_altura IS
    'Dimensão - Altrua';

COMMENT ON COLUMN crm.produto.prod_dimesao_largura IS
    'Dimensão - Largura';

COMMENT ON COLUMN crm.produto.prod_dimesao_profundidade IS
    'Dimensão - Profundidade';

COMMENT ON COLUMN crm.produto.prod_vlpreco_custo IS
    'Preço de Custo';

COMMENT ON COLUMN crm.produto.prod_vlpreco_sugerido IS
    'Preço Sugerido';

COMMENT ON COLUMN crm.produto.prod_vlmargem_minima IS
    'Margem Mínima';

COMMENT ON COLUMN crm.produto.prod_qtd_disponivel IS
    'Quantidade de Disponível';

COMMENT ON COLUMN crm.produto.prod_qtd_reservada IS
    'Quantidade Reservada';

COMMENT ON COLUMN crm.produto.prod_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.produto.prod_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.produto.prod_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.produto ADD CONSTRAINT produto_pk PRIMARY KEY ( prod_id );

CREATE TABLE crm.produto_codigo_barras (
    prcb_id              BIGSERIAL NOT NULL,
    prod_id              BIGINT,
    cbtp_id              BIGINT,
    prcb_cdbarras        VARCHAR(50),
    prcb_icprincipal     BOOLEAN,
    prcb_tmcriado_em     TIMESTAMP,
    prcb_tmatualizado_em TIMESTAMP,
    prcb_icativo         BOOLEAN
);

COMMENT ON COLUMN crm.produto_codigo_barras.prcb_id IS
    'Id. Chave Primária';

COMMENT ON COLUMN crm.produto_codigo_barras.prod_id IS
    'Id. do Prorduto';

COMMENT ON COLUMN crm.produto_codigo_barras.cbtp_id IS
    'Id. Código de Barras Tipo';

COMMENT ON COLUMN crm.produto_codigo_barras.prcb_cdbarras IS
    'Código de Barras';

COMMENT ON COLUMN crm.produto_codigo_barras.prcb_icprincipal IS
    'Indicador de Código de Barras Principal';

COMMENT ON COLUMN crm.produto_codigo_barras.prcb_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.produto_codigo_barras.prcb_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.produto_codigo_barras.prcb_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.produto_codigo_barras ADD CONSTRAINT produto_codigo_barra_pk PRIMARY KEY ( prcb_id );

CREATE TABLE crm.produto_estoque_localizacao (
    prel_id                   BIGSERIAL NOT NULL,
    prod_id                   BIGINT,
    emlc_id                   BIGINT,
    prel_cdlocalizacao_fisica VARCHAR(20),
    prel_qtd_disponivel       NUMERIC(10, 2),
    prel_qtd_reservada        NUMERIC(10, 2),
    prel_nnlote               VARCHAR(50),
    prel_dtvalidade           DATE,
    prel_tmcriado_em          TIMESTAMP,
    prel_tmatualizado_em      TIMESTAMP,
    prel_icativo              BOOLEAN
);

COMMENT ON COLUMN crm.produto_estoque_localizacao.prod_id IS
    'Id. do Produto';

COMMENT ON COLUMN crm.produto_estoque_localizacao.emlc_id IS
    'Id. Empresa Localização';

COMMENT ON COLUMN crm.produto_estoque_localizacao.prel_cdlocalizacao_fisica IS
    'Endereço Físico do Produto';

COMMENT ON COLUMN crm.produto_estoque_localizacao.prel_qtd_disponivel IS
    'Quantidade de Disponível';

COMMENT ON COLUMN crm.produto_estoque_localizacao.prel_qtd_reservada IS
    'Quantidade Reservada';

COMMENT ON COLUMN crm.produto_estoque_localizacao.prel_nnlote IS
    'Número do Lote';

COMMENT ON COLUMN crm.produto_estoque_localizacao.prel_dtvalidade IS
    'Data de Validade';

COMMENT ON COLUMN crm.produto_estoque_localizacao.prel_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.produto_estoque_localizacao.prel_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.produto_estoque_localizacao.prel_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.produto_estoque_localizacao ADD CONSTRAINT produto_estoque_localizacao_pk PRIMARY KEY ( prel_id );

CREATE TABLE crm.produto_grupo (
    grup_id              BIGSERIAL NOT NULL,
    grup_dsgrupo         VARCHAR(255),
    grup_tmcriado_em     TIMESTAMP,
    grup_tmatualizado_em TIMESTAMP,
    grup_icativo         BOOLEAN
);

COMMENT ON COLUMN crm.produto_grupo.grup_dsgrupo IS
    'Descrição do Grupo';

COMMENT ON COLUMN crm.produto_grupo.grup_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.produto_grupo.grup_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.produto_grupo.grup_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.produto_grupo ADD CONSTRAINT grupo_pk PRIMARY KEY ( grup_id );

CREATE TABLE crm.produto_precos (
    prdp_id                  BIGSERIAL NOT NULL,
    prod_id                  BIGINT,
    tpre_id                  BIGINT,
    prdp_vlpreco             NUMERIC(15, 2),
    prdp_per_desconto_maximo NUMERIC(5, 2),
    prdp_tmcriado_em         TIMESTAMP,
    prdp_tmatualizado_em     TIMESTAMP,
    prdp_icativo             BOOLEAN
);

COMMENT ON COLUMN crm.produto_precos.prdp_id IS
    'Id.';

COMMENT ON COLUMN crm.produto_precos.prod_id IS
    'Id. Produto';

COMMENT ON COLUMN crm.produto_precos.tpre_id IS
    'Id. Tabela de Preço';

COMMENT ON COLUMN crm.produto_precos.prdp_vlpreco IS
    'Preço do Produto';

COMMENT ON COLUMN crm.produto_precos.prdp_per_desconto_maximo IS
    'Desconto Máximo para o Produto';

COMMENT ON COLUMN crm.produto_precos.prdp_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.produto_precos.prdp_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.produto_precos.prdp_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.produto_precos ADD CONSTRAINT produto_precos_pk PRIMARY KEY ( prdp_id );

CREATE TABLE crm.produto_subgrupo (
    subg_id              BIGSERIAL NOT NULL,
    subg_dssubgrupo      VARCHAR(255),
    subg_tmcriado_em     TIMESTAMP,
    subg_tmatualizado_em TIMESTAMP,
    subg_icativo         BOOLEAN
);

COMMENT ON COLUMN crm.produto_subgrupo.subg_dssubgrupo IS
    'Descrição do Subgrupo';

COMMENT ON COLUMN crm.produto_subgrupo.subg_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.produto_subgrupo.subg_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.produto_subgrupo.subg_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.produto_subgrupo ADD CONSTRAINT subgrupo_pk PRIMARY KEY ( subg_id );

CREATE TABLE crm.produto_unidade_medida (
    unmd_id               BIGSERIAL NOT NULL,
    unmd_dsunidade_medida VARCHAR(255),
    unmd_tmcriado_em      TIMESTAMP,
    unmd_tmatualizado_em  TIMESTAMP,
    unmd_icativo          BOOLEAN
);

COMMENT ON COLUMN crm.produto_unidade_medida.unmd_dsunidade_medida IS
    'Descrição da Unidade de Medida';

COMMENT ON COLUMN crm.produto_unidade_medida.unmd_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.produto_unidade_medida.unmd_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.produto_unidade_medida.unmd_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.produto_unidade_medida ADD CONSTRAINT produto_unidade_medida_pk PRIMARY KEY ( unmd_id );

CREATE TABLE crm.tabela_preco (
    tpre_id              BIGSERIAL NOT NULL,
    tapc_id              BIGINT,
    tpre_nmtabela_preco  VARCHAR(255),
    tpre_dstabela_preco  VARCHAR(255),
    tpre_dtinicio        DATE,
    tpre_dtfim           DATE,
    tpre_tmcriado_em     TIMESTAMP,
    tpre_tmatualizado_em TIMESTAMP,
    tpre_icativo         BOOLEAN
);

COMMENT ON COLUMN crm.tabela_preco.tapc_id IS
    'Id. Tabela de Preço Tipo';

COMMENT ON COLUMN crm.tabela_preco.tpre_nmtabela_preco IS
    'Nome da Tabela de Preço';

COMMENT ON COLUMN crm.tabela_preco.tpre_dstabela_preco IS
    'Descrição da Tabela de Preço';

COMMENT ON COLUMN crm.tabela_preco.tpre_dtinicio IS
    'Data Início da Vigência da Tabela de Preços';

COMMENT ON COLUMN crm.tabela_preco.tpre_dtfim IS
    'Data Final da Vigência da Tabela de Preços';

COMMENT ON COLUMN crm.tabela_preco.tpre_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.tabela_preco.tpre_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.tabela_preco.tpre_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.tabela_preco ADD CONSTRAINT tabela_preco_pk PRIMARY KEY ( tpre_id );

CREATE TABLE crm.tabela_preco_tipo (
    tapc_id                  BIGSERIAL NOT NULL,
    tapc_dstabela_preco_tipo VARCHAR(255),
    tapc_tmcriado_em         TIMESTAMP,
    tapc_tmatualizado_em     TIMESTAMP,
    tapc_icativo             BOOLEAN
);

COMMENT ON COLUMN crm.tabela_preco_tipo.tapc_dstabela_preco_tipo IS
    'Descrição da Tabela de Preço Tipo:
- CLIENTE
- REGIAO
- SEGMENTO
- PROMOCIONAL';

COMMENT ON COLUMN crm.tabela_preco_tipo.tapc_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.tabela_preco_tipo.tapc_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.tabela_preco_tipo.tapc_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.tabela_preco_tipo ADD CONSTRAINT tabela_preco_tipo_pk PRIMARY KEY ( tapc_id );

CREATE TABLE crm.vendedor (
    vend_id                   BIGSERIAL NOT NULL,
    vend_cdvendedor           VARCHAR(20),
    vend_nmvendedor           VARCHAR(255),
    vend_nncpf                VARCHAR(20),
    vend_dsemail              VARCHAR(255),
    vend_nntelefone           VARCHAR(20),
    vend_vlmeta_mensal        NUMERIC(10, 2),
    vend_per_comissao         NUMERIC(10, 2),
    supv_id                   BIGINT,
    vter_id                   BIGINT,
    vend_tmultimo_sincronizmo TIMESTAMP,
    vend_cddisposito          VARCHAR(255),
    vend_tmcriado_em          TIMESTAMP,
    vend_tmatualizado_em      TIMESTAMP,
    vend_icativo              BOOLEAN
);

COMMENT ON COLUMN crm.vendedor.vend_cdvendedor IS
    'Código do Vendedor';

COMMENT ON COLUMN crm.vendedor.vend_nmvendedor IS
    'Nome do Vendedor';

COMMENT ON COLUMN crm.vendedor.vend_nncpf IS
    'Número do CPF';

COMMENT ON COLUMN crm.vendedor.vend_dsemail IS
    'E-mail principal do Vendedor';

COMMENT ON COLUMN crm.vendedor.vend_nntelefone IS
    'Número do Telefone do Vendedor';

COMMENT ON COLUMN crm.vendedor.vend_vlmeta_mensal IS
    'Valor Meta Mensal';

COMMENT ON COLUMN crm.vendedor.vend_per_comissao IS
    'Percentual de Comissão';

COMMENT ON COLUMN crm.vendedor.supv_id IS
    'Id. Supervisor Responsável pelo Vendedor';

COMMENT ON COLUMN crm.vendedor.vter_id IS
    'Id. Território ';

COMMENT ON COLUMN crm.vendedor.vend_tmultimo_sincronizmo IS
    'Data/Hora Último Sincronismo entre Dispositovo com Servidor';

COMMENT ON COLUMN crm.vendedor.vend_cddisposito IS
    'Id. do Dispositovo Móvel
 - IMEI
 - UUID do Dispositivo';

COMMENT ON COLUMN crm.vendedor.vend_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.vendedor.vend_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.vendedor.vend_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.vendedor ADD CONSTRAINT vendedor_pk PRIMARY KEY ( vend_id );

CREATE TABLE crm.vendedor_metas (
    vdme_id                           BIGSERIAL NOT NULL,
    vend_id                           BIGINT,
    vdme_ano                          INTEGER,
    vdme_mes                          INTEGER,
    vdme_vlmeta                       NUMERIC(15, 2),
    vdme_qtd_pedidos                  INTEGER,
    vdme_qtd_clientes_novos           INTEGER,
    vdme_vlatingido                   NUMERIC(15, 2),
    vdme_qtd_pedidos_atinigidos       INTEGER,
    vdme_qtd_clientes_novos_atingidos INTEGER,
    vdme_vlcomissao_calculada         NUMERIC(15, 2),
    vdme_tmcriado_em                  TIMESTAMP,
    vdme_tmatualizado_em              TIMESTAMP,
    vdme_icativo                      BOOLEAN
);

COMMENT ON COLUMN crm.vendedor_metas.vend_id IS
    'Id. do Vendedor';

COMMENT ON COLUMN crm.vendedor_metas.vdme_ano IS
    'Ano da Meta';

COMMENT ON COLUMN crm.vendedor_metas.vdme_mes IS
    'Mês da Meta';

COMMENT ON COLUMN crm.vendedor_metas.vdme_vlmeta IS
    'Meta - Valor';

COMMENT ON COLUMN crm.vendedor_metas.vdme_qtd_pedidos IS
    'Meta - Quantidade de Pedidos';

COMMENT ON COLUMN crm.vendedor_metas.vdme_qtd_clientes_novos IS
    'Meta - Quantidade de Clientes Novos';

COMMENT ON COLUMN crm.vendedor_metas.vdme_vlatingido IS
    'Valor Atingido';

COMMENT ON COLUMN crm.vendedor_metas.vdme_qtd_pedidos_atinigidos IS
    ' Quantidade de Pedidos Atingidos';

COMMENT ON COLUMN crm.vendedor_metas.vdme_qtd_clientes_novos_atingidos IS
    'Quantidade de Clientes Novos Atingidos';

COMMENT ON COLUMN crm.vendedor_metas.vdme_vlcomissao_calculada IS
    'Valor da Comissão Calculada';

COMMENT ON COLUMN crm.vendedor_metas.vdme_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.vendedor_metas.vdme_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.vendedor_metas.vdme_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.vendedor_metas ADD CONSTRAINT vendedor_metas_pk PRIMARY KEY ( vdme_id );

CREATE TABLE crm.vendedor_supervisor (
    supv_id              BIGSERIAL NOT NULL,
    supv_nmsupervisor    VARCHAR(255),
    supv_tmcriado_em     TIMESTAMP,
    supv_tmatualizado_em TIMESTAMP,
    supv_icativo         BOOLEAN
);

COMMENT ON COLUMN crm.vendedor_supervisor.supv_nmsupervisor IS
    'Nome do Supervisor';

COMMENT ON COLUMN crm.vendedor_supervisor.supv_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.vendedor_supervisor.supv_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.vendedor_supervisor.supv_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.vendedor_supervisor ADD CONSTRAINT vendedor_supervisor_pk PRIMARY KEY ( supv_id );

CREATE TABLE crm.vendedor_territorio (
    vter_id                   BIGSERIAL NOT NULL,
    supv_id                   BIGINT,
    vter_nmterritorio         VARCHAR(255),
    vter_dsterritorio         VARCHAR(255),
    vter_nmregiao             VARCHAR(100),
    vter_cdestado             VARCHAR(2),
    vter_coordenadas_poligono TEXT,
    vter_tmcriado_em          TIMESTAMP,
    vter_tmatualizado_em      TIMESTAMP,
    vter_icativo              BOOLEAN
);

COMMENT ON COLUMN crm.vendedor_territorio.supv_id IS
    'Supervisor Responsável por esse Território';

COMMENT ON COLUMN crm.vendedor_territorio.vter_nmterritorio IS
    'Nome do Território de Venda';

COMMENT ON COLUMN crm.vendedor_territorio.vter_dsterritorio IS
    'Descrição do Território';

COMMENT ON COLUMN crm.vendedor_territorio.vter_nmregiao IS
    'Nome da Região';

COMMENT ON COLUMN crm.vendedor_territorio.vter_cdestado IS
    'Estado';

COMMENT ON COLUMN crm.vendedor_territorio.vter_coordenadas_poligono IS
    'Coordenada Poligono';

COMMENT ON COLUMN crm.vendedor_territorio.vter_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.vendedor_territorio.vter_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.vendedor_territorio.vter_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.vendedor_territorio ADD CONSTRAINT vendedor_territorio_pk PRIMARY KEY ( vter_id );

CREATE TABLE crm.vendedor_territorio_cidade (
    vtcd_id              BIGSERIAL NOT NULL,
    vter_id              BIGINT,
    vtcd_nmcidade        VARCHAR(25),
    vtcd_tmcriado_em     TIMESTAMP,
    vtcd_tmatualizado_em TIMESTAMP,
    vtcd_icativo         BOOLEAN
);

COMMENT ON COLUMN crm.vendedor_territorio_cidade.vter_id IS
    'Id. Territorio';

COMMENT ON COLUMN crm.vendedor_territorio_cidade.vtcd_nmcidade IS
    'Nome da Cidade';

COMMENT ON COLUMN crm.vendedor_territorio_cidade.vtcd_tmcriado_em IS
    'Data/Hora de Criação do Registro';

COMMENT ON COLUMN crm.vendedor_territorio_cidade.vtcd_tmatualizado_em IS
    'Data/Hora da Última Atualização';

COMMENT ON COLUMN crm.vendedor_territorio_cidade.vtcd_icativo IS
    'Indicador de Registro Ativo';

ALTER TABLE crm.vendedor_territorio_cidade ADD CONSTRAINT vendedor_territorio_cidade_pk PRIMARY KEY ( vtcd_id );

ALTER TABLE crm.agenda_visita
    ADD CONSTRAINT xfk1_agenda_visita FOREIGN KEY ( agst_id )
        REFERENCES crm.agenda_visita_status ( agst_id );

ALTER TABLE crm.agenda_visita_checkins
    ADD CONSTRAINT xfk1_agenda_visita_checkins FOREIGN KEY ( avis_id )
        REFERENCES crm.agenda_visita ( avis_id );

ALTER TABLE crm.agenda_visita_checkins
    ADD CONSTRAINT xfk2_agenda_visita_checkins FOREIGN KEY ( chtp_id )
        REFERENCES crm.checkins_tipo ( chtp_id );

ALTER TABLE crm.agenda_visita_checkins
    ADD CONSTRAINT xfk3_agenda_visita_checkins FOREIGN KEY ( clie_id )
        REFERENCES crm.cliente ( clie_id );

ALTER TABLE crm.agenda_visita_checkins
    ADD CONSTRAINT xfk4_agenda_visita_checkins FOREIGN KEY ( vend_id )
        REFERENCES crm.vendedor ( vend_id );

ALTER TABLE crm.agenda_visita
    ADD CONSTRAINT xfk2_agenda_visita FOREIGN KEY ( clie_id )
        REFERENCES crm.cliente ( clie_id );

ALTER TABLE crm.agenda_visita
    ADD CONSTRAINT xfk3_agenda_visita FOREIGN KEY ( pedi_id )
        REFERENCES crm.pedido ( pedi_id );

ALTER TABLE crm.agenda_visita
    ADD CONSTRAINT xfk4_agenda_visita FOREIGN KEY ( vend_id )
        REFERENCES crm.vendedor ( vend_id );

ALTER TABLE crm.cliente_tabela_preco
    ADD CONSTRAINT xkf1_cliente_tabela_preco FOREIGN KEY ( clie_id )
        REFERENCES crm.cliente ( clie_id );

ALTER TABLE crm.cliente_tabela_preco
    ADD CONSTRAINT xkf2_cliente_tabela_preco FOREIGN KEY ( tpre_id )
        REFERENCES crm.tabela_preco ( tpre_id );

ALTER TABLE crm.cliente
    ADD CONSTRAINT xfk1_cliente FOREIGN KEY ( vend_id )
        REFERENCES crm.vendedor ( vend_id );

ALTER TABLE crm.empresa_localizacao
    ADD CONSTRAINT xfk1_empresa_localizacao FOREIGN KEY ( emp_id )
        REFERENCES crm.empresa ( emp_id );

--  ERROR: FK name length exceeds maximum allowed length(30)
ALTER TABLE crm.empresa_localizacao
    ADD CONSTRAINT xfk2_empresa_localizacao FOREIGN KEY ( lctp_id )
        REFERENCES crm.localizacao_tipo ( lctp_id );

ALTER TABLE crm.fotos
    ADD CONSTRAINT xfk1_fotos FOREIGN KEY ( entp_id )
        REFERENCES crm.entidade_tipo ( entp_id );

ALTER TABLE crm.fotos
    ADD CONSTRAINT xfk2_fotos FOREIGN KEY ( vend_id )
        REFERENCES crm.vendedor ( vend_id );

ALTER TABLE crm.pedido_item
    ADD CONSTRAINT xkf1_pedido_item FOREIGN KEY ( pedi_id )
        REFERENCES crm.pedido ( pedi_id );

ALTER TABLE crm.pedido_item
    ADD CONSTRAINT xkf2_pedido_item FOREIGN KEY ( prod_id )
        REFERENCES crm.produto ( prod_id );

ALTER TABLE crm.pedido
    ADD CONSTRAINT xfk1_pedido FOREIGN KEY ( clie_id )
        REFERENCES crm.cliente ( clie_id );

ALTER TABLE crm.pedido
    ADD CONSTRAINT xfk2_pedido FOREIGN KEY ( cndp_id )
        REFERENCES crm.condicao_pagamento ( cndp_id );

ALTER TABLE crm.pedido
    ADD CONSTRAINT xfk3_pedido FOREIGN KEY ( fpag_id )
        REFERENCES crm.forma_pagamento ( fpag_id );

ALTER TABLE crm.pedido
    ADD CONSTRAINT xfk4_pedido FOREIGN KEY ( pstp_id )
        REFERENCES crm.pedido_status_tipo ( pstp_id );

ALTER TABLE crm.pedido
    ADD CONSTRAINT xfk5_pedido FOREIGN KEY ( vend_id )
        REFERENCES crm.vendedor ( vend_id );

ALTER TABLE crm.produto_codigo_barras
    ADD CONSTRAINT xkf1_produto_codigo_barras FOREIGN KEY ( prod_id )
        REFERENCES crm.produto ( prod_id );

ALTER TABLE crm.produto_codigo_barras
    ADD CONSTRAINT xkf2_produto_codigo_barras FOREIGN KEY ( cbtp_id )
        REFERENCES crm.codigo_barras_tipo ( cbtp_id );

ALTER TABLE crm.produto_estoque_localizacao
    ADD CONSTRAINT xfk1_produto_estoque_localizacao FOREIGN KEY ( emlc_id )
        REFERENCES crm.empresa_localizacao ( emlc_id );

ALTER TABLE crm.produto_estoque_localizacao
    ADD CONSTRAINT xfk2_produto_estoque_localizacao FOREIGN KEY ( prod_id )
        REFERENCES crm.produto ( prod_id );

ALTER TABLE crm.produto
    ADD CONSTRAINT xfk1_produto FOREIGN KEY ( grup_id )
        REFERENCES crm.produto_grupo ( grup_id );

ALTER TABLE crm.produto_precos
    ADD CONSTRAINT xfk1_produto_precos FOREIGN KEY ( prod_id )
        REFERENCES crm.produto ( prod_id );

ALTER TABLE crm.produto_precos
    ADD CONSTRAINT xfk2_produto_precos FOREIGN KEY ( tpre_id )
        REFERENCES crm.tabela_preco ( tpre_id );

ALTER TABLE crm.produto
    ADD CONSTRAINT xfk3_produto FOREIGN KEY ( unmd_id )
        REFERENCES crm.produto_unidade_medida ( unmd_id );

ALTER TABLE crm.produto
    ADD CONSTRAINT xfk4_produto FOREIGN KEY ( subg_id )
        REFERENCES crm.produto_subgrupo ( subg_id );

ALTER TABLE crm.tabela_preco
    ADD CONSTRAINT xfk1_tabela_preco FOREIGN KEY ( tapc_id )
        REFERENCES crm.tabela_preco_tipo ( tapc_id );

ALTER TABLE crm.vendedor_metas
    ADD CONSTRAINT xfk1_vendedor_metas FOREIGN KEY ( vend_id )
        REFERENCES crm.vendedor ( vend_id );

ALTER TABLE crm.vendedor_territorio_cidade
    ADD CONSTRAINT xfk1_vendedor_territorio_cidade FOREIGN KEY ( vter_id )
        REFERENCES crm.vendedor_territorio ( vter_id );

ALTER TABLE crm.vendedor_territorio
    ADD CONSTRAINT xfk2_vendedor_territorio_cidade FOREIGN KEY ( supv_id )
        REFERENCES crm.vendedor_supervisor ( supv_id );

ALTER TABLE crm.vendedor
    ADD CONSTRAINT xfk1_vendedor FOREIGN KEY ( supv_id )
        REFERENCES crm.vendedor_supervisor ( supv_id );

ALTER TABLE crm.vendedor
    ADD CONSTRAINT xfk2_vendedor FOREIGN KEY ( vter_id )
        REFERENCES crm.vendedor_territorio ( vter_id );
