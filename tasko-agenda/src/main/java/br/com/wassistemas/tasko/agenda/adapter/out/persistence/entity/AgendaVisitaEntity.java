package br.com.wassistemas.tasko.agenda.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "agenda_visita", schema = "crm")
@Data
@NoArgsConstructor
public class AgendaVisitaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "avis_id")
    private Long id;

    @Column(name = "avis_dtagendada")
    private LocalDateTime dataAgendada;

    @Column(name = "avis_dtrealizada")
    private LocalDateTime dataRealizada;

    @Column(name = "avis_nnduracao_prevista")
    private Integer duracaoPrevista;

    @Column(name = "avis_nnduracao_real")
    private Integer duracaoReal;

    @Column(name = "avis_objetivo")
    private String objetivo;

    @Column(name = "avis_observacao")
    private String observacao;

    @Column(name = "avis_resultado")
    private String resultado;

    @Column(name = "vend_id")
    private Long vendedorId;

    @Column(name = "clie_id")
    private Long clienteId;

    @Column(name = "agst_id")
    private Long agendaVisitaStatusId;

    @Column(name = "avis_nnlatitude")
    private BigDecimal latitude;

    @Column(name = "avis_nnlongitude")
    private BigDecimal longitude;

    @Column(name = "avis_icpedido_gerado")
    private Boolean pedidoGerado;

    @Column(name = "pedi_id")
    private Long pedidoId;

    @Column(name = "avis_lvpedido")
    private BigDecimal valorPedido;

    @Column(name = "avis_icsincronizado")
    private Boolean sincronizado;

    @Column(name = "avis_iccriado_offline")
    private Boolean criadoOffline;

    @Column(name = "avis_uuid_offline")
    private String uuidOffline;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "avis_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "avis_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "avis_icativo"))
    private AuditoriaEntity auditoria;
}
