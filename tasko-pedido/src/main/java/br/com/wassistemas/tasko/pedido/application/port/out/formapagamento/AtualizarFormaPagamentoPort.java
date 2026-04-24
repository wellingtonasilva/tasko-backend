package br.com.wassistemas.tasko.pedido.application.port.out.formapagamento;

import br.com.wassistemas.tasko.pedido.domain.formapagamento.AtualizarFormaPagamento;
import br.com.wassistemas.tasko.pedido.domain.formapagamento.FormaPagamento;

public interface AtualizarFormaPagamentoPort {
    FormaPagamento atualizarFormaPagamento(Long id, AtualizarFormaPagamento atualizar);
}
