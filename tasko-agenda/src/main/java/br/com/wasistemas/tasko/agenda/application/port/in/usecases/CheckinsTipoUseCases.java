package br.com.wasistemas.tasko.agenda.application.port.in.usecases;

import br.com.wasistemas.tasko.agenda.domain.checkinstipo.AdicionarCheckinsTipo;
import br.com.wasistemas.tasko.agenda.domain.checkinstipo.AtualizarCheckinsTipo;
import br.com.wasistemas.tasko.agenda.domain.checkinstipo.CheckinsTipo;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface CheckinsTipoUseCases extends GenericUseCase<CheckinsTipo, AdicionarCheckinsTipo, AtualizarCheckinsTipo> {
}
