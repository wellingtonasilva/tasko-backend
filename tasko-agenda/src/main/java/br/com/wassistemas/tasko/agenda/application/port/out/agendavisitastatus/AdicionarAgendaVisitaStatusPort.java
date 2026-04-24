package br.com.wassistemas.tasko.agenda.application.port.out.agendavisitastatus;

import br.com.wassistemas.tasko.agenda.domain.agendavisitastatus.AdicionarAgendaVisitaStatus;
import br.com.wassistemas.tasko.agenda.domain.agendavisitastatus.AgendaVisitaStatus;

public interface AdicionarAgendaVisitaStatusPort {
    AgendaVisitaStatus adicionarAgendaVisitaStatus(AdicionarAgendaVisitaStatus adicionar);
}
