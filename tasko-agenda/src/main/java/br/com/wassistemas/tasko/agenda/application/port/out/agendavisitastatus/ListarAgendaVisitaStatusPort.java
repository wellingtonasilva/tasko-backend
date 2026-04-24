package br.com.wassistemas.tasko.agenda.application.port.out.agendavisitastatus;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.agenda.domain.agendavisitastatus.AgendaVisitaStatus;
import java.util.List;

public interface ListarAgendaVisitaStatusPort {
    List<AgendaVisitaStatus> listarAgendaVisitaStatus(Paginacao paginacao);
}
