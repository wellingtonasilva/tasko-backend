package br.com.wasistemas.tasko.agenda.application.port.in.usecases;

import br.com.wasistemas.tasko.agenda.domain.agendavisitacheckin.AdicionarAgendaVisitaCheckin;
import br.com.wasistemas.tasko.agenda.domain.agendavisitacheckin.AtualizarAgendaVisitaCheckin;
import br.com.wasistemas.tasko.agenda.domain.agendavisitacheckin.AgendaVisitaCheckin;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface AgendaVisitaCheckinUseCases extends GenericUseCase<AgendaVisitaCheckin, AdicionarAgendaVisitaCheckin, AtualizarAgendaVisitaCheckin> {
}
