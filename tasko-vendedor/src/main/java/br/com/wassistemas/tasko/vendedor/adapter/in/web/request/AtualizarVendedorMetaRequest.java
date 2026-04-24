package br.com.wassistemas.tasko.vendedor.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicioanr Meta do Vendedor")
public class AtualizarVendedorMetaRequest {
    @Schema(description = "Id", example = "1")
    Long id;

    @Schema(description = "Id do Vendedor", example = "1")
    Long vendedorId;

    @Schema(description = "Ano da Meta", example = "2026")
    Integer ano;

    @Schema(description = "Mês da Meta", example = "02")
    Integer mes;

    @Schema(description = "Valor da Meta", example = "1000.00")
    BigDecimal valorMeta;

    @Schema(description = "Valor Realizado", example = "1500.00")
    BigDecimal valorAtingido;

    @Schema(description = "Quantidade de Pedidos", example = "100")
    Integer quantidadePedidos;

    @Schema(description = "Quantidade de Pedidos Realizados", example = "150")
    Integer quantidadePedidosAtinigidos;

    @Schema(description = "Quantidade de Clientes Novos", example = "10")
    Integer quantidadeClientesNovos;

    @Schema(description = "Quantidade de Clientes Novos Realizados", example = "25")
    Integer quantidadeClientesNovosAtigidos;

    @Schema(description = "Valor Comissão Calculado", example = "1500.00")
    BigDecimal valorComissaoCalculada;
}