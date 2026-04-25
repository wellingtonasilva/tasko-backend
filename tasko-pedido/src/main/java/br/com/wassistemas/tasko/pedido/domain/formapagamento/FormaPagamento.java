package br.com.wassistemas.tasko.pedido.domain.formapagamento;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class FormaPagamento {
    private Long id;
    private Long empresaId;
    private String descricaoFormaPagamento;
    private Auditoria auditoria;
}
