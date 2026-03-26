package br.com.wasistemas.tasko.agenda.application.port.out.agendavisitastatus;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.agenda.domain.agendavisitastatus.AgendaVisitaStatus;
import java.util.List;

public interface ListarAgendaVisitaStatusPort {
    List<AgendaVisitaStatus> listarAgendaVisitaStatus(Paginacao paginacao);
}
