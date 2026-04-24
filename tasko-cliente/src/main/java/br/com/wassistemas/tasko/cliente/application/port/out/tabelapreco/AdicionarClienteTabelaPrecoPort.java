package br.com.wassistemas.tasko.cliente.application.port.out.tabelapreco;

import br.com.wassistemas.tasko.cliente.domain.tabelapreco.AdicionarClienteTabelaPreco;
import br.com.wassistemas.tasko.cliente.domain.tabelapreco.ClienteTabelaPreco;

public interface AdicionarClienteTabelaPrecoPort {
    ClienteTabelaPreco adicionarClienteTabelaPreco(AdicionarClienteTabelaPreco adicionar);
}

