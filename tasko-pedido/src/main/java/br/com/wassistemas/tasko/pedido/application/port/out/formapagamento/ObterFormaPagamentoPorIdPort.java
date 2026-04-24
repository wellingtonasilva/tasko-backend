package br.com.wassistemas.tasko.pedido.application.port.out.formapagamento;

import br.com.wassistemas.tasko.pedido.domain.formapagamento.FormaPagamento;

public interface ObterFormaPagamentoPorIdPort {
    FormaPagamento obterFormaPagamentoPorId(Long id);
}
