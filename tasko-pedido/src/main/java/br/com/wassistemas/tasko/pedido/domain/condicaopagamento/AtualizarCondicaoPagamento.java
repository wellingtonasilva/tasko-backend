package br.com.wassistemas.tasko.pedido.domain.condicaopagamento;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;


@Value
@Builder
@Getter
public class AtualizarCondicaoPagamento {
    Long id;
    Long empresaId;
    Long formaPagamentoId;
    String descricaoCondicaoPagamento;
    String condicaoPagamento;
}
