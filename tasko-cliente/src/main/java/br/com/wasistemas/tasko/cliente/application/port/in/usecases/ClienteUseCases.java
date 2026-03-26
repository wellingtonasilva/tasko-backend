package br.com.wasistemas.tasko.cliente.application.port.in.usecases;

import br.com.wasistemas.tasko.common.usecases.GenericUseCase;
import br.com.wasistemas.tasko.cliente.domain.cliente.AdicionarCliente;
import br.com.wasistemas.tasko.cliente.domain.cliente.AtualizarCliente;
import br.com.wasistemas.tasko.cliente.domain.cliente.Cliente;

public interface ClienteUseCases extends GenericUseCase<Cliente, AdicionarCliente, AtualizarCliente> {
}

