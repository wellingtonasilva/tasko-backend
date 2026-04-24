package br.com.wassistemas.tasko.agenda.adapter.out.persistence;

import br.com.wassistemas.tasko.agenda.adapter.out.persistence.mapper.AgendaVisitaCheckinEntityMapper;
import br.com.wassistemas.tasko.agenda.adapter.out.persistence.repository.AgendaVisitaCheckinRepository;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisitacheckin.AdicionarAgendaVisitaCheckinPort;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisitacheckin.AtualizarAgendaVisitaCheckinPort;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisitacheckin.ExcluirAgendaVisitaCheckinPorIdPort;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisitacheckin.ListarAgendaVisitaCheckinPort;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisitacheckin.ObterAgendaVisitaCheckinPorIdPort;
import br.com.wassistemas.tasko.agenda.domain.agendavisitacheckin.AdicionarAgendaVisitaCheckin;
import br.com.wassistemas.tasko.agenda.domain.agendavisitacheckin.AtualizarAgendaVisitaCheckin;
import br.com.wassistemas.tasko.agenda.domain.agendavisitacheckin.AgendaVisitaCheckin;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AgendaVisitaCheckinPersistenceAdapter implements AdicionarAgendaVisitaCheckinPort,
    AtualizarAgendaVisitaCheckinPort,
    ExcluirAgendaVisitaCheckinPorIdPort, ListarAgendaVisitaCheckinPort,
    ObterAgendaVisitaCheckinPorIdPort {

    private final AgendaVisitaCheckinRepository repository;
    private final AgendaVisitaCheckinEntityMapper mapper;

    @Override
    public AgendaVisitaCheckin adicionarAgendaVisitaCheckin(AdicionarAgendaVisitaCheckin adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public AgendaVisitaCheckin atualizarAgendaVisitaCheckin(Long id, AtualizarAgendaVisitaCheckin atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirAgendaVisitaCheckinPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<AgendaVisitaCheckin> listarAgendaVisitaCheckin(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public AgendaVisitaCheckin obterAgendaVisitaCheckinPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
