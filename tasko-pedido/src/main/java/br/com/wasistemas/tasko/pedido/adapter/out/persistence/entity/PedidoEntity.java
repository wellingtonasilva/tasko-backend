package br.com.wasistemas.tasko.pedido.adapter.out.persistence.entity;

import br.com.wasistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "pedido", schema = "crm")
@Data
@NoArgsConstructor
public class PedidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pedi_id")
    private Long id;

    @Column(name = "pedi_nnpedido")
    private String numeroPedido;

    @Column(name = "clie_id")
    private Long clienteId;

    @Column(name = "vend_id")
    private Long vendedorId;

    @Column(name = "pstp_id")
    private Long pedidoStatusTipoId;

    @Column(name = "pedi_dtpedido")
    private LocalDateTime dataPedido;

    @Column(name = "pedi_dtentrega_prevista")
    private LocalDate dataEntregaPrevista;

    @Column(name = "pedi_observacao")
    private String observacao;

    @Column(name = "pedi_vlsubtotal")
    private BigDecimal subtotal;

    @Column(name = "pedi_per_desconto")
    private BigDecimal percentualDesconto;

    @Column(name = "pedi_vldesconto")
    private BigDecimal valorDesconto;

    @Column(name = "pedi_vlfrete")
    private BigDecimal valorFrete;

    @Column(name = "pedi_vltotal")
    private BigDecimal valorTotal;

    @Column(name = "fpag_id")
    private Long formaPagamentoId;

    @Column(name = "cndp_id")
    private Long condicaoPagamentoId;

    @Column(name = "pedi_nnlatitude")
    private BigDecimal latitude;

    @Column(name = "pedi_nnlongitude")
    private BigDecimal longitude;

    @Column(name = "pedi_icsincronizado")
    private Boolean sincronizado;

    @Column(name = "pedi_iccriado_offline")
    private Boolean criadoOffline;

    @Column(name = "pedi_uuid_offline")
    private String uuidOffline;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "pedi_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "pedi_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "pedi_icativo"))
    private AuditoriaEntity auditoria;
}
