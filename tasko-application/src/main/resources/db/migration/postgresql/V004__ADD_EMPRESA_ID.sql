ALTER TABLE crm.agenda_visita
    ADD COLUMN emp_id BIGINT;

ALTER TABLE crm.cliente
    ADD COLUMN emp_id BIGINT;

ALTER TABLE crm.cliente_tabela_preco
    ADD COLUMN emp_id BIGINT;

ALTER TABLE crm.condicao_pagamento
    ADD COLUMN emp_id BIGINT;

ALTER TABLE crm.forma_pagamento
    ADD COLUMN emp_id BIGINT;

ALTER TABLE crm.fotos
    ADD COLUMN emp_id BIGINT;

ALTER TABLE crm.pedido
    ADD COLUMN emp_id BIGINT;

ALTER TABLE crm.produto
    ADD COLUMN emp_id BIGINT;

ALTER TABLE crm.produto_grupo
    ADD COLUMN emp_id BIGINT;

ALTER TABLE crm.produto_subgrupo
    ADD COLUMN emp_id BIGINT;

ALTER TABLE crm.tabela_preco
    ADD COLUMN emp_id BIGINT;

ALTER TABLE crm.usuario
    ADD COLUMN emp_id BIGINT;

ALTER TABLE crm.vendedor
    ADD COLUMN emp_id BIGINT;

ALTER TABLE crm.vendedor_supervisor
    ADD COLUMN emp_id BIGINT;

-------------------------------------------------------------------------------
-- Adicionaas chaves estrangeiras para garantir a integridade referencial entre as tabelas
-------------------------------------------------------------------------------
ALTER TABLE crm.agenda_visita
    ADD CONSTRAINT xfk5_agenda_visita FOREIGN KEY (emp_id) REFERENCES crm.empresa (emp_id);

ALTER TABLE crm.cliente
    ADD CONSTRAINT xfk2_cliente FOREIGN KEY (emp_id) REFERENCES crm.empresa (emp_id);

ALTER TABLE crm.cliente_tabela_preco
    ADD CONSTRAINT xkf3_cliente_tabela_preco FOREIGN KEY (emp_id) REFERENCES crm.empresa (emp_id);

ALTER TABLE crm.condicao_pagamento
    ADD CONSTRAINT xkf1_condicao_pagamento FOREIGN KEY (emp_id) REFERENCES crm.empresa (emp_id);

ALTER TABLE crm.forma_pagamento
    ADD CONSTRAINT xkf1_forma_pagamento FOREIGN KEY (emp_id) REFERENCES crm.empresa (emp_id);

ALTER TABLE crm.fotos
    ADD CONSTRAINT xkf1_fotos FOREIGN KEY (emp_id) REFERENCES crm.empresa (emp_id);

ALTER TABLE crm.pedido
    ADD CONSTRAINT xfk6_pedido FOREIGN KEY (emp_id) REFERENCES crm.empresa (emp_id);

ALTER TABLE crm.produto
    ADD CONSTRAINT xfk5_produto FOREIGN KEY (emp_id) REFERENCES crm.empresa (emp_id);

ALTER TABLE crm.produto_grupo
    ADD CONSTRAINT xfk1_produto_grupo FOREIGN KEY (emp_id) REFERENCES crm.empresa (emp_id);

ALTER TABLE crm.produto_subgrupo
    ADD CONSTRAINT xfk1_produto_subgrupo FOREIGN KEY (emp_id) REFERENCES crm.empresa (emp_id);

ALTER TABLE crm.tabela_preco
    ADD CONSTRAINT xfk2_tabela_preco FOREIGN KEY (emp_id) REFERENCES crm.empresa (emp_id);

ALTER TABLE crm.usuario
    ADD CONSTRAINT xkf2_usuario_vendedor
        FOREIGN KEY (emp_id) REFERENCES crm.empresa (emp_id);

ALTER TABLE crm.vendedor
    ADD CONSTRAINT xfk3_vendedor
        FOREIGN KEY (emp_id) REFERENCES crm.empresa (emp_id);
