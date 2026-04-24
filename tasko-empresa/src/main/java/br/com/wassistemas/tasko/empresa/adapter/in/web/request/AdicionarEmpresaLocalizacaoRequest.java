package br.com.wassistemas.tasko.empresa.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar Localização")
public class AdicionarEmpresaLocalizacaoRequest {
    @Schema(description = "Id. da Empresa")
    Long empresaId;

    @Schema(description = "Nome da Localização")
    String nomeLocalizacao;

    @Schema(description = "Id. Tipo Localização")
    Long localizacaoTipoId;
}
