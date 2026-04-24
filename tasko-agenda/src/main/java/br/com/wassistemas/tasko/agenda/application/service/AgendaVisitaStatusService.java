package br.com.wassistemas.tasko.agenda.application.service;

import br.com.wassistemas.tasko.agenda.application.port.in.usecases.AgendaVisitaStatusUseCases;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisitastatus.AdicionarAgendaVisitaStatusPort;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisitastatus.AtualizarAgendaVisitaStatusPort;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisitastatus.ExcluirAgendaVisitaStatusPorIdPort;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisitastatus.ListarAgendaVisitaStatusPort;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisitastatus.ObterAgendaVisitaStatusPorIdPort;
import br.com.wassistemas.tasko.agenda.domain.agendavisitastatus.AdicionarAgendaVisitaStatus;
import br.com.wassistemas.tasko.agenda.domain.agendavisitastatus.AtualizarAgendaVisitaStatus;
import br.com.wassistemas.tasko.agenda.domain.agendavisitastatus.AgendaVisitaStatus;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AgendaVisitaStatusService implements AgendaVisitaStatusUseCases {

    private final AdicionarAgendaVisitaStatusPort adicionarAgendaVisitaStatusPort;
    private final AtualizarAgendaVisitaStatusPort atualizarAgendaVisitaStatusPort;
    private final ExcluirAgendaVisitaStatusPorIdPort excluirAgendaVisitaStatusPorIdPort;
    private final ListarAgendaVisitaStatusPort listarAgendaVisitaStatusPort;
    private final ObterAgendaVisitaStatusPorIdPort obterAgendaVisitaStatusPorIdPort;

    @Override
    public AgendaVisitaStatus adicionar(AdicionarAgendaVisitaStatus adicionar) {
        return adicionarAgendaVisitaStatusPort.adicionarAgendaVisitaStatus(adicionar);
    }

    @Override
    public List<AgendaVisitaStatus> listar(Paginacao paginacao) {
        return listarAgendaVisitaStatusPort.listarAgendaVisitaStatus(paginacao);
    }

    @Override
    public AgendaVisitaStatus obterPorId(Long id) {
        return obterAgendaVisitaStatusPorIdPort.obterAgendaVisitaStatusPorId(id);
    }

    @Override
    public AgendaVisitaStatus atualizar(Long id, AtualizarAgendaVisitaStatus atualizar) {
        return atualizarAgendaVisitaStatusPort.atualizarAgendaVisitaStatus(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirAgendaVisitaStatusPorIdPort.excluirAgendaVisitaStatusPorId(id);
    }
}
