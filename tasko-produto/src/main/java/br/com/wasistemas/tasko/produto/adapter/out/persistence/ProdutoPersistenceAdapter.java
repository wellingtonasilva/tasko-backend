package br.com.wasistemas.tasko.produto.adapter.out.persistence;

import br.com.wasistemas.tasko.produto.adapter.out.persistence.mapper.ProdutoEntityMapper;
import br.com.wasistemas.tasko.produto.adapter.out.persistence.repository.ProdutoRepository;
import br.com.wasistemas.tasko.produto.application.port.out.produto.*;
import br.com.wasistemas.tasko.produto.domain.produto.AdicionarProduto;
import br.com.wasistemas.tasko.produto.domain.produto.AtualizarProduto;
import br.com.wasistemas.tasko.produto.domain.produto.Produto;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProdutoPersistenceAdapter implements AdicionarProdutoPort, AtualizarProdutoPort,
        ExcluirProdutoPorIdPort, ListarProdutoPort, ObterProdutoPorIdPort {

    private final ProdutoRepository repository;
    private final ProdutoEntityMapper mapper;

    @Override
    public Produto adicionarProduto(AdicionarProduto adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public Produto atualizarProduto(Long id, AtualizarProduto atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirProdutoPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Produto> listarProduto(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public Produto obterProdutoPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
