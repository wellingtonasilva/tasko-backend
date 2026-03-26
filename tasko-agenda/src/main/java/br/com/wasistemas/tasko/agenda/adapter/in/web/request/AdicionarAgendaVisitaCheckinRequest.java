package br.com.wasistemas.tasko.agenda.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@NoArgsConstructor
@Data
@Schema(description = "Dados para Registrar Checkin")
public class AdicionarAgendaVisitaCheckinRequest {
    @Schema(description = "Id. Agenda Visita")
    Long agendaVisitaId;

    @Schema(description = "Id. Vendedor")
    Long vendedorId;

    @Schema(description = "Id. Cliente")
    Long clienteId;

    @Schema(description = "Id. Tipo Checkin")
    Long checkinTipoId;

    @Schema(description = "Observação")
    String observacao;

    @Schema(description = "Latitude")
    BigDecimal latitude;

    @Schema(description = "Longitude")
    BigDecimal longitude;

    @Schema(description = "Distância do Cliente (m)")
    BigDecimal distanciaCliente;

    @Schema(description = "Dentro do Raio Permitido?")
    Boolean dentroRaioPermitido;

    @Schema(description = "Sincronizado?")
    Boolean sincronizado;

    @Schema(description = "UUID Offline")
    String uuidOffline;
}
