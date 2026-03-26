package br.com.wasistemas.tasko.cliente.application.port.out.cliente;

import br.com.wasistemas.tasko.cliente.domain.cliente.Cliente;

public interface ObterClientePorIdPort {
    Cliente obterClientePorId(Long id);
}

