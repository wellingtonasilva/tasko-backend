package br.com.wassistemas.tasko.pedido.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar Pedido")
public class AdicionarPedidoRequest {
    @Schema(description = "Número do Pedido")
    String numeroPedido;

    @Schema(description = "Id. do Cliente")
    Long clienteId;

    @Schema(description = "Id. do Vendedor")
    Long vendedorId;

    @Schema(description = "Id. Status do Pedido")
    Long pedidoStatusTipoId;

    @Schema(description = "Data/Hora do Pedido")
    LocalDateTime dataPedido;

    @Schema(description = "Data Entrega Prevista")
    LocalDate dataEntregaPrevista;

    @Schema(description = "Observação")
    String observacao;

    @Schema(description = "Subtotal")
    BigDecimal subtotal;

    @Schema(description = "Desconto %")
    BigDecimal percentualDesconto;

    @Schema(description = "Valor Desconto")
    BigDecimal valorDesconto;

    @Schema(description = "Valor Frete")
    BigDecimal valorFrete;

    @Schema(description = "Valor Total")
    BigDecimal valorTotal;

    @Schema(description = "Id. Forma Pagamento")
    Long formaPagamentoId;

    @Schema(description = "Id. Condição Pagamento")
    Long condicaoPagamentoId;

    @Schema(description = "Latitude")
    BigDecimal latitude;

    @Schema(description = "Longitude")
    BigDecimal longitude;

    @Schema(description = "Sincronizado?")
    Boolean sincronizado;

    @Schema(description = "Criado Offline?")
    Boolean criadoOffline;

    @Schema(description = "UUID Offline")
    String uuidOffline;
}
