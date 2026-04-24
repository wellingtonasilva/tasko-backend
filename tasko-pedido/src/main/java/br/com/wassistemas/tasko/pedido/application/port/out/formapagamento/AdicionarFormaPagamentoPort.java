package br.com.wassistemas.tasko.pedido.application.port.out.formapagamento;

import br.com.wassistemas.tasko.pedido.domain.formapagamento.AdicionarFormaPagamento;
import br.com.wassistemas.tasko.pedido.domain.formapagamento.FormaPagamento;

public interface AdicionarFormaPagamentoPort {
    FormaPagamento adicionarFormaPagamento(AdicionarFormaPagamento adicionar);
}
