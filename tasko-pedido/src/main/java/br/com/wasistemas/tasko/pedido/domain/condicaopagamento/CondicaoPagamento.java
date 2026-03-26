package br.com.wasistemas.tasko.pedido.domain.condicaopagamento;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class CondicaoPagamento {
    private Long id;
    private String descricaoCondicaoPagamento;
    private String condicaoPagamento;
    private Auditoria auditoria;
}
