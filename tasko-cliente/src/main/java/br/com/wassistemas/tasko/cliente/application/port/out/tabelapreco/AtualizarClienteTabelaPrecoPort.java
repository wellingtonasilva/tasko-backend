package br.com.wassistemas.tasko.cliente.application.port.out.tabelapreco;

import br.com.wassistemas.tasko.cliente.domain.tabelapreco.AtualizarClienteTabelaPreco;
import br.com.wassistemas.tasko.cliente.domain.tabelapreco.ClienteTabelaPreco;

public interface AtualizarClienteTabelaPrecoPort {
    ClienteTabelaPreco atualizarClienteTabelaPreco(Long id, AtualizarClienteTabelaPreco atualizar);
}

