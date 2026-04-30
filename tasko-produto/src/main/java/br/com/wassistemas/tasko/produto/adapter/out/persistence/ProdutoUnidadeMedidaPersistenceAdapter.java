package br.com.wassistemas.tasko.produto.adapter.out.persistence;

import br.com.wassistemas.tasko.produto.adapter.out.persistence.mapper.ProdutoUnidadeMedidaEntityMapper;
import br.com.wassistemas.tasko.produto.adapter.out.persistence.repository.ProdutoUnidadeMedidaRepository;
import br.com.wassistemas.tasko.produto.application.port.out.unidademedida.AdicionarProdutoUnidadeMedidaPort;
import br.com.wassistemas.tasko.produto.application.port.out.unidademedida.AtualizarProdutoUnidadeMedidaPort;
import br.com.wassistemas.tasko.produto.application.port.out.unidademedida.ExcluirProdutoUnidadeMedidaPorIdPort;
import br.com.wassistemas.tasko.produto.application.port.out.unidademedida.ListarProdutoUnidadeMedidaPort;
import br.com.wassistemas.tasko.produto.application.port.out.unidademedida.ObterProdutoUnidadeMedidaPorIdPort;
import br.com.wassistemas.tasko.produto.domain.unidademedida.AdicionarProdutoUnidadeMedida;
import br.com.wassistemas.tasko.produto.domain.unidademedida.AtualizarProdutoUnidadeMedida;
import br.com.wassistemas.tasko.produto.domain.unidademedida.ProdutoUnidadeMedida;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProdutoUnidadeMedidaPersistenceAdapter implements AdicionarProdutoUnidadeMedidaPort,
    AtualizarProdutoUnidadeMedidaPort,
    ExcluirProdutoUnidadeMedidaPorIdPort, ListarProdutoUnidadeMedidaPort,
    ObterProdutoUnidadeMedidaPorIdPort {

    private final ProdutoUnidadeMedidaRepository repository;
    private final ProdutoUnidadeMedidaEntityMapper mapper;

    @Override
    public ProdutoUnidadeMedida adicionarProdutoUnidadeMedida(AdicionarProdutoUnidadeMedida adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public ProdutoUnidadeMedida atualizarProdutoUnidadeMedida(Long id, AtualizarProdutoUnidadeMedida atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirProdutoUnidadeMedidaPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<ProdutoUnidadeMedida> listarProdutoUnidadeMedida(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public ProdutoUnidadeMedida obterProdutoUnidadeMedidaPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
