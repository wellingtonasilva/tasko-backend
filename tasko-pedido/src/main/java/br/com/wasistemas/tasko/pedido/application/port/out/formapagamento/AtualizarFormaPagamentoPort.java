package br.com.wasistemas.tasko.pedido.application.port.out.formapagamento;

import br.com.wasistemas.tasko.pedido.domain.formapagamento.AtualizarFormaPagamento;
import br.com.wasistemas.tasko.pedido.domain.formapagamento.FormaPagamento;

public interface AtualizarFormaPagamentoPort {
    FormaPagamento atualizarFormaPagamento(Long id, AtualizarFormaPagamento atualizar);
}
