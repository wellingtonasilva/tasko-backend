package br.com.wasistemas.tasko.agenda.domain.agendavisita;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Value
@Builder
@Getter
public class AtualizarAgendaVisita {
    Long id;
    LocalDateTime dataAgendada;
    LocalDateTime dataRealizada;
    Integer duracaoPrevista;
    Integer duracaoReal;
    String objetivo;
    String observacao;
    String resultado;
    Long vendedorId;
    Long clienteId;
    Long agendaVisitaStatusId;
    BigDecimal latitude;
    BigDecimal longitude;
    Boolean pedidoGerado;
    Long pedidoId;
    BigDecimal valorPedido;
    Boolean sincronizado;
    Boolean criadoOffline;
    String uuidOffline;
}
