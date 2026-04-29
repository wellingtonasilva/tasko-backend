package br.com.wassistemas.tasko.cliente.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.TenantUseCase;
import br.com.wassistemas.tasko.cliente.domain.tabelapreco.AdicionarClienteTabelaPreco;
import br.com.wassistemas.tasko.cliente.domain.tabelapreco.AtualizarClienteTabelaPreco;
import br.com.wassistemas.tasko.cliente.domain.tabelapreco.ClienteTabelaPreco;

public interface ClienteTabelaPrecoUseCases extends
    TenantUseCase<ClienteTabelaPreco, AdicionarClienteTabelaPreco, AtualizarClienteTabelaPreco> {
}

