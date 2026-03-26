package br.com.wasistemas.tasko.empresa.application.port.out.tabelaprecotipo;

import br.com.wasistemas.tasko.empresa.domain.tabelaprecotipo.AdicionarTabelaPrecoTipo;
import br.com.wasistemas.tasko.empresa.domain.tabelaprecotipo.TabelaPrecoTipo;

public interface AdicionarTabelaPrecoTipoPort {
    TabelaPrecoTipo adicionarTabelaPrecoTipo(AdicionarTabelaPrecoTipo adicionar);
}
