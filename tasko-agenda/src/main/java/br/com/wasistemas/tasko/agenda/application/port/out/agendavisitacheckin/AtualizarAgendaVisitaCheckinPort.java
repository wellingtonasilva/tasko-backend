package br.com.wasistemas.tasko.agenda.application.port.out.agendavisitacheckin;

import br.com.wasistemas.tasko.agenda.domain.agendavisitacheckin.AtualizarAgendaVisitaCheckin;
import br.com.wasistemas.tasko.agenda.domain.agendavisitacheckin.AgendaVisitaCheckin;

public interface AtualizarAgendaVisitaCheckinPort {
    AgendaVisitaCheckin atualizarAgendaVisitaCheckin(Long id, AtualizarAgendaVisitaCheckin atualizar);
}
