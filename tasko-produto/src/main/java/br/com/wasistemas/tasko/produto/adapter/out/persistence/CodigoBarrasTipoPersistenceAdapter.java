package br.com.wasistemas.tasko.produto.adapter.out.persistence;

import br.com.wasistemas.tasko.produto.adapter.out.persistence.mapper.CodigoBarrasTipoEntityMapper;
import br.com.wasistemas.tasko.produto.adapter.out.persistence.repository.CodigoBarrasTipoRepository;
import br.com.wasistemas.tasko.produto.application.port.out.codigobarrastipo.*;
import br.com.wasistemas.tasko.produto.domain.codigobarrastipo.AdicionarCodigoBarrasTipo;
import br.com.wasistemas.tasko.produto.domain.codigobarrastipo.AtualizarCodigoBarrasTipo;
import br.com.wasistemas.tasko.produto.domain.codigobarrastipo.CodigoBarrasTipo;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CodigoBarrasTipoPersistenceAdapter implements AdicionarCodigoBarrasTipoPort, AtualizarCodigoBarrasTipoPort,
        ExcluirCodigoBarrasTipoPorIdPort, ListarCodigoBarrasTipoPort, ObterCodigoBarrasTipoPorIdPort {

    private final CodigoBarrasTipoRepository repository;
    private final CodigoBarrasTipoEntityMapper mapper;

    @Override
    public CodigoBarrasTipo adicionarCodigoBarrasTipo(AdicionarCodigoBarrasTipo adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public CodigoBarrasTipo atualizarCodigoBarrasTipo(Long id, AtualizarCodigoBarrasTipo atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirCodigoBarrasTipoPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<CodigoBarrasTipo> listarCodigoBarrasTipo(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public CodigoBarrasTipo obterCodigoBarrasTipoPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
