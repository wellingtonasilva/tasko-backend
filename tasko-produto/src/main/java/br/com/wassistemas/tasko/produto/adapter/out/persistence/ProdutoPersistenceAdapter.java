package br.com.wassistemas.tasko.produto.adapter.out.persistence;

import br.com.wassistemas.tasko.produto.adapter.out.persistence.entity.ProdutoEntity;
import br.com.wassistemas.tasko.produto.adapter.out.persistence.mapper.ProdutoEntityMapper;
import br.com.wassistemas.tasko.produto.adapter.out.persistence.repository.ProdutoRepository;
import br.com.wassistemas.tasko.produto.application.port.out.produto.AdicionarProdutoPort;
import br.com.wassistemas.tasko.produto.application.port.out.produto.AtualizarProdutoPort;
import br.com.wassistemas.tasko.produto.application.port.out.produto.ExcluirProdutoPorIdPort;
import br.com.wassistemas.tasko.produto.application.port.out.produto.ListarProdutoPort;
import br.com.wassistemas.tasko.produto.application.port.out.produto.ObterProdutoPorIdPort;
import br.com.wassistemas.tasko.produto.domain.produto.AdicionarProduto;
import br.com.wassistemas.tasko.produto.domain.produto.AtualizarProduto;
import br.com.wassistemas.tasko.produto.domain.produto.Produto;
import br.com.wassistemas.tasko.common.domain.Paginacao;
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
        ProdutoEntity entity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        mapper.updateProdutoEntity(atualizar, entity);

        return mapper.toDomain(repository.save(entity));
    }

    @Override
    public void excluirProdutoPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Produto> listarProduto(Long empresaId, Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAllByEmpresaId(empresaId, pageable).map(mapper::toDomain).toList();
    }

    @Override
    public Produto obterProdutoPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
