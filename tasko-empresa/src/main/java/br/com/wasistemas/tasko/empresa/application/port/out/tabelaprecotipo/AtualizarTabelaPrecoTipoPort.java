package br.com.wasistemas.tasko.empresa.application.port.out.tabelaprecotipo;

import br.com.wasistemas.tasko.empresa.domain.tabelaprecotipo.AtualizarTabelaPrecoTipo;
import br.com.wasistemas.tasko.empresa.domain.tabelaprecotipo.TabelaPrecoTipo;

public interface AtualizarTabelaPrecoTipoPort {
    TabelaPrecoTipo atualizarTabelaPrecoTipo(Long id, AtualizarTabelaPrecoTipo atualizar);
}
