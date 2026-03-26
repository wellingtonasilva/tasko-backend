package br.com.wasistemas.tasko.pedido.domain.pedido;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
public class Pedido {
    private Long id;
    private String numeroPedido;
    private Long clienteId;
    private Long vendedorId;
    private Long pedidoStatusTipoId;
    private LocalDateTime dataPedido;
    private LocalDate dataEntregaPrevista;
    private String observacao;
    private BigDecimal subtotal;
    private BigDecimal percentualDesconto;
    private BigDecimal valorDesconto;
    private BigDecimal valorFrete;
    private BigDecimal valorTotal;
    private Long formaPagamentoId;
    private Long condicaoPagamentoId;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private Boolean sincronizado;
    private Boolean criadoOffline;
    private String uuidOffline;
    private Auditoria auditoria;
}
