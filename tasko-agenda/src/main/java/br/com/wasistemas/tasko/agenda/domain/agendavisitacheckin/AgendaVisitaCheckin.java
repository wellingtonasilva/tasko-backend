package br.com.wasistemas.tasko.agenda.domain.agendavisitacheckin;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Builder
public class AgendaVisitaCheckin {
    private Long id;
    private Long agendaVisitaId;
    private Long vendedorId;
    private Long clienteId;
    private Long checkinTipoId;
    private String observacao;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private BigDecimal distanciaCliente;
    private Boolean dentroRaioPermitido;
    private Boolean sincronizado;
    private String uuidOffline;
    private Auditoria auditoria;
}
