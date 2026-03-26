package br.com.wasistemas.tasko.empresa.application.port.in.usecases;

import br.com.wasistemas.tasko.empresa.domain.tabelapreco.AdicionarTabelaPreco;
import br.com.wasistemas.tasko.empresa.domain.tabelapreco.AtualizarTabelaPreco;
import br.com.wasistemas.tasko.empresa.domain.tabelapreco.TabelaPreco;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface TabelaPrecoUseCases extends GenericUseCase<TabelaPreco, AdicionarTabelaPreco, AtualizarTabelaPreco> {
}
