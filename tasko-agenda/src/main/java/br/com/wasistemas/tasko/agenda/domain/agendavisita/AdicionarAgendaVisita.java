package br.com.wasistemas.tasko.agenda.domain.agendavisita;

import lombok.Value;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Value
public class AdicionarAgendaVisita {
    LocalDateTime dataAgendada;
    Integer duracaoPrevista;
    String objetivo;
    String observacao;
    Long vendedorId;
    Long clienteId;
    Long agendaVisitaStatusId;
    BigDecimal latitude;
    BigDecimal longitude;
    Boolean criadoOffline;
    String uuidOffline;
}
