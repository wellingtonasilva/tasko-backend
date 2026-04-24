package br.com.wassistemas.tasko.pedido.application.port.in.usecases;

import br.com.wassistemas.tasko.pedido.domain.formapagamento.AdicionarFormaPagamento;
import br.com.wassistemas.tasko.pedido.domain.formapagamento.AtualizarFormaPagamento;
import br.com.wassistemas.tasko.pedido.domain.formapagamento.FormaPagamento;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface FormaPagamentoUseCases extends GenericUseCase<FormaPagamento, AdicionarFormaPagamento, AtualizarFormaPagamento> {
}
