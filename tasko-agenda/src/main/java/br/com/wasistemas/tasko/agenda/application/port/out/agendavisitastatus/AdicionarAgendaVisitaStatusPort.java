package br.com.wasistemas.tasko.agenda.application.port.out.agendavisitastatus;

import br.com.wasistemas.tasko.agenda.domain.agendavisitastatus.AdicionarAgendaVisitaStatus;
import br.com.wasistemas.tasko.agenda.domain.agendavisitastatus.AgendaVisitaStatus;

public interface AdicionarAgendaVisitaStatusPort {
    AgendaVisitaStatus adicionarAgendaVisitaStatus(AdicionarAgendaVisitaStatus adicionar);
}
