package br.com.wassistemas.tasko.agenda.application.port.in.usecases;

import br.com.wassistemas.tasko.agenda.domain.agendavisitastatus.AdicionarAgendaVisitaStatus;
import br.com.wassistemas.tasko.agenda.domain.agendavisitastatus.AtualizarAgendaVisitaStatus;
import br.com.wassistemas.tasko.agenda.domain.agendavisitastatus.AgendaVisitaStatus;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface AgendaVisitaStatusUseCases extends GenericUseCase<AgendaVisitaStatus, AdicionarAgendaVisitaStatus, AtualizarAgendaVisitaStatus> {
}
