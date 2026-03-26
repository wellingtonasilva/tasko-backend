package br.com.wasistemas.tasko.pedido.domain.formapagamento;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class FormaPagamento {
    private Long id;
    private String descricaoFormaPagamento;
    private Auditoria auditoria;
}
