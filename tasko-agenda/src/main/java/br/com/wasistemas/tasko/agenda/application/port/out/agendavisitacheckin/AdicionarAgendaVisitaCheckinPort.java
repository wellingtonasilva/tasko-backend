package br.com.wasistemas.tasko.agenda.application.port.out.agendavisitacheckin;

import br.com.wasistemas.tasko.agenda.domain.agendavisitacheckin.AdicionarAgendaVisitaCheckin;
import br.com.wasistemas.tasko.agenda.domain.agendavisitacheckin.AgendaVisitaCheckin;

public interface AdicionarAgendaVisitaCheckinPort {
    AgendaVisitaCheckin adicionarAgendaVisitaCheckin(AdicionarAgendaVisitaCheckin adicionar);
}
