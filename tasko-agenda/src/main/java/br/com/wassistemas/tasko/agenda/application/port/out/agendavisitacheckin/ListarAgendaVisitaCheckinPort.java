package br.com.wassistemas.tasko.agenda.application.port.out.agendavisitacheckin;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.agenda.domain.agendavisitacheckin.AgendaVisitaCheckin;
import java.util.List;

public interface ListarAgendaVisitaCheckinPort {
    List<AgendaVisitaCheckin> listarAgendaVisitaCheckin(Paginacao paginacao);
}
