package br.com.wasistemas.tasko.agenda.adapter.out.persistence;

import br.com.wasistemas.tasko.agenda.adapter.out.persistence.mapper.CheckinsTipoEntityMapper;
import br.com.wasistemas.tasko.agenda.adapter.out.persistence.repository.CheckinsTipoRepository;
import br.com.wasistemas.tasko.agenda.application.port.out.checkinstipo.*;
import br.com.wasistemas.tasko.agenda.domain.checkinstipo.AdicionarCheckinsTipo;
import br.com.wasistemas.tasko.agenda.domain.checkinstipo.AtualizarCheckinsTipo;
import br.com.wasistemas.tasko.agenda.domain.checkinstipo.CheckinsTipo;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CheckinsTipoPersistenceAdapter implements AdicionarCheckinsTipoPort, AtualizarCheckinsTipoPort,
        ExcluirCheckinsTipoPorIdPort, ListarCheckinsTipoPort, ObterCheckinsTipoPorIdPort {

    private final CheckinsTipoRepository repository;
    private final CheckinsTipoEntityMapper mapper;

    @Override
    public CheckinsTipo adicionarCheckinsTipo(AdicionarCheckinsTipo adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public CheckinsTipo atualizarCheckinsTipo(Long id, AtualizarCheckinsTipo atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirCheckinsTipoPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<CheckinsTipo> listarCheckinsTipo(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public CheckinsTipo obterCheckinsTipoPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
