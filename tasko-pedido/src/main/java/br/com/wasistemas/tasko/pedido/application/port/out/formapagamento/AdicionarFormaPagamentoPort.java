package br.com.wasistemas.tasko.pedido.application.port.out.formapagamento;

import br.com.wasistemas.tasko.pedido.domain.formapagamento.AdicionarFormaPagamento;
import br.com.wasistemas.tasko.pedido.domain.formapagamento.FormaPagamento;

public interface AdicionarFormaPagamentoPort {
    FormaPagamento adicionarFormaPagamento(AdicionarFormaPagamento adicionar);
}
