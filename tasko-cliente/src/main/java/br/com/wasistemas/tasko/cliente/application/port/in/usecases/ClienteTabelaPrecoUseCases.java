package br.com.wasistemas.tasko.cliente.application.port.in.usecases;

import br.com.wasistemas.tasko.common.usecases.GenericUseCase;
import br.com.wasistemas.tasko.cliente.domain.tabelapreco.AdicionarClienteTabelaPreco;
import br.com.wasistemas.tasko.cliente.domain.tabelapreco.AtualizarClienteTabelaPreco;
import br.com.wasistemas.tasko.cliente.domain.tabelapreco.ClienteTabelaPreco;

public interface ClienteTabelaPrecoUseCases extends GenericUseCase<ClienteTabelaPreco, AdicionarClienteTabelaPreco, AtualizarClienteTabelaPreco> {
}

