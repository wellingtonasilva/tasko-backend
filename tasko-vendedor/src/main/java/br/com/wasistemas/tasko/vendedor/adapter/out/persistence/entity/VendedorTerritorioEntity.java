package br.com.wasistemas.tasko.vendedor.adapter.out.persistence.entity;

import br.com.wasistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vendedor_territorio", schema = "crm")
@Data
@NoArgsConstructor
public class VendedorTerritorioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vter_id")
    private Long id;

    @Column(name = "vter_nmterritorio")
    private String nomeTerritorio;

    @Column(name = "vter_dsterritorio")
    private String descricaoTerritorio;

    @Column(name = "vter_nmregiao")
    private String nomeRegiao;

    @Column(name = "vter_cdestado")
    private String estado;

    @Column(name = "vter_coordenadas_poligono")
    private String coordenadasPoligono;

    @ManyToOne
    @JoinColumn(name = "supv_id", foreignKey = @ForeignKey(name = "xpk1_vendedor_territorio"))
    private VendedorSupervisorEntity supervisor;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "vter_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "vter_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "vter_icativo"))
    private AuditoriaEntity auditoria;
}
