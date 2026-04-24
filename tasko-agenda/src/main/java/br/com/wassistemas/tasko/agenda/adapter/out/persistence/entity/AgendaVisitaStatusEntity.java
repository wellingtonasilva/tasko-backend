package br.com.wassistemas.tasko.agenda.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "agenda_visita_status", schema = "crm")
@Data
@NoArgsConstructor
public class AgendaVisitaStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agst_id")
    private Long id;

    @Column(name = "agst_dsvisita_status")
    private String descricaoVisitaStatus;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "agst_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "agst_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "agst_icativo"))
    private AuditoriaEntity auditoria;
}
