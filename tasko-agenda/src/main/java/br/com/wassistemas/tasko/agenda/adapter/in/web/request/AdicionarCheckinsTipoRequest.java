package br.com.wassistemas.tasko.agenda.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar Tipo de Checkin")
public class AdicionarCheckinsTipoRequest {
    @Schema(description = "Tipo (CHECK_IN, CHECK_OUT)")
    String descricaoCheckinTipo;
}
