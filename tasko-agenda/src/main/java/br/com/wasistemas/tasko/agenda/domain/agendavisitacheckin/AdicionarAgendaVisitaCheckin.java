package br.com.wasistemas.tasko.agenda.domain.agendavisitacheckin;

import lombok.Value;
import java.math.BigDecimal;

@Value
public class AdicionarAgendaVisitaCheckin {
    Long agendaVisitaId;
    Long vendedorId;
    Long clienteId;
    Long checkinTipoId;
    String observacao;
    BigDecimal latitude;
    BigDecimal longitude;
    BigDecimal distanciaCliente;
    Boolean dentroRaioPermitido;
    Boolean sincronizado;
    String uuidOffline;
}
