package br.com.wassistemas.tasko.agenda.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar Status de Visita")
public class AdicionarAgendaVisitaStatusRequest {
    @Schema(description = "Descrição do Status da Visita")
    String descricaoVisitaStatus;
}
