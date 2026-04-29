package br.com.wassistemas.tasko.agenda.application.service;

import br.com.wassistemas.tasko.agenda.application.port.in.usecases.AgendaVisitaUseCases;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisita.AdicionarAgendaVisitaPort;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisita.AtualizarAgendaVisitaPort;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisita.ExcluirAgendaVisitaPorIdPort;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisita.ListarAgendaVisitaPort;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisita.ObterAgendaVisitaPorIdPort;
import br.com.wassistemas.tasko.agenda.domain.agendavisita.AdicionarAgendaVisita;
import br.com.wassistemas.tasko.agenda.domain.agendavisita.AtualizarAgendaVisita;
import br.com.wassistemas.tasko.agenda.domain.agendavisita.AgendaVisita;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AgendaVisitaService implements AgendaVisitaUseCases {

    private final AdicionarAgendaVisitaPort adicionarAgendaVisitaPort;
    private final AtualizarAgendaVisitaPort atualizarAgendaVisitaPort;
    private final ExcluirAgendaVisitaPorIdPort excluirAgendaVisitaPorIdPort;
    private final ListarAgendaVisitaPort listarAgendaVisitaPort;
    private final ObterAgendaVisitaPorIdPort obterAgendaVisitaPorIdPort;

    @Override
    public AgendaVisita adicionar(Long empresaId, AdicionarAgendaVisita adicionar) {
        return adicionarAgendaVisitaPort.adicionarAgendaVisita(adicionar);
    }

    @Override
    public List<AgendaVisita> listar(Long empresaId, Paginacao paginacao) {
        return listarAgendaVisitaPort.listarAgendaVisita(paginacao);
    }

    @Override
    public AgendaVisita obterPorId(Long empresaId, Long id) {
        return obterAgendaVisitaPorIdPort.obterAgendaVisitaPorId(id);
    }

    @Override
    public AgendaVisita atualizar(Long empresaId, Long id, AtualizarAgendaVisita atualizar) {
        return atualizarAgendaVisitaPort.atualizarAgendaVisita(id, atualizar);
    }

    @Override
    public void excluirPorId(Long empresaId, Long id) {
        excluirAgendaVisitaPorIdPort.excluirAgendaVisitaPorId(id);
    }
}
