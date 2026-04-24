package br.com.wassistemas.tasko.cliente.application.port.out.cliente;

import br.com.wassistemas.tasko.cliente.domain.cliente.Cliente;

public interface ObterClientePorIdPort {
    Cliente obterClientePorId(Long id);
}

