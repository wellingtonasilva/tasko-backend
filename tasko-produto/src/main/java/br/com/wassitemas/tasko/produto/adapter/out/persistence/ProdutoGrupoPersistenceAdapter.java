package br.com.wassitemas.tasko.produto.adapter.out.persistence;

import br.com.wassitemas.tasko.produto.adapter.out.persistence.mapper.ProdutoGrupoEntityMapper;
import br.com.wassitemas.tasko.produto.adapter.out.persistence.repository.ProdutoGrupoRepository;
import br.com.wassitemas.tasko.produto.application.port.out.grupo.AdicionarProdutoGrupoPort;
import br.com.wassitemas.tasko.produto.application.port.out.grupo.AtualizarProdutoGrupoPort;
import br.com.wassitemas.tasko.produto.application.port.out.grupo.ExcluirProdutoGrupoPorIdPort;
import br.com.wassitemas.tasko.produto.application.port.out.grupo.ListarProdutoGrupoPort;
import br.com.wassitemas.tasko.produto.application.port.out.grupo.ObterProdutoGrupoPorIdPort;
import br.com.wassitemas.tasko.produto.domain.grupo.AdicionarProdutoGrupo;
import br.com.wassitemas.tasko.produto.domain.grupo.AtualizarProdutoGrupo;
import br.com.wassitemas.tasko.produto.domain.grupo.ProdutoGrupo;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProdutoGrupoPersistenceAdapter implements AdicionarProdutoGrupoPort,
    AtualizarProdutoGrupoPort,
    ExcluirProdutoGrupoPorIdPort, ListarProdutoGrupoPort, ObterProdutoGrupoPorIdPort {

    private final ProdutoGrupoRepository repository;
    private final ProdutoGrupoEntityMapper mapper;

    @Override
    public ProdutoGrupo adicionarProdutoGrupo(AdicionarProdutoGrupo adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public ProdutoGrupo atualizarProdutoGrupo(Long id, AtualizarProdutoGrupo atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirProdutoGrupoPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<ProdutoGrupo> listarProdutoGrupo(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public ProdutoGrupo obterProdutoGrupoPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
