package br.com.wassistemas.tasko.cliente.application.port.out.tabelapreco;

import br.com.wassistemas.tasko.cliente.domain.tabelapreco.ClienteTabelaPreco;

public interface ObterClienteTabelaPrecoPorIdPort {
    ClienteTabelaPreco obterClienteTabelaPrecoPorId(Long id);
}

