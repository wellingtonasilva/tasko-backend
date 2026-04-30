package br.com.wassistemas.tasko.agenda.adapter.out.persistence;

import br.com.wassistemas.tasko.agenda.adapter.out.persistence.mapper.AgendaVisitaEntityMapper;
import br.com.wassistemas.tasko.agenda.adapter.out.persistence.repository.AgendaVisitaRepository;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisita.AdicionarAgendaVisitaPort;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisita.AtualizarAgendaVisitaPort;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisita.ExcluirAgendaVisitaPorIdPort;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisita.ListarAgendaVisitaPort;
import br.com.wassistemas.tasko.agenda.application.port.out.agendavisita.ObterAgendaVisitaPorIdPort;
import br.com.wassistemas.tasko.agenda.domain.agendavisita.AdicionarAgendaVisita;
import br.com.wassistemas.tasko.agenda.domain.agendavisita.AtualizarAgendaVisita;
import br.com.wassistemas.tasko.agenda.domain.agendavisita.AgendaVisita;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AgendaVisitaPersistenceAdapter implements AdicionarAgendaVisitaPort,
    AtualizarAgendaVisitaPort,
    ExcluirAgendaVisitaPorIdPort, ListarAgendaVisitaPort, ObterAgendaVisitaPorIdPort {

    private final AgendaVisitaRepository repository;
    private final AgendaVisitaEntityMapper mapper;

    @Override
    public AgendaVisita adicionarAgendaVisita(AdicionarAgendaVisita adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public AgendaVisita atualizarAgendaVisita(Long id, AtualizarAgendaVisita atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirAgendaVisitaPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<AgendaVisita> listarAgendaVisita(Long empresaId, Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findByEmpresaId(empresaId, pageable).map(mapper::toDomain).toList();
    }

    @Override
    public AgendaVisita obterAgendaVisitaPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
