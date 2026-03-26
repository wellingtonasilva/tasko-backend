package br.com.wasistemas.tasko.empresa.adapter.out.persistence;

import br.com.wasistemas.tasko.empresa.adapter.out.persistence.mapper.TabelaPrecoTipoEntityMapper;
import br.com.wasistemas.tasko.empresa.adapter.out.persistence.repository.TabelaPrecoTipoRepository;
import br.com.wasistemas.tasko.empresa.application.port.out.tabelaprecotipo.*;
import br.com.wasistemas.tasko.empresa.domain.tabelaprecotipo.AdicionarTabelaPrecoTipo;
import br.com.wasistemas.tasko.empresa.domain.tabelaprecotipo.AtualizarTabelaPrecoTipo;
import br.com.wasistemas.tasko.empresa.domain.tabelaprecotipo.TabelaPrecoTipo;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TabelaPrecoTipoPersistenceAdapter implements AdicionarTabelaPrecoTipoPort, AtualizarTabelaPrecoTipoPort,
        ExcluirTabelaPrecoTipoPorIdPort, ListarTabelaPrecoTipoPort, ObterTabelaPrecoTipoPorIdPort {

    private final TabelaPrecoTipoRepository repository;
    private final TabelaPrecoTipoEntityMapper mapper;

    @Override
    public TabelaPrecoTipo adicionarTabelaPrecoTipo(AdicionarTabelaPrecoTipo adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public TabelaPrecoTipo atualizarTabelaPrecoTipo(Long id, AtualizarTabelaPrecoTipo atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirTabelaPrecoTipoPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<TabelaPrecoTipo> listarTabelaPrecoTipo(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public TabelaPrecoTipo obterTabelaPrecoTipoPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
