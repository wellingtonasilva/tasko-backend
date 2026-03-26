package br.com.wasistemas.tasko.empresa.application.port.out.tabelapreco;

import br.com.wasistemas.tasko.empresa.domain.tabelapreco.TabelaPreco;

public interface ObterTabelaPrecoPorIdPort {
    TabelaPreco obterTabelaPrecoPorId(Long id);
}
