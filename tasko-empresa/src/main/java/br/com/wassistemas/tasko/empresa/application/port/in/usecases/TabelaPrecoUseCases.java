package br.com.wassistemas.tasko.empresa.application.port.in.usecases;

import br.com.wassistemas.tasko.empresa.domain.tabelapreco.AdicionarTabelaPreco;
import br.com.wassistemas.tasko.empresa.domain.tabelapreco.AtualizarTabelaPreco;
import br.com.wassistemas.tasko.empresa.domain.tabelapreco.TabelaPreco;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface TabelaPrecoUseCases extends GenericUseCase<TabelaPreco, AdicionarTabelaPreco, AtualizarTabelaPreco> {
}
