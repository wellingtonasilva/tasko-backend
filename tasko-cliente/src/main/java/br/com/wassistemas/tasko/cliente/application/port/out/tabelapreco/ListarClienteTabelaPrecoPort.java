package br.com.wassistemas.tasko.cliente.application.port.out.tabelapreco;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.cliente.domain.tabelapreco.ClienteTabelaPreco;

import java.util.List;

public interface ListarClienteTabelaPrecoPort {
    List<ClienteTabelaPreco> listarClienteTabelaPreco(Paginacao paginacao);
}

