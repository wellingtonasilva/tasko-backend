package br.com.wasistemas.tasko.agenda.adapter.out.persistence.entity;

import br.com.wasistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "checkins_tipo", schema = "crm")
@Data
@NoArgsConstructor
public class CheckinsTipoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chtp_id")
    private Long id;

    @Column(name = "chtp_dscheckin_tipo")
    private String descricaoCheckinTipo;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "chtp_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "chtp_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "chtp_icativo"))
    private AuditoriaEntity auditoria;
}
