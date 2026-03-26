package br.com.wasistemas.tasko.empresa.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar Tipo de Tabela de Preço")
public class AdicionarTabelaPrecoTipoRequest {
    @Schema(description = "Tipo (CLIENTE, REGIAO, SEGMENTO, PROMOCIONAL)")
    String descricaoTabelaPrecoTipo;
}
