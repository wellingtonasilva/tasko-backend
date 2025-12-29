package br.com.wasistemas.tasko.vendedor.adapter.out.persistence.entity;

import br.com.wasistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vendedor_territorio_cidade", schema = "crm")
@Data
@NoArgsConstructor
public class VendedorTerritorioCidadeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vtcd_id")
    private Long id;

    @Column(name = "vtcd_nmcidade")
    private String nomeCidade;

    @ManyToOne
    @JoinColumn(name = "vter_id", foreignKey = @ForeignKey(name = "xfk1_vendedor_territorio_cidade"))
    private VendedorTerritorioEntity territorio;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "vtcd_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "vtcd_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "vtcd_icativo"))
    private AuditoriaEntity auditoria;
}