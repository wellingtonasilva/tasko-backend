package br.com.wassistemas.tasko.agenda.application.port.out.agendavisitacheckin;

import br.com.wassistemas.tasko.agenda.domain.agendavisitacheckin.AgendaVisitaCheckin;

public interface ObterAgendaVisitaCheckinPorIdPort {
    AgendaVisitaCheckin obterAgendaVisitaCheckinPorId(Long id);
}
