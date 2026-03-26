package br.com.wasistemas.tasko.empresa.application.port.out.tabelapreco;

import br.com.wasistemas.tasko.empresa.domain.tabelapreco.AtualizarTabelaPreco;
import br.com.wasistemas.tasko.empresa.domain.tabelapreco.TabelaPreco;

public interface AtualizarTabelaPrecoPort {
    TabelaPreco atualizarTabelaPreco(Long id, AtualizarTabelaPreco atualizar);
}
