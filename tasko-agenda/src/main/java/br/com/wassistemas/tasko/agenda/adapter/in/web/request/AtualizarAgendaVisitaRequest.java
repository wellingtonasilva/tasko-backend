package br.com.wassistemas.tasko.agenda.adapter.in.web.request;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@Value
@Builder
@Getter
public class AtualizarAgendaVisitaRequest {
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
