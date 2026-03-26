package br.com.wasistemas.tasko.agenda.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@Schema(description = "Dados para Agendar Visita")
public class AdicionarAgendaVisitaRequest {
    @Schema(description = "Data/Hora Agendamento")
    LocalDateTime dataAgendada;

    @Schema(description = "Duração Prevista (min)")
    Integer duracaoPrevista;

    @Schema(description = "Objetivo da Visita")
    String objetivo;

    @Schema(description = "Observações")
    String observacao;

    @Schema(description = "Id. do Vendedor")
    Long vendedorId;

    @Schema(description = "Id. do Cliente")
    Long clienteId;

    @Schema(description = "Id. Status")
    Long agendaVisitaStatusId;

    @Schema(description = "Latitude")
    BigDecimal latitude;

    @Schema(description = "Longitude")
    BigDecimal longitude;

    @Schema(description = "Criado Offline?")
    Boolean criadoOffline;

    @Schema(description = "UUID Offline")
    String uuidOffline;
}
