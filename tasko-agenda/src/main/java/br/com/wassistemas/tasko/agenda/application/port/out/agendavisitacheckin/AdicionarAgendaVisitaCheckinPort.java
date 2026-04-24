package br.com.wassistemas.tasko.agenda.application.port.out.agendavisitacheckin;

import br.com.wassistemas.tasko.agenda.domain.agendavisitacheckin.AdicionarAgendaVisitaCheckin;
import br.com.wassistemas.tasko.agenda.domain.agendavisitacheckin.AgendaVisitaCheckin;

public interface AdicionarAgendaVisitaCheckinPort {
    AgendaVisitaCheckin adicionarAgendaVisitaCheckin(AdicionarAgendaVisitaCheckin adicionar);
}
