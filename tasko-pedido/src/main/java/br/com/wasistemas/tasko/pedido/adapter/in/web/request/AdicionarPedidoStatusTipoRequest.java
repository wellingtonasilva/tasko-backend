package br.com.wasistemas.tasko.pedido.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar Status Tipo do Pedido")
public class AdicionarPedidoStatusTipoRequest {
    @Schema(description = "Status (RASCUNHO, PENDENTE, APROVADO, FATURADO, ENTREGUE, CANCELADO)")
    String descricaoStatusTipo;
}
