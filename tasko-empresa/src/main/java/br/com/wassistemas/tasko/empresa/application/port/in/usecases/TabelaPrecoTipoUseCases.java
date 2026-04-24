package br.com.wassistemas.tasko.empresa.application.port.in.usecases;

import br.com.wassistemas.tasko.empresa.domain.tabelaprecotipo.AdicionarTabelaPrecoTipo;
import br.com.wassistemas.tasko.empresa.domain.tabelaprecotipo.AtualizarTabelaPrecoTipo;
import br.com.wassistemas.tasko.empresa.domain.tabelaprecotipo.TabelaPrecoTipo;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface TabelaPrecoTipoUseCases extends GenericUseCase<TabelaPrecoTipo, AdicionarTabelaPrecoTipo, AtualizarTabelaPrecoTipo> {
}
