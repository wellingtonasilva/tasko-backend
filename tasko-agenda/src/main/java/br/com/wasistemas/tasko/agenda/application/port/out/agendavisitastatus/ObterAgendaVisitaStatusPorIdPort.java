package br.com.wasistemas.tasko.agenda.application.port.out.agendavisitastatus;

import br.com.wasistemas.tasko.agenda.domain.agendavisitastatus.AgendaVisitaStatus;

public interface ObterAgendaVisitaStatusPorIdPort {
    AgendaVisitaStatus obterAgendaVisitaStatusPorId(Long id);
}
