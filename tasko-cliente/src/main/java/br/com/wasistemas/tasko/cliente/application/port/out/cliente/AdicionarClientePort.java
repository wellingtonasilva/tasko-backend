package br.com.wasistemas.tasko.cliente.application.port.out.cliente;

import br.com.wasistemas.tasko.cliente.domain.cliente.AdicionarCliente;
import br.com.wasistemas.tasko.cliente.domain.cliente.Cliente;

public interface AdicionarClientePort {
    Cliente adicionarCliente(AdicionarCliente adicionarCliente);
}

