package br.com.wasistemas.tasko.pedido.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar Forma de Pagamento")
public class AdicionarFormaPagamentoRequest {
    @Schema(description = "Forma de Pagamento (DINHEIRO, PIX, CARTAO_CREDITO, CARTAO_DEBITO, PRAZO)")
    String descricaoFormaPagamento;
}
