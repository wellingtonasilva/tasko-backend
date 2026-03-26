package br.com.wasistemas.tasko.cliente.application.port.out.tabelapreco;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.cliente.domain.tabelapreco.ClienteTabelaPreco;

import java.util.List;

public interface ListarClienteTabelaPrecoPort {
    List<ClienteTabelaPreco> listarClienteTabelaPreco(Paginacao paginacao);
}

