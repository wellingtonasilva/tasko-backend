package br.com.wassitemas.tasko.produto.adapter.out.persistence;

import br.com.wassitemas.tasko.produto.adapter.out.persistence.mapper.ProdutoCodigoBarrasEntityMapper;
import br.com.wassitemas.tasko.produto.adapter.out.persistence.repository.ProdutoCodigoBarrasRepository;
import br.com.wassitemas.tasko.produto.application.port.out.produtocodigobarras.AdicionarProdutoCodigoBarrasPort;
import br.com.wassitemas.tasko.produto.application.port.out.produtocodigobarras.AtualizarProdutoCodigoBarrasPort;
import br.com.wassitemas.tasko.produto.application.port.out.produtocodigobarras.ExcluirProdutoCodigoBarrasPorIdPort;
import br.com.wassitemas.tasko.produto.application.port.out.produtocodigobarras.ListarProdutoCodigoBarrasPort;
import br.com.wassitemas.tasko.produto.application.port.out.produtocodigobarras.ObterProdutoCodigoBarrasPorIdPort;
import br.com.wassitemas.tasko.produto.domain.produtocodigobarras.AdicionarProdutoCodigoBarras;
import br.com.wassitemas.tasko.produto.domain.produtocodigobarras.AtualizarProdutoCodigoBarras;
import br.com.wassitemas.tasko.produto.domain.produtocodigobarras.ProdutoCodigoBarras;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProdutoCodigoBarrasPersistenceAdapter implements AdicionarProdutoCodigoBarrasPort,
    AtualizarProdutoCodigoBarrasPort,
    ExcluirProdutoCodigoBarrasPorIdPort, ListarProdutoCodigoBarrasPort,
    ObterProdutoCodigoBarrasPorIdPort {

    private final ProdutoCodigoBarrasRepository repository;
    private final ProdutoCodigoBarrasEntityMapper mapper;

    @Override
    public ProdutoCodigoBarras adicionarProdutoCodigoBarras(AdicionarProdutoCodigoBarras adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public ProdutoCodigoBarras atualizarProdutoCodigoBarras(Long id, AtualizarProdutoCodigoBarras atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirProdutoCodigoBarrasPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<ProdutoCodigoBarras> listarProdutoCodigoBarras(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public ProdutoCodigoBarras obterProdutoCodigoBarrasPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
