package br.com.wasistemas.tasko.cliente.application.port.out.tabelapreco;

import br.com.wasistemas.tasko.cliente.domain.tabelapreco.AtualizarClienteTabelaPreco;
import br.com.wasistemas.tasko.cliente.domain.tabelapreco.ClienteTabelaPreco;

public interface AtualizarClienteTabelaPrecoPort {
    ClienteTabelaPreco atualizarClienteTabelaPreco(Long id, AtualizarClienteTabelaPreco atualizar);
}

