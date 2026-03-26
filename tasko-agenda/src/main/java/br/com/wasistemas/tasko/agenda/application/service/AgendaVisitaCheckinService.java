package br.com.wasistemas.tasko.agenda.application.service;

import br.com.wasistemas.tasko.agenda.application.port.in.usecases.AgendaVisitaCheckinUseCases;
import br.com.wasistemas.tasko.agenda.application.port.out.agendavisitacheckin.*;
import br.com.wasistemas.tasko.agenda.domain.agendavisitacheckin.AdicionarAgendaVisitaCheckin;
import br.com.wasistemas.tasko.agenda.domain.agendavisitacheckin.AtualizarAgendaVisitaCheckin;
import br.com.wasistemas.tasko.agenda.domain.agendavisitacheckin.AgendaVisitaCheckin;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AgendaVisitaCheckinService implements AgendaVisitaCheckinUseCases {

    private final AdicionarAgendaVisitaCheckinPort adicionarAgendaVisitaCheckinPort;
    private final AtualizarAgendaVisitaCheckinPort atualizarAgendaVisitaCheckinPort;
    private final ExcluirAgendaVisitaCheckinPorIdPort excluirAgendaVisitaCheckinPorIdPort;
    private final ListarAgendaVisitaCheckinPort listarAgendaVisitaCheckinPort;
    private final ObterAgendaVisitaCheckinPorIdPort obterAgendaVisitaCheckinPorIdPort;

    @Override
    public AgendaVisitaCheckin adicionar(AdicionarAgendaVisitaCheckin adicionar) {
        return adicionarAgendaVisitaCheckinPort.adicionarAgendaVisitaCheckin(adicionar);
    }

    @Override
    public List<AgendaVisitaCheckin> listar(Paginacao paginacao) {
        return listarAgendaVisitaCheckinPort.listarAgendaVisitaCheckin(paginacao);
    }

    @Override
    public AgendaVisitaCheckin obterPorId(Long id) {
        return obterAgendaVisitaCheckinPorIdPort.obterAgendaVisitaCheckinPorId(id);
    }

    @Override
    public AgendaVisitaCheckin atualizar(Long id, AtualizarAgendaVisitaCheckin atualizar) {
        return atualizarAgendaVisitaCheckinPort.atualizarAgendaVisitaCheckin(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirAgendaVisitaCheckinPorIdPort.excluirAgendaVisitaCheckinPorId(id);
    }
}
