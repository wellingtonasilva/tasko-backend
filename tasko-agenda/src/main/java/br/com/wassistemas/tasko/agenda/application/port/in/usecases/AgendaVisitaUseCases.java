package br.com.wassistemas.tasko.agenda.application.port.in.usecases;

import br.com.wassistemas.tasko.agenda.domain.agendavisita.AdicionarAgendaVisita;
import br.com.wassistemas.tasko.agenda.domain.agendavisita.AtualizarAgendaVisita;
import br.com.wassistemas.tasko.agenda.domain.agendavisita.AgendaVisita;
import br.com.wassistemas.tasko.common.usecases.TenantUseCase;

public interface AgendaVisitaUseCases extends
    TenantUseCase<AgendaVisita, AdicionarAgendaVisita, AtualizarAgendaVisita> {
}
