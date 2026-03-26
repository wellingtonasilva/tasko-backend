package br.com.wasistemas.tasko.pedido.domain.pedidoitem;

import lombok.Value;
import java.math.BigDecimal;

@Value
public class AdicionarPedidoItem {
    Long pedidoId;
    Long produtoId;
    BigDecimal quantidade;
    BigDecimal precoUnitario;
    BigDecimal percentualDesconto;
    BigDecimal valorDesconto;
    BigDecimal valorTotal;
}
