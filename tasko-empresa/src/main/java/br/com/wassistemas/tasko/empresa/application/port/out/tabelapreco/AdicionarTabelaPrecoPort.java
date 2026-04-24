package br.com.wassistemas.tasko.empresa.application.port.out.tabelapreco;

import br.com.wassistemas.tasko.empresa.domain.tabelapreco.AdicionarTabelaPreco;
import br.com.wassistemas.tasko.empresa.domain.tabelapreco.TabelaPreco;

public interface AdicionarTabelaPrecoPort {
    TabelaPreco adicionarTabelaPreco(AdicionarTabelaPreco adicionar);
}
