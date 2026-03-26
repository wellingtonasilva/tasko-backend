package br.com.wasistemas.tasko.agenda.application.port.out.agendavisita;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.agenda.domain.agendavisita.AgendaVisita;
import java.util.List;

public interface ListarAgendaVisitaPort {
    List<AgendaVisita> listarAgendaVisita(Paginacao paginacao);
}
