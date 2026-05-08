package br.com.wassistemas.tasko.pedido.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar Condição de Pagamento")
public class AtualizarCondicaoPagamentoRequest {
    private Long id;
    private Long empresaId;
    private String descricaoCondicaoPagamento;
    private String condicaoPagamento;
}
