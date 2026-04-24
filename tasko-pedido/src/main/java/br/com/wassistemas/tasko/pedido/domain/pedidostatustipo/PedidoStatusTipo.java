package br.com.wassistemas.tasko.pedido.domain.pedidostatustipo;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class PedidoStatusTipo {
    private Long id;
    private String descricaoStatusTipo;
    private Auditoria auditoria;
}
