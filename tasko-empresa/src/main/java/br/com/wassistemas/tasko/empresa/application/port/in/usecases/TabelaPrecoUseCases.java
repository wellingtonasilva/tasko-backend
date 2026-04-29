package br.com.wassistemas.tasko.empresa.application.port.in.usecases;

import br.com.wassistemas.tasko.empresa.domain.tabelapreco.AdicionarTabelaPreco;
import br.com.wassistemas.tasko.empresa.domain.tabelapreco.AtualizarTabelaPreco;
import br.com.wassistemas.tasko.empresa.domain.tabelapreco.TabelaPreco;
import br.com.wassistemas.tasko.common.usecases.TenantUseCase;

public interface TabelaPrecoUseCases extends
    TenantUseCase<TabelaPreco, AdicionarTabelaPreco, AtualizarTabelaPreco> {
}
