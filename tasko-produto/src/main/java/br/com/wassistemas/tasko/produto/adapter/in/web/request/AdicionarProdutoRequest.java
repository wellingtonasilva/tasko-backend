package br.com.wassistemas.tasko.produto.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar Produto")
public class AdicionarProdutoRequest {
    @Schema(description = "Nome do Produto")
    String nomeProduto;

    @Schema(description = "Descrição do Produto")
    String descricaoProduto;

    @Schema(description = "Id. Unidade de Medida")
    Long unidadeMedidaId;

    @Schema(description = "Id. Grupo")
    Long grupoId;

    @Schema(description = "Id. Subgrupo")
    Long subgrupoId;

    @Schema(description = "Peso Líquido")
    BigDecimal pesoLiquido;

    @Schema(description = "Marca")
    String marca;

    @Schema(description = "Fornecedor")
    String fornecedor;

    @Schema(description = "Alíquota ICMS %")
    BigDecimal aliquotaIcms;

    @Schema(description = "Alíquota IPI %")
    BigDecimal aliquotaIpi;

    @Schema(description = "Altura")
    BigDecimal dimensaoAltura;

    @Schema(description = "Largura")
    BigDecimal dimensaoLargura;

    @Schema(description = "Profundidade")
    BigDecimal dimensaoProfundidade;

    @Schema(description = "Preço de Custo")
    BigDecimal precoCusto;

    @Schema(description = "Preço Sugerido")
    BigDecimal precoSugerido;

    @Schema(description = "Margem Mínima %")
    BigDecimal margemMinima;

    @Schema(description = "Qtd Disponível")
    BigDecimal quantidadeDisponivel;

    @Schema(description = "Qtd Reservada")
    BigDecimal quantidadeReservada;
}
