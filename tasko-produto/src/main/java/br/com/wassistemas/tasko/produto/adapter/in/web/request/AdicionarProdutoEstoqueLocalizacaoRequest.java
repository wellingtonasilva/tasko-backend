package br.com.wassistemas.tasko.produto.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar Estoque")
public class AdicionarProdutoEstoqueLocalizacaoRequest {
    @Schema(description = "Id. do Produto")
    Long produtoId;

    @Schema(description = "Id. da Localização")
    Long empresaLocalizacaoId;

    @Schema(description = "Endereço Físico")
    String localizacaoFisica;

    @Schema(description = "Qtd Disponível")
    BigDecimal quantidadeDisponivel;

    @Schema(description = "Qtd Reservada")
    BigDecimal quantidadeReservada;

    @Schema(description = "Número do Lote")
    String lote;

    @Schema(description = "Data de Validade")
    LocalDate dataValidade;
}
