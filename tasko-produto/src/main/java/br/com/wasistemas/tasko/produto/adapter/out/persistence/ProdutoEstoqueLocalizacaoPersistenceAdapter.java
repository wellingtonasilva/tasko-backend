package br.com.wasistemas.tasko.produto.adapter.out.persistence;

import br.com.wasistemas.tasko.produto.adapter.out.persistence.mapper.ProdutoEstoqueLocalizacaoEntityMapper;
import br.com.wasistemas.tasko.produto.adapter.out.persistence.repository.ProdutoEstoqueLocalizacaoRepository;
import br.com.wasistemas.tasko.produto.application.port.out.produtoestoque.*;
import br.com.wasistemas.tasko.produto.domain.produtoestoque.AdicionarProdutoEstoqueLocalizacao;
import br.com.wasistemas.tasko.produto.domain.produtoestoque.AtualizarProdutoEstoqueLocalizacao;
import br.com.wasistemas.tasko.produto.domain.produtoestoque.ProdutoEstoqueLocalizacao;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProdutoEstoqueLocalizacaoPersistenceAdapter implements AdicionarProdutoEstoqueLocalizacaoPort, AtualizarProdutoEstoqueLocalizacaoPort,
        ExcluirProdutoEstoqueLocalizacaoPorIdPort, ListarProdutoEstoqueLocalizacaoPort, ObterProdutoEstoqueLocalizacaoPorIdPort {

    private final ProdutoEstoqueLocalizacaoRepository repository;
    private final ProdutoEstoqueLocalizacaoEntityMapper mapper;

    @Override
    public ProdutoEstoqueLocalizacao adicionarProdutoEstoqueLocalizacao(AdicionarProdutoEstoqueLocalizacao adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public ProdutoEstoqueLocalizacao atualizarProdutoEstoqueLocalizacao(Long id, AtualizarProdutoEstoqueLocalizacao atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirProdutoEstoqueLocalizacaoPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<ProdutoEstoqueLocalizacao> listarProdutoEstoqueLocalizacao(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public ProdutoEstoqueLocalizacao obterProdutoEstoqueLocalizacaoPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
