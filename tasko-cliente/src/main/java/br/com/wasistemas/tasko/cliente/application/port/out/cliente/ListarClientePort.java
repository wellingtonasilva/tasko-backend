package br.com.wasistemas.tasko.cliente.application.port.out.cliente;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.cliente.domain.cliente.Cliente;

import java.util.List;

public interface ListarClientePort {
    List<Cliente> listarCliente(Paginacao paginacao);
}

