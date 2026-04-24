package br.com.wassistemas.tasko.agenda.application.port.out.agendavisita;

import br.com.wassistemas.tasko.agenda.domain.agendavisita.AtualizarAgendaVisita;
import br.com.wassistemas.tasko.agenda.domain.agendavisita.AgendaVisita;

public interface AtualizarAgendaVisitaPort {
    AgendaVisita atualizarAgendaVisita(Long id, AtualizarAgendaVisita atualizar);
}
