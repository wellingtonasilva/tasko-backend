package br.com.wassitemas.tasko.produto.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar Código de Barras ao Produto")
public class AdicionarProdutoCodigoBarrasRequest {
    @Schema(description = "Id. do Produto")
    Long produtoId;

    @Schema(description = "Id. do Tipo de Código de Barras")
    Long codigoBarrasTipoId;

    @Schema(description = "Código de Barras")
    String codigoBarras;

    @Schema(description = "É o Código Principal?")
    Boolean principal;
}
