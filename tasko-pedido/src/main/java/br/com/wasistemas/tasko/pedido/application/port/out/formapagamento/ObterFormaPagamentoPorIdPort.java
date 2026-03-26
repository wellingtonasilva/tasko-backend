package br.com.wasistemas.tasko.pedido.application.port.out.formapagamento;

import br.com.wasistemas.tasko.pedido.domain.formapagamento.FormaPagamento;

public interface ObterFormaPagamentoPorIdPort {
    FormaPagamento obterFormaPagamentoPorId(Long id);
}
