package br.com.wassistemas.tasko.cliente.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.TenantUseCase;
import br.com.wassistemas.tasko.cliente.domain.cliente.AdicionarCliente;
import br.com.wassistemas.tasko.cliente.domain.cliente.AtualizarCliente;
import br.com.wassistemas.tasko.cliente.domain.cliente.Cliente;

public interface ClienteUseCases extends
    TenantUseCase<Cliente, AdicionarCliente, AtualizarCliente> {
}

