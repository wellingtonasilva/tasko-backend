package br.com.wassistemas.tasko.agenda.application.port.out.agendavisitastatus;

import br.com.wassistemas.tasko.agenda.domain.agendavisitastatus.AgendaVisitaStatus;

public interface ObterAgendaVisitaStatusPorIdPort {
    AgendaVisitaStatus obterAgendaVisitaStatusPorId(Long id);
}
