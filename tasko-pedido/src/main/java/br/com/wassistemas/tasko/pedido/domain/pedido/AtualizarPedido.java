package br.com.wassistemas.tasko.pedido.domain.pedido;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Value
@Builder
@Getter
public class AtualizarPedido {
    Long id;
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
