package br.com.wassistemas.tasko.empresa.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar Tabela de Preço")
public class AdicionarTabelaPrecoRequest {
    @Schema(description = "Id. Tipo da Tabela de Preço")
    Long tabelaPrecoTipoId;

    @Schema(description = "Nome")
    String nomeTabelaPreco;

    @Schema(description = "Descrição")
    String descricaoTabelaPreco;

    @Schema(description = "Data Início Vigência")
    LocalDate dataInicio;

    @Schema(description = "Data Fim Vigência")
    LocalDate dataFim;
}
