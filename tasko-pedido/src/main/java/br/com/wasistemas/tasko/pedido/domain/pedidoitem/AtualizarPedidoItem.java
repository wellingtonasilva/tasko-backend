package br.com.wasistemas.tasko.pedido.domain.pedidoitem;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;
import java.math.BigDecimal;

@Value
@Builder
@Getter
public class AtualizarPedidoItem {
    Long id;
    Long pedidoId;
    Long produtoId;
    BigDecimal quantidade;
    BigDecimal precoUnitario;
    BigDecimal percentualDesconto;
    BigDecimal valorDesconto;
    BigDecimal valorTotal;
}
