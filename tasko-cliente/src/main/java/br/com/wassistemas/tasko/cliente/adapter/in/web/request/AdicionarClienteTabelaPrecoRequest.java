package br.com.wassistemas.tasko.cliente.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar Tabela de Preço ao Cliente")
public class AdicionarClienteTabelaPrecoRequest {
    @Schema(description = "Id. do Cliente", example = "1")
    Long clienteId;

    @Schema(description = "Id. da Tabela de Preço", example = "1")
    Long tabelaPrecoId;

    @Schema(description = "Data Início Vigência", example = "2026-01-01")
    LocalDate dataInicio;

    @Schema(description = "Data Fim Vigência", example = "2026-12-31")
    LocalDate dataFim;
}

