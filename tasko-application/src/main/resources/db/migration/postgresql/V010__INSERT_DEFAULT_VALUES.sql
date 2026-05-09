-- Pendente
-- ↓
-- Confirmada
-- ↓
-- Em atendimento
-- ↓
-- Concluída
-- ├→ Follow-up
-- └→ Encerrada

INSERT INTO crm.agenda_visita_status
(agst_id, agst_dsvisita_status, agst_tmcriado_em, agst_tmatualizado_em, agst_icativo)
VALUES (1, 'Pendente', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.agenda_visita_status
(agst_id, agst_dsvisita_status, agst_tmcriado_em, agst_tmatualizado_em, agst_icativo)
VALUES (2, 'Confirmada', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.agenda_visita_status
(agst_id, agst_dsvisita_status, agst_tmcriado_em, agst_tmatualizado_em, agst_icativo)
VALUES (3, 'Em atendimento', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.agenda_visita_status
(agst_id, agst_dsvisita_status, agst_tmcriado_em, agst_tmatualizado_em, agst_icativo)
VALUES (4, 'Concluída', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.agenda_visita_status
(agst_id, agst_dsvisita_status, agst_tmcriado_em, agst_tmatualizado_em, agst_icativo)
VALUES (5, 'Follow-up', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.agenda_visita_status
(agst_id, agst_dsvisita_status, agst_tmcriado_em, agst_tmatualizado_em, agst_icativo)
VALUES (6, 'Cancelada', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.agenda_visita_status
(agst_id, agst_dsvisita_status, agst_tmcriado_em, agst_tmatualizado_em, agst_icativo)
VALUES (7, 'Não realizada', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);


-- Tipo de Check-in
INSERT INTO crm.checkins_tipo
(chtp_id, chtp_dscheckin_tipo, chtp_tmcriado_em, chtp_tmatualizado_em, chtp_icativo)
VALUES (1, 'Check-in', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.checkins_tipo
(chtp_id, chtp_dscheckin_tipo, chtp_tmcriado_em, chtp_tmatualizado_em, chtp_icativo)
VALUES (2, 'Check-out', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.checkins_tipo
(chtp_id, chtp_dscheckin_tipo, chtp_tmcriado_em, chtp_tmatualizado_em, chtp_icativo)
VALUES (3, 'Pausa', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.checkins_tipo
(chtp_id, chtp_dscheckin_tipo, chtp_tmcriado_em, chtp_tmatualizado_em, chtp_icativo)
VALUES (4, 'Retorno', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.checkins_tipo
(chtp_id, chtp_dscheckin_tipo, chtp_tmcriado_em, chtp_tmatualizado_em, chtp_icativo)
VALUES (5, 'Não localizado', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.checkins_tipo
(chtp_id, chtp_dscheckin_tipo, chtp_tmcriado_em, chtp_tmatualizado_em, chtp_icativo)
VALUES (6, 'Visita cancelada', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.checkins_tipo
(chtp_id, chtp_dscheckin_tipo, chtp_tmcriado_em, chtp_tmatualizado_em, chtp_icativo)
VALUES (7, 'Atendimento remoto', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);


-- Código de Barras Tipo
INSERT INTO crm.codigo_barras_tipo
(cbtp_id, cbtp_nmtipo, cbtp_tmcriado_em, cbtp_tmatualizado_em, cbtp_icativo)
VALUES (1, 'EAN-13', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.codigo_barras_tipo
(cbtp_id, cbtp_nmtipo, cbtp_tmcriado_em, cbtp_tmatualizado_em, cbtp_icativo)
VALUES (2, 'EAN-8', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.codigo_barras_tipo
(cbtp_id, cbtp_nmtipo, cbtp_tmcriado_em, cbtp_tmatualizado_em, cbtp_icativo)
VALUES (3, 'UPC-A', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.codigo_barras_tipo
(cbtp_id, cbtp_nmtipo, cbtp_tmcriado_em, cbtp_tmatualizado_em, cbtp_icativo)
VALUES (4, 'UPC-E', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.codigo_barras_tipo
(cbtp_id, cbtp_nmtipo, cbtp_tmcriado_em, cbtp_tmatualizado_em, cbtp_icativo)
VALUES (5, 'Code 128', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.codigo_barras_tipo
(cbtp_id, cbtp_nmtipo, cbtp_tmcriado_em, cbtp_tmatualizado_em, cbtp_icativo)
VALUES (6, 'Code 39', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.codigo_barras_tipo
(cbtp_id, cbtp_nmtipo, cbtp_tmcriado_em, cbtp_tmatualizado_em, cbtp_icativo)
VALUES (7, 'ITF-14', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.codigo_barras_tipo
(cbtp_id, cbtp_nmtipo, cbtp_tmcriado_em, cbtp_tmatualizado_em, cbtp_icativo)
VALUES (8, 'GS1-128	', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.codigo_barras_tipo
(cbtp_id, cbtp_nmtipo, cbtp_tmcriado_em, cbtp_tmatualizado_em, cbtp_icativo)
VALUES (9, 'QR Code	', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.codigo_barras_tipo
(cbtp_id, cbtp_nmtipo, cbtp_tmcriado_em, cbtp_tmatualizado_em, cbtp_icativo)
VALUES (10, 'Data Matrix	', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.codigo_barras_tipo
(cbtp_id, cbtp_nmtipo, cbtp_tmcriado_em, cbtp_tmatualizado_em, cbtp_icativo)
VALUES (11, 'PDF417', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);


INSERT INTO crm.entidade_tipo
(entp_id, entp_dsentidade_tipo, entp_tmcriado_em, entp_tmatualizado_em, entp_icativo)
VALUES(1, 'Produto', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.entidade_tipo
(entp_id, entp_dsentidade_tipo, entp_tmcriado_em, entp_tmatualizado_em, entp_icativo)
VALUES(2, 'Agenda-Checking', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.entidade_tipo
(entp_id, entp_dsentidade_tipo, entp_tmcriado_em, entp_tmatualizado_em, entp_icativo)
VALUES(3, 'Agenda-Checkout', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.entidade_tipo
(entp_id, entp_dsentidade_tipo, entp_tmcriado_em, entp_tmatualizado_em, entp_icativo)
VALUES(4, 'Cliente', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.entidade_tipo
(entp_id, entp_dsentidade_tipo, entp_tmcriado_em, entp_tmatualizado_em, entp_icativo)
VALUES(5, 'Vendedor', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.entidade_tipo
(entp_id, entp_dsentidade_tipo, entp_tmcriado_em, entp_tmatualizado_em, entp_icativo)
VALUES(6, 'Pedido', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);


-- Formas de Pagamento
INSERT INTO crm.forma_pagamento
(fpag_id, fpag_dsforma_pagamento, fpag_tmcriado_em, fpag_tmatualizado_em, fpag_icativo)
VALUES (1, 'Dinheiro', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.forma_pagamento
(fpag_id, fpag_dsforma_pagamento, fpag_tmcriado_em, fpag_tmatualizado_em, fpag_icativo)
VALUES (2, 'PIX', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.forma_pagamento
(fpag_id, fpag_dsforma_pagamento, fpag_tmcriado_em, fpag_tmatualizado_em, fpag_icativo)
VALUES (3, 'Cartão de crédito', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.forma_pagamento
(fpag_id, fpag_dsforma_pagamento, fpag_tmcriado_em, fpag_tmatualizado_em, fpag_icativo)
VALUES (4, 'Cartão de débito', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.forma_pagamento
(fpag_id, fpag_dsforma_pagamento, fpag_tmcriado_em, fpag_tmatualizado_em, fpag_icativo)
VALUES (5, 'Fatura', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.forma_pagamento
(fpag_id, fpag_dsforma_pagamento, fpag_tmcriado_em, fpag_tmatualizado_em, fpag_icativo)
VALUES (6, 'Boleto', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.forma_pagamento
(fpag_id, fpag_dsforma_pagamento, fpag_tmcriado_em, fpag_tmatualizado_em, fpag_icativo)
VALUES (7, 'Transferência bancária', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.forma_pagamento
(fpag_id, fpag_dsforma_pagamento, fpag_tmcriado_em, fpag_tmatualizado_em, fpag_icativo)
VALUES (8, 'Multibanco', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);


-- Localização Tipo
INSERT INTO crm.localizacao_tipo
(lctp_id, lctp_dslocalizacao_tipo, lctp_tmcriado_em, lctp_tmatualizado_em, lctp_icativo)
VALUES (1, 'Armazém', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.localizacao_tipo
(lctp_id, lctp_dslocalizacao_tipo, lctp_tmcriado_em, lctp_tmatualizado_em, lctp_icativo)
VALUES (2, 'Picking', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.localizacao_tipo
(lctp_id, lctp_dslocalizacao_tipo, lctp_tmcriado_em, lctp_tmatualizado_em, lctp_icativo)
VALUES (3, 'Recebimento', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.localizacao_tipo
(lctp_id, lctp_dslocalizacao_tipo, lctp_tmcriado_em, lctp_tmatualizado_em, lctp_icativo)
VALUES (4, 'Expedição', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.localizacao_tipo
(lctp_id, lctp_dslocalizacao_tipo, lctp_tmcriado_em, lctp_tmatualizado_em, lctp_icativo)
VALUES (5, 'Produção', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.localizacao_tipo
(lctp_id, lctp_dslocalizacao_tipo, lctp_tmcriado_em, lctp_tmatualizado_em, lctp_icativo)
VALUES (6, 'Quarentena', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.localizacao_tipo
(lctp_id, lctp_dslocalizacao_tipo, lctp_tmcriado_em, lctp_tmatualizado_em, lctp_icativo)
VALUES (7, 'Avaria', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.localizacao_tipo
(lctp_id, lctp_dslocalizacao_tipo, lctp_tmcriado_em, lctp_tmatualizado_em, lctp_icativo)
VALUES (8, 'Devolução', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.localizacao_tipo
(lctp_id, lctp_dslocalizacao_tipo, lctp_tmcriado_em, lctp_tmatualizado_em, lctp_icativo)
VALUES(9, 'Trânsito', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.localizacao_tipo
(lctp_id, lctp_dslocalizacao_tipo, lctp_tmcriado_em, lctp_tmatualizado_em, lctp_icativo)
VALUES(10, 'Virtual', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);


-- Pedido Status
INSERT INTO crm.pedido_status_tipo
(pstp_id, pstp_dsstatus_tipo, pstp_tmcriado_em, pstp_tmatualizado_em, pstp_icativo)
VALUES (1, 'Rascunho', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.pedido_status_tipo
(pstp_id, pstp_dsstatus_tipo, pstp_tmcriado_em, pstp_tmatualizado_em, pstp_icativo)
VALUES (2, 'Aberto', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.pedido_status_tipo
(pstp_id, pstp_dsstatus_tipo, pstp_tmcriado_em, pstp_tmatualizado_em, pstp_icativo)
VALUES (3, 'Aprovado', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.pedido_status_tipo
(pstp_id, pstp_dsstatus_tipo, pstp_tmcriado_em, pstp_tmatualizado_em, pstp_icativo)
VALUES (4, 'Em separação', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.pedido_status_tipo
(pstp_id, pstp_dsstatus_tipo, pstp_tmcriado_em, pstp_tmatualizado_em, pstp_icativo)
VALUES (5, 'Faturado', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.pedido_status_tipo
(pstp_id, pstp_dsstatus_tipo, pstp_tmcriado_em, pstp_tmatualizado_em, pstp_icativo)
VALUES (6, 'Em transporte', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.pedido_status_tipo
(pstp_id, pstp_dsstatus_tipo, pstp_tmcriado_em, pstp_tmatualizado_em, pstp_icativo)
VALUES (7, 'Entregue', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.pedido_status_tipo
(pstp_id, pstp_dsstatus_tipo, pstp_tmcriado_em, pstp_tmatualizado_em, pstp_icativo)
VALUES (8, 'Cancelado', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);


-- Tabela de Preco Tipo
INSERT INTO crm.tabela_preco_tipo
(tapc_id, tapc_dstabela_preco_tipo, tapc_tmcriado_em, tapc_tmatualizado_em, tapc_icativo)
VALUES (1, 'Padrão', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.tabela_preco_tipo
(tapc_id, tapc_dstabela_preco_tipo, tapc_tmcriado_em, tapc_tmatualizado_em, tapc_icativo)
VALUES (2, 'Atacado', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.tabela_preco_tipo
(tapc_id, tapc_dstabela_preco_tipo, tapc_tmcriado_em, tapc_tmatualizado_em, tapc_icativo)
VALUES (3, 'Varejo', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.tabela_preco_tipo
(tapc_id, tapc_dstabela_preco_tipo, tapc_tmcriado_em, tapc_tmatualizado_em, tapc_icativo)
VALUES (4, 'Promocional', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.tabela_preco_tipo
(tapc_id, tapc_dstabela_preco_tipo, tapc_tmcriado_em, tapc_tmatualizado_em, tapc_icativo)
VALUES (5, 'VIP', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.tabela_preco_tipo
(tapc_id, tapc_dstabela_preco_tipo, tapc_tmcriado_em, tapc_tmatualizado_em, tapc_icativo)
VALUES (6, 'Revendedor', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.tabela_preco_tipo
(tapc_id, tapc_dstabela_preco_tipo, tapc_tmcriado_em, tapc_tmatualizado_em, tapc_icativo)
VALUES (7, 'E-commerce', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO crm.tabela_preco_tipo
(tapc_id, tapc_dstabela_preco_tipo, tapc_tmcriado_em, tapc_tmatualizado_em, tapc_icativo)
VALUES (8, 'Exportação', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);









