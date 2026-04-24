package br.com.wassistemas.tasko.agenda.domain.agendavisitacheckin;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;
import java.math.BigDecimal;

@Value
@Builder
@Getter
public class AtualizarAgendaVisitaCheckin {
    Long id;
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
