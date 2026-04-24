package br.com.wassitemas.tasko.produto.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar Preço ao Produto")
public class AdicionarProdutoPrecoRequest {
    @Schema(description = "Id. do Produto")
    Long produtoId;

    @Schema(description = "Id. da Tabela de Preço")
    Long tabelaPrecoId;

    @Schema(description = "Preço")
    BigDecimal preco;

    @Schema(description = "Desconto Máximo %")
    BigDecimal descontoMaximo;
}
