package br.com.wassistemas.tasko.agenda.application.port.out.agendavisitacheckin;

import br.com.wassistemas.tasko.agenda.domain.agendavisitacheckin.AtualizarAgendaVisitaCheckin;
import br.com.wassistemas.tasko.agenda.domain.agendavisitacheckin.AgendaVisitaCheckin;

public interface AtualizarAgendaVisitaCheckinPort {
    AgendaVisitaCheckin atualizarAgendaVisitaCheckin(Long id, AtualizarAgendaVisitaCheckin atualizar);
}
