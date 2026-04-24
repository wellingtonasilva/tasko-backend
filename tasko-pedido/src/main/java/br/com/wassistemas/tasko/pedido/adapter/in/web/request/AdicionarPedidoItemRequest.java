package br.com.wassistemas.tasko.pedido.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar Item ao Pedido")
public class AdicionarPedidoItemRequest {
    @Schema(description = "Id. do Pedido")
    Long pedidoId;

    @Schema(description = "Id. do Produto")
    Long produtoId;

    @Schema(description = "Quantidade")
    BigDecimal quantidade;

    @Schema(description = "Preço Unitário")
    BigDecimal precoUnitario;

    @Schema(description = "Desconto %")
    BigDecimal percentualDesconto;

    @Schema(description = "Valor Desconto")
    BigDecimal valorDesconto;

    @Schema(description = "Valor Total")
    BigDecimal valorTotal;
}
