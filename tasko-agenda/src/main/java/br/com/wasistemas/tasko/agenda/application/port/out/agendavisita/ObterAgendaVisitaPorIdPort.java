package br.com.wasistemas.tasko.agenda.application.port.out.agendavisita;

import br.com.wasistemas.tasko.agenda.domain.agendavisita.AgendaVisita;

public interface ObterAgendaVisitaPorIdPort {
    AgendaVisita obterAgendaVisitaPorId(Long id);
}
