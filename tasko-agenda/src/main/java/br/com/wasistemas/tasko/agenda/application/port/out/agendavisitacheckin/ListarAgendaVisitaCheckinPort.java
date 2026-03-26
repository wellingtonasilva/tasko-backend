package br.com.wasistemas.tasko.agenda.application.port.out.agendavisitacheckin;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.agenda.domain.agendavisitacheckin.AgendaVisitaCheckin;
import java.util.List;

public interface ListarAgendaVisitaCheckinPort {
    List<AgendaVisitaCheckin> listarAgendaVisitaCheckin(Paginacao paginacao);
}
