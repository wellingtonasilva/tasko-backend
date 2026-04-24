package br.com.wassistemas.tasko.agenda.application.port.out.agendavisita;

import br.com.wassistemas.tasko.agenda.domain.agendavisita.AgendaVisita;

public interface ObterAgendaVisitaPorIdPort {
    AgendaVisita obterAgendaVisitaPorId(Long id);
}
