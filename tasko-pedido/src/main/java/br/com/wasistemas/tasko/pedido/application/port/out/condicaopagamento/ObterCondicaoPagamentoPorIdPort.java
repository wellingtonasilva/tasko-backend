package br.com.wasistemas.tasko.pedido.application.port.out.condicaopagamento;

import br.com.wasistemas.tasko.pedido.domain.condicaopagamento.CondicaoPagamento;

public interface ObterCondicaoPagamentoPorIdPort {
    CondicaoPagamento obterCondicaoPagamentoPorId(Long id);
}
