package br.com.wasistemas.tasko.agenda.application.port.out.agendavisitastatus;

import br.com.wasistemas.tasko.agenda.domain.agendavisitastatus.AtualizarAgendaVisitaStatus;
import br.com.wasistemas.tasko.agenda.domain.agendavisitastatus.AgendaVisitaStatus;

public interface AtualizarAgendaVisitaStatusPort {
    AgendaVisitaStatus atualizarAgendaVisitaStatus(Long id, AtualizarAgendaVisitaStatus atualizar);
}
