package br.com.wassistemas.tasko.pedido.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Entity
@Table(name = "pedido_item", schema = "crm")
@Data
@NoArgsConstructor
public class PedidoItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "peit_id")
    private Long id;

    @Column(name = "pedi_id")
    private Long pedidoId;

    @Column(name = "prod_id")
    private Long produtoId;

    @Column(name = "peit_qtd_item")
    private BigDecimal quantidade;

    @Column(name = "peit_vlpreco_unitario")
    private BigDecimal precoUnitario;

    @Column(name = "peit_per_desconto")
    private BigDecimal percentualDesconto;

    @Column(name = "peit_vldesconto")
    private BigDecimal valorDesconto;

    @Column(name = "peit_vltotal")
    private BigDecimal valorTotal;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "peit_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "peit_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "peit_icativo"))
    private AuditoriaEntity auditoria;
}
