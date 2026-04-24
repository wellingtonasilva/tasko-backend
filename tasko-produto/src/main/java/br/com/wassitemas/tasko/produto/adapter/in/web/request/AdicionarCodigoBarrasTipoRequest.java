package br.com.wassitemas.tasko.produto.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar Tipo de Código de Barras")
public class AdicionarCodigoBarrasTipoRequest {
    @Schema(description = "Nome do Tipo (EAN13, EAN8, UPC, CODE128, CODE39, INTERNO)")
    String nomeTipo;
}
