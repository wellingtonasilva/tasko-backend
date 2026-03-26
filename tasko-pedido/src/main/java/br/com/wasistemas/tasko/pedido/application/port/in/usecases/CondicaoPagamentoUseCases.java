package br.com.wasistemas.tasko.pedido.application.port.in.usecases;

import br.com.wasistemas.tasko.pedido.domain.condicaopagamento.AdicionarCondicaoPagamento;
import br.com.wasistemas.tasko.pedido.domain.condicaopagamento.AtualizarCondicaoPagamento;
import br.com.wasistemas.tasko.pedido.domain.condicaopagamento.CondicaoPagamento;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface CondicaoPagamentoUseCases extends GenericUseCase<CondicaoPagamento, AdicionarCondicaoPagamento, AtualizarCondicaoPagamento> {
}
