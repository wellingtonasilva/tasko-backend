package br.com.wasistemas.tasko.vendedor.adapter.out.persistence.entity;

import br.com.wasistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "vendedor_metas", schema = "crm")
@Data
@NoArgsConstructor
public class VendedorMetaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vdme_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "vend_id", foreignKey = @ForeignKey(name = "xfk1_vendedor_metas"))
    private VendedorEntity vendedor;

    @Column(name = "vdme_ano")
    private Integer ano;

    @Column(name = "vdme_mes")
    private Integer mes;

    @Column(name = "vdme_vlmeta")
    private BigDecimal valorMeta;

    @Column(name = "vdme_vlatingido")
    private BigDecimal valorAtingido;

    @Column(name = "vdme_qtd_pedidos")
    private Integer quantidadePedidos;

    @Column(name = "vdme_qtd_pedidos_atinigidos")
    private Integer quantidadePedidosAtinigidos;

    @Column(name = "vdme_qtd_clientes_novos")
    private Integer quantidadeClientesNovos;

    @Column(name = "vdme_qtd_clientes_novos_atingidos")
    private Integer quantidadeClientesNovosAtigidos;

    @Column(name = "vdme_vlcomissao_calculada")
    private BigDecimal valorComissaoCalculada;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "vdme_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "vdme_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "vdme_icativo"))
    private AuditoriaEntity auditoria;
}