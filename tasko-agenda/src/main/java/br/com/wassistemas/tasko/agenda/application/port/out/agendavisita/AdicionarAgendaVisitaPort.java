package br.com.wassistemas.tasko.agenda.application.port.out.agendavisita;

import br.com.wassistemas.tasko.agenda.domain.agendavisita.AdicionarAgendaVisita;
import br.com.wassistemas.tasko.agenda.domain.agendavisita.AgendaVisita;

public interface AdicionarAgendaVisitaPort {
    AgendaVisita adicionarAgendaVisita(AdicionarAgendaVisita adicionar);
}
