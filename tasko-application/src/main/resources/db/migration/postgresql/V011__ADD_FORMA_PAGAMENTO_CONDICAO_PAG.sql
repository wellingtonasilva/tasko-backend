ALTER TABLE crm.condicao_pagamento
    ADD COLUMN fpag_id bigint,
    ADD CONSTRAINT xkf2_condicao_pagamento FOREIGN KEY (fpag_id) REFERENCES crm.forma_pagamento(fpag_id);