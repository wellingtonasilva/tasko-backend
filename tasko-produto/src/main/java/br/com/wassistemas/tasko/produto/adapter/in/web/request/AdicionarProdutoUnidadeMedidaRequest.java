package br.com.wassistemas.tasko.produto.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar Unidade de Medida")
public class AdicionarProdutoUnidadeMedidaRequest {
    @Schema(description = "Descrição da Unidade de Medida")
    String descricaoUnidadeMedida;
}
