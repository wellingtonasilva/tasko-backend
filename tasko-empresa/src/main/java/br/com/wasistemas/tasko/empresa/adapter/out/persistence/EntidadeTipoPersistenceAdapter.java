package br.com.wasistemas.tasko.empresa.adapter.out.persistence;

import br.com.wasistemas.tasko.empresa.adapter.out.persistence.mapper.EntidadeTipoEntityMapper;
import br.com.wasistemas.tasko.empresa.adapter.out.persistence.repository.EntidadeTipoRepository;
import br.com.wasistemas.tasko.empresa.application.port.out.entidadetipo.*;
import br.com.wasistemas.tasko.empresa.domain.entidadetipo.AdicionarEntidadeTipo;
import br.com.wasistemas.tasko.empresa.domain.entidadetipo.AtualizarEntidadeTipo;
import br.com.wasistemas.tasko.empresa.domain.entidadetipo.EntidadeTipo;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EntidadeTipoPersistenceAdapter implements AdicionarEntidadeTipoPort, AtualizarEntidadeTipoPort,
        ExcluirEntidadeTipoPorIdPort, ListarEntidadeTipoPort, ObterEntidadeTipoPorIdPort {

    private final EntidadeTipoRepository repository;
    private final EntidadeTipoEntityMapper mapper;

    @Override
    public EntidadeTipo adicionarEntidadeTipo(AdicionarEntidadeTipo adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public EntidadeTipo atualizarEntidadeTipo(Long id, AtualizarEntidadeTipo atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirEntidadeTipoPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<EntidadeTipo> listarEntidadeTipo(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public EntidadeTipo obterEntidadeTipoPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
