ALTER TABLE crm.usuario
    ADD COLUMN usur_nmcompleto VARCHAR(255);

ALTER TABLE crm.usuario
    ADD COLUMN usur_nmtelefone VARCHAR(255);


COMMENT ON COLUMN crm.usuario.usur_nmcompleto IS
    'Nome Completo do Usuário';

COMMENT ON COLUMN crm.usuario.usur_nmtelefone IS
    'Número de Telefone do Usuário';