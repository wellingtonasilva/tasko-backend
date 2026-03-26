package br.com.wasistemas.tasko.agenda.application.port.in.usecases;

import br.com.wasistemas.tasko.agenda.domain.agendavisitastatus.AdicionarAgendaVisitaStatus;
import br.com.wasistemas.tasko.agenda.domain.agendavisitastatus.AtualizarAgendaVisitaStatus;
import br.com.wasistemas.tasko.agenda.domain.agendavisitastatus.AgendaVisitaStatus;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface AgendaVisitaStatusUseCases extends GenericUseCase<AgendaVisitaStatus, AdicionarAgendaVisitaStatus, AtualizarAgendaVisitaStatus> {
}
