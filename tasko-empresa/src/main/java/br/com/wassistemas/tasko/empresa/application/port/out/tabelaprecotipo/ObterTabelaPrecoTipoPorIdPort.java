package br.com.wassistemas.tasko.empresa.application.port.out.tabelaprecotipo;

import br.com.wassistemas.tasko.empresa.domain.tabelaprecotipo.TabelaPrecoTipo;

public interface ObterTabelaPrecoTipoPorIdPort {
    TabelaPrecoTipo obterTabelaPrecoTipoPorId(Long id);
}
