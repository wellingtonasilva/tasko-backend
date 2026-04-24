package br.com.wassistemas.tasko.cliente.application.port.out.cliente;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.cliente.domain.cliente.Cliente;

import java.util.List;

public interface ListarClientePort {
    List<Cliente> listarCliente(Paginacao paginacao);
}

