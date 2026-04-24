package br.com.wassistemas.tasko.cliente.application.port.out.cliente;

import br.com.wassistemas.tasko.cliente.domain.cliente.AdicionarCliente;
import br.com.wassistemas.tasko.cliente.domain.cliente.Cliente;

public interface AdicionarClientePort {
    Cliente adicionarCliente(AdicionarCliente adicionarCliente);
}

