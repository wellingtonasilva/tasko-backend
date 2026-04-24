package br.com.wassistemas.tasko.pedido.application.port.in.usecases;

import br.com.wassistemas.tasko.pedido.domain.condicaopagamento.AdicionarCondicaoPagamento;
import br.com.wassistemas.tasko.pedido.domain.condicaopagamento.AtualizarCondicaoPagamento;
import br.com.wassistemas.tasko.pedido.domain.condicaopagamento.CondicaoPagamento;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface CondicaoPagamentoUseCases extends GenericUseCase<CondicaoPagamento, AdicionarCondicaoPagamento, AtualizarCondicaoPagamento> {
}
