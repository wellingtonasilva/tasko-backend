package br.com.wasistemas.tasko.empresa.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar Tipo de Localização")
public class AdicionarLocalizacaoTipoRequest {
    @Schema(description = "Tipo (ARMAZEM, LOJA, CENTRO_DISTRIBUICAO, FABRICA)")
    String descricaoLocalizacaoTipo;
}
