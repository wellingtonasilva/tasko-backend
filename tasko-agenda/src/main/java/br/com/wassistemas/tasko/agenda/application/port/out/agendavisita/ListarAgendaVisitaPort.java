package br.com.wassistemas.tasko.agenda.application.port.out.agendavisita;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.agenda.domain.agendavisita.AgendaVisita;
import java.util.List;

public interface ListarAgendaVisitaPort {
    List<AgendaVisita> listarAgendaVisita(Long empresaId, Paginacao paginacao);
}
