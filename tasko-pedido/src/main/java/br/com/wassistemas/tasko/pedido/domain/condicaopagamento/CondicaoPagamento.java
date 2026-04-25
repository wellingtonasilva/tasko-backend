package br.com.wassistemas.tasko.pedido.domain.condicaopagamento;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class CondicaoPagamento {
    private Long id;
    private Long empresaId;
    private String descricaoCondicaoPagamento;
    private String condicaoPagamento;
    private Auditoria auditoria;
}
