package br.com.wasistemas.tasko.agenda.application.port.in.usecases;

import br.com.wasistemas.tasko.agenda.domain.agendavisita.AdicionarAgendaVisita;
import br.com.wasistemas.tasko.agenda.domain.agendavisita.AtualizarAgendaVisita;
import br.com.wasistemas.tasko.agenda.domain.agendavisita.AgendaVisita;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface AgendaVisitaUseCases extends GenericUseCase<AgendaVisita, AdicionarAgendaVisita, AtualizarAgendaVisita> {
}
