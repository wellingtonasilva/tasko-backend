package br.com.wasistemas.tasko.empresa.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar Foto")
public class AdicionarFotoRequest {
    @Schema(description = "Id. Tipo de Entidade")
    Long entidadeTipoId;

    @Schema(description = "Id. Vendedor")
    Long vendedorId;

    @Schema(description = "Nome do Arquivo")
    String nomeArquivo;

    @Schema(description = "Caminho da Imagem")
    String path;

    @Schema(description = "Latitude")
    BigDecimal latitude;

    @Schema(description = "Longitude")
    BigDecimal longitude;

    @Schema(description = "Sincronizado?")
    Boolean sincronizado;
}
