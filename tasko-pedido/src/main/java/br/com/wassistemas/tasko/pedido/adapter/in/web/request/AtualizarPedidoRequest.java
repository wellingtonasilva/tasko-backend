package br.com.wassistemas.tasko.pedido.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Schema(description = "Dados para Atualizar Pedido")
public class AtualizarPedidoRequest {
    Long id;
    Long empresaId;
    String numeroPedido;
    Long clienteId;
    Long vendedorId;
    Long pedidoStatusTipoId;
    LocalDateTime dataPedido;
    LocalDate dataEntregaPrevista;
    String observacao;
    BigDecimal subtotal;
    BigDecimal percentualDesconto;
    BigDecimal valorDesconto;
    BigDecimal valorFrete;
    BigDecimal valorTotal;
    Long formaPagamentoId;
    Long condicaoPagamentoId;
    BigDecimal latitude;
    BigDecimal longitude;
    Boolean sincronizado;
    Boolean criadoOffline;
    String uuidOffline;
}
