package br.com.wasistemas.tasko.agenda.application.port.out.agendavisita;

import br.com.wasistemas.tasko.agenda.domain.agendavisita.AdicionarAgendaVisita;
import br.com.wasistemas.tasko.agenda.domain.agendavisita.AgendaVisita;

public interface AdicionarAgendaVisitaPort {
    AgendaVisita adicionarAgendaVisita(AdicionarAgendaVisita adicionar);
}
