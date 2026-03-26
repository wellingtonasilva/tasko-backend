package br.com.wasistemas.tasko.empresa.application.port.out.tabelaprecotipo;

import br.com.wasistemas.tasko.empresa.domain.tabelaprecotipo.TabelaPrecoTipo;

public interface ObterTabelaPrecoTipoPorIdPort {
    TabelaPrecoTipo obterTabelaPrecoTipoPorId(Long id);
}
