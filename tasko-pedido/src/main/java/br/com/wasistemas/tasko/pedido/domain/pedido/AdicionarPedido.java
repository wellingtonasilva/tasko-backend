package br.com.wasistemas.tasko.pedido.domain.pedido;

import lombok.Value;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Value
public class AdicionarPedido {
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
