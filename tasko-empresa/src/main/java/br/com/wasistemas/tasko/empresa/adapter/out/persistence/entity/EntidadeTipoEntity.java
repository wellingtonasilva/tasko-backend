package br.com.wasistemas.tasko.empresa.adapter.out.persistence.entity;

import br.com.wasistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "entidade_tipo", schema = "crm")
@Data
@NoArgsConstructor
public class EntidadeTipoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entp_id")
    private Long id;

    @Column(name = "entp_dsentidade_tipo")
    private String descricaoEntidadeTipo;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "entp_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "entp_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "entp_icativo"))
    private AuditoriaEntity auditoria;
}
