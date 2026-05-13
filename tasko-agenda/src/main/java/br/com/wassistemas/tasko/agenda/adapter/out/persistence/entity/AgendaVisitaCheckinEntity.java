package br.com.wassistemas.tasko.agenda.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "agenda_visita_checkins", schema = "crm")
@Data
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class AgendaVisitaCheckinEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vchk_id")
    private Long id;

    @Column(name = "avis_id")
    private Long agendaVisitaId;

    @Column(name = "vend_id")
    private Long vendedorId;

    @Column(name = "clie_id")
    private Long clienteId;

    @Column(name = "chtp_id")
    private Long checkinTipoId;

    @Column(name = "vchk_observacao")
    private String observacao;

    @Column(name = "vchk_nnlatitude")
    private BigDecimal latitude;

    @Column(name = "vchk_nnlongitude")
    private BigDecimal longitude;

    @Column(name = "vchk_nndistancia_cliente")
    private BigDecimal distanciaCliente;

    @Column(name = "vchk_icdentro_raio_permitido")
    private Boolean dentroRaioPermitido;

    @Column(name = "vchk_icsincronizado")
    private Boolean sincronizado;

    @Column(name = "vchk_uuid_offline")
    private String uuidOffline;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "vchk_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "vchk_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "vchk_icativo"))
    private AuditoriaEntity auditoria;
}
