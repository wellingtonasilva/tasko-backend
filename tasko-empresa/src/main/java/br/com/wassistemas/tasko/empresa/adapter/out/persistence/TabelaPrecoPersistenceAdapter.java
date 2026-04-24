package br.com.wassistemas.tasko.empresa.adapter.out.persistence;

import br.com.wassistemas.tasko.empresa.adapter.out.persistence.mapper.TabelaPrecoEntityMapper;
import br.com.wassistemas.tasko.empresa.adapter.out.persistence.repository.TabelaPrecoRepository;
import br.com.wassistemas.tasko.empresa.application.port.out.tabelapreco.AdicionarTabelaPrecoPort;
import br.com.wassistemas.tasko.empresa.application.port.out.tabelapreco.AtualizarTabelaPrecoPort;
import br.com.wassistemas.tasko.empresa.application.port.out.tabelapreco.ExcluirTabelaPrecoPorIdPort;
import br.com.wassistemas.tasko.empresa.application.port.out.tabelapreco.ListarTabelaPrecoPort;
import br.com.wassistemas.tasko.empresa.application.port.out.tabelapreco.ObterTabelaPrecoPorIdPort;
import br.com.wassistemas.tasko.empresa.domain.tabelapreco.AdicionarTabelaPreco;
import br.com.wassistemas.tasko.empresa.domain.tabelapreco.AtualizarTabelaPreco;
import br.com.wassistemas.tasko.empresa.domain.tabelapreco.TabelaPreco;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TabelaPrecoPersistenceAdapter implements AdicionarTabelaPrecoPort,
    AtualizarTabelaPrecoPort,
    ExcluirTabelaPrecoPorIdPort, ListarTabelaPrecoPort, ObterTabelaPrecoPorIdPort {

    private final TabelaPrecoRepository repository;
    private final TabelaPrecoEntityMapper mapper;

    @Override
    public TabelaPreco adicionarTabelaPreco(AdicionarTabelaPreco adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public TabelaPreco atualizarTabelaPreco(Long id, AtualizarTabelaPreco atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirTabelaPrecoPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<TabelaPreco> listarTabelaPreco(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public TabelaPreco obterTabelaPrecoPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
