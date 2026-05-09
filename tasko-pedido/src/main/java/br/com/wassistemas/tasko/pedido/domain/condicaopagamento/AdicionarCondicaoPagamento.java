package br.com.wassistemas.tasko.pedido.domain.condicaopagamento;

import lombok.Value;


@Value
public class AdicionarCondicaoPagamento {
    Long empresaId;
    Long formaPagamentoId;
    String descricaoCondicaoPagamento;
    String condicaoPagamento;
}
