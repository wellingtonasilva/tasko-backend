package br.com.wassistemas.tasko.pedido.domain.pedidoitem;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Builder
public class PedidoItem {
    private Long id;
    private Long pedidoId;
    private Long produtoId;
    private BigDecimal quantidade;
    private BigDecimal precoUnitario;
    private BigDecimal percentualDesconto;
    private BigDecimal valorDesconto;
    private BigDecimal valorTotal;
    private Auditoria auditoria;
}
