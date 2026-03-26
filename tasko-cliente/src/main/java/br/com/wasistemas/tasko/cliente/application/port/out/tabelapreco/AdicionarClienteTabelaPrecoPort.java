package br.com.wasistemas.tasko.cliente.application.port.out.tabelapreco;

import br.com.wasistemas.tasko.cliente.domain.tabelapreco.AdicionarClienteTabelaPreco;
import br.com.wasistemas.tasko.cliente.domain.tabelapreco.ClienteTabelaPreco;

public interface AdicionarClienteTabelaPrecoPort {
    ClienteTabelaPreco adicionarClienteTabelaPreco(AdicionarClienteTabelaPreco adicionar);
}

