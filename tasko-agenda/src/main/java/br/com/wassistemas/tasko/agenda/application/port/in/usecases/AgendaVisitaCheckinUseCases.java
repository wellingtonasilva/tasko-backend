package br.com.wassistemas.tasko.agenda.application.port.in.usecases;

import br.com.wassistemas.tasko.agenda.domain.agendavisitacheckin.AdicionarAgendaVisitaCheckin;
import br.com.wassistemas.tasko.agenda.domain.agendavisitacheckin.AtualizarAgendaVisitaCheckin;
import br.com.wassistemas.tasko.agenda.domain.agendavisitacheckin.AgendaVisitaCheckin;
import br.com.wassistemas.tasko.common.usecases.BaseUseCase;

public interface AgendaVisitaCheckinUseCases extends
    BaseUseCase<AgendaVisitaCheckin, AdicionarAgendaVisitaCheckin, AtualizarAgendaVisitaCheckin> {
}
