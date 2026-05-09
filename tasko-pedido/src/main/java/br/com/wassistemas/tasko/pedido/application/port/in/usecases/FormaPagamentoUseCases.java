package br.com.wassistemas.tasko.pedido.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.BaseUseCase;
import br.com.wassistemas.tasko.pedido.domain.formapagamento.AdicionarFormaPagamento;
import br.com.wassistemas.tasko.pedido.domain.formapagamento.AtualizarFormaPagamento;
import br.com.wassistemas.tasko.pedido.domain.formapagamento.FormaPagamento;

public interface FormaPagamentoUseCases extends
    BaseUseCase<FormaPagamento, AdicionarFormaPagamento, AtualizarFormaPagamento> {
}
