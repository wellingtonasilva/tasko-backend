package br.com.wassistemas.tasko.pedido.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Schema(description = "Dados para Atualizar Item do Pedido")
public class AtualizarPedidoItemRequest {
    Long id;
    Long pedidoId;
    Long produtoId;
    BigDecimal quantidade;
    BigDecimal precoUnitario;
    BigDecimal percentualDesconto;
    BigDecimal valorDesconto;
    BigDecimal valorTotal;
}
