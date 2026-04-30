package br.com.wassistemas.tasko.produto.adapter.out.persistence;

import br.com.wassistemas.tasko.produto.adapter.out.persistence.mapper.ProdutoPrecoEntityMapper;
import br.com.wassistemas.tasko.produto.adapter.out.persistence.repository.ProdutoPrecoRepository;
import br.com.wassistemas.tasko.produto.application.port.out.produtopreco.AdicionarProdutoPrecoPort;
import br.com.wassistemas.tasko.produto.application.port.out.produtopreco.AtualizarProdutoPrecoPort;
import br.com.wassistemas.tasko.produto.application.port.out.produtopreco.ExcluirProdutoPrecoPorIdPort;
import br.com.wassistemas.tasko.produto.application.port.out.produtopreco.ListarProdutoPrecoPort;
import br.com.wassistemas.tasko.produto.application.port.out.produtopreco.ObterProdutoPrecoPorIdPort;
import br.com.wassistemas.tasko.produto.domain.produtopreco.AdicionarProdutoPreco;
import br.com.wassistemas.tasko.produto.domain.produtopreco.AtualizarProdutoPreco;
import br.com.wassistemas.tasko.produto.domain.produtopreco.ProdutoPreco;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProdutoPrecoPersistenceAdapter implements AdicionarProdutoPrecoPort,
    AtualizarProdutoPrecoPort,
    ExcluirProdutoPrecoPorIdPort, ListarProdutoPrecoPort, ObterProdutoPrecoPorIdPort {

    private final ProdutoPrecoRepository repository;
    private final ProdutoPrecoEntityMapper mapper;

    @Override
    public ProdutoPreco adicionarProdutoPreco(AdicionarProdutoPreco adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public ProdutoPreco atualizarProdutoPreco(Long id, AtualizarProdutoPreco atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirProdutoPrecoPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<ProdutoPreco> listarProdutoPreco(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public ProdutoPreco obterProdutoPrecoPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
