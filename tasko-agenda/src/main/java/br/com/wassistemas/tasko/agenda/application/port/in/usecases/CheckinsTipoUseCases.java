package br.com.wassistemas.tasko.agenda.application.port.in.usecases;

import br.com.wassistemas.tasko.agenda.domain.checkinstipo.AdicionarCheckinsTipo;
import br.com.wassistemas.tasko.agenda.domain.checkinstipo.AtualizarCheckinsTipo;
import br.com.wassistemas.tasko.agenda.domain.checkinstipo.CheckinsTipo;
import br.com.wassistemas.tasko.common.usecases.BaseUseCase;

public interface CheckinsTipoUseCases extends
    BaseUseCase<CheckinsTipo, AdicionarCheckinsTipo, AtualizarCheckinsTipo> {
}
