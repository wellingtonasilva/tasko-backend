package br.com.wassistemas.tasko.agenda.application.port.out.agendavisitastatus;

import br.com.wassistemas.tasko.agenda.domain.agendavisitastatus.AtualizarAgendaVisitaStatus;
import br.com.wassistemas.tasko.agenda.domain.agendavisitastatus.AgendaVisitaStatus;

public interface AtualizarAgendaVisitaStatusPort {
    AgendaVisitaStatus atualizarAgendaVisitaStatus(Long id, AtualizarAgendaVisitaStatus atualizar);
}
