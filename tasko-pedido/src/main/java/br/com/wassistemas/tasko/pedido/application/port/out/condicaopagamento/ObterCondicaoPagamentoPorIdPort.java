package br.com.wassistemas.tasko.pedido.application.port.out.condicaopagamento;

import br.com.wassistemas.tasko.pedido.domain.condicaopagamento.CondicaoPagamento;

public interface ObterCondicaoPagamentoPorIdPort {
    CondicaoPagamento obterCondicaoPagamentoPorId(Long id);
}
