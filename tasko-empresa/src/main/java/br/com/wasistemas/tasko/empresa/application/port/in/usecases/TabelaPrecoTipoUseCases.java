package br.com.wasistemas.tasko.empresa.application.port.in.usecases;

import br.com.wasistemas.tasko.empresa.domain.tabelaprecotipo.AdicionarTabelaPrecoTipo;
import br.com.wasistemas.tasko.empresa.domain.tabelaprecotipo.AtualizarTabelaPrecoTipo;
import br.com.wasistemas.tasko.empresa.domain.tabelaprecotipo.TabelaPrecoTipo;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface TabelaPrecoTipoUseCases extends GenericUseCase<TabelaPrecoTipo, AdicionarTabelaPrecoTipo, AtualizarTabelaPrecoTipo> {
}
