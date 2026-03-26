package br.com.wasistemas.tasko.pedido.application.port.in.usecases;

import br.com.wasistemas.tasko.pedido.domain.formapagamento.AdicionarFormaPagamento;
import br.com.wasistemas.tasko.pedido.domain.formapagamento.AtualizarFormaPagamento;
import br.com.wasistemas.tasko.pedido.domain.formapagamento.FormaPagamento;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface FormaPagamentoUseCases extends GenericUseCase<FormaPagamento, AdicionarFormaPagamento, AtualizarFormaPagamento> {
}
