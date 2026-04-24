package br.com.wassistemas.tasko.agenda.adapter.out.persistence;

import br.com.wassistemas.tasko.agenda.adapter.out.persistence.mapper.AgendaVisitaStatusEntityMapper;
import br.com.wassistemas.tasko.agenda.adapter.out.persistence.repository.AgendaVisitaStatusRepository;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisitastatus.AdicionarAgendaVisitaStatusPort;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisitastatus.AtualizarAgendaVisitaStatusPort;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisitastatus.ExcluirAgendaVisitaStatusPorIdPort;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisitastatus.ListarAgendaVisitaStatusPort;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisitastatus.ObterAgendaVisitaStatusPorIdPort;
import br.com.wassistemas.tasko.agenda.domain.agendavisitastatus.AdicionarAgendaVisitaStatus;
import br.com.wassistemas.tasko.agenda.domain.agendavisitastatus.AtualizarAgendaVisitaStatus;
import br.com.wassistemas.tasko.agenda.domain.agendavisitastatus.AgendaVisitaStatus;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AgendaVisitaStatusPersistenceAdapter implements AdicionarAgendaVisitaStatusPort,
    AtualizarAgendaVisitaStatusPort,
    ExcluirAgendaVisitaStatusPorIdPort, ListarAgendaVisitaStatusPort,
    ObterAgendaVisitaStatusPorIdPort {

    private final AgendaVisitaStatusRepository repository;
    private final AgendaVisitaStatusEntityMapper mapper;

    @Override
    public AgendaVisitaStatus adicionarAgendaVisitaStatus(AdicionarAgendaVisitaStatus adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public AgendaVisitaStatus atualizarAgendaVisitaStatus(Long id, AtualizarAgendaVisitaStatus atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirAgendaVisitaStatusPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<AgendaVisitaStatus> listarAgendaVisitaStatus(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public AgendaVisitaStatus obterAgendaVisitaStatusPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
