package br.com.wasistemas.tasko.agenda.application.port.out.agendavisitacheckin;

import br.com.wasistemas.tasko.agenda.domain.agendavisitacheckin.AgendaVisitaCheckin;

public interface ObterAgendaVisitaCheckinPorIdPort {
    AgendaVisitaCheckin obterAgendaVisitaCheckinPorId(Long id);
}
