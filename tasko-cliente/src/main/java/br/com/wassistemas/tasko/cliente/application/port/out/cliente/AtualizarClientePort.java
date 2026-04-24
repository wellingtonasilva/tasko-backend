package br.com.wassistemas.tasko.cliente.application.port.out.cliente;

import br.com.wassistemas.tasko.cliente.domain.cliente.AtualizarCliente;
import br.com.wassistemas.tasko.cliente.domain.cliente.Cliente;

public interface AtualizarClientePort {
    Cliente atualizarCliente(Long id, AtualizarCliente atualizarCliente);
}

