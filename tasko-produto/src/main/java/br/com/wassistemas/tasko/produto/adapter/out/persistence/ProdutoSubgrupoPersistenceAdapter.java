package br.com.wassistemas.tasko.produto.adapter.out.persistence;

import br.com.wassistemas.tasko.produto.adapter.out.persistence.entity.ProdutoGrupoEntity;
import br.com.wassistemas.tasko.produto.adapter.out.persistence.entity.ProdutoSubgrupoEntity;
import br.com.wassistemas.tasko.produto.adapter.out.persistence.mapper.ProdutoSubgrupoEntityMapper;
import br.com.wassistemas.tasko.produto.adapter.out.persistence.repository.ProdutoSubgrupoRepository;
import br.com.wassistemas.tasko.produto.application.port.out.subgrupo.AdicionarProdutoSubgrupoPort;
import br.com.wassistemas.tasko.produto.application.port.out.subgrupo.AtualizarProdutoSubgrupoPort;
import br.com.wassistemas.tasko.produto.application.port.out.subgrupo.ExcluirProdutoSubgrupoPorIdPort;
import br.com.wassistemas.tasko.produto.application.port.out.subgrupo.ListarProdutoSubgrupoPort;
import br.com.wassistemas.tasko.produto.application.port.out.subgrupo.ObterProdutoSubgrupoPorIdPort;
import br.com.wassistemas.tasko.produto.domain.subgrupo.AdicionarProdutoSubgrupo;
import br.com.wassistemas.tasko.produto.domain.subgrupo.AtualizarProdutoSubgrupo;
import br.com.wassistemas.tasko.produto.domain.subgrupo.ProdutoSubgrupo;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProdutoSubgrupoPersistenceAdapter implements AdicionarProdutoSubgrupoPort,
    AtualizarProdutoSubgrupoPort,
    ExcluirProdutoSubgrupoPorIdPort, ListarProdutoSubgrupoPort, ObterProdutoSubgrupoPorIdPort {

    private final ProdutoSubgrupoRepository repository;
    private final ProdutoSubgrupoEntityMapper mapper;

    @Override
    public ProdutoSubgrupo adicionarProdutoSubgrupo(AdicionarProdutoSubgrupo adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public ProdutoSubgrupo atualizarProdutoSubgrupo(Long id, AtualizarProdutoSubgrupo atualizar) {
        ProdutoSubgrupoEntity entity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Subgrupo não encontrado"));
        mapper.updateProdutoSubgrupoEntity(atualizar, entity);

        return mapper.toDomain(repository.save(entity));
    }

    @Override
    public void excluirProdutoSubgrupoPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<ProdutoSubgrupo> listarProdutoSubgrupo(Long empresaId, Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAllByEmpresaId(empresaId, pageable).map(mapper::toDomain).toList();
    }

    @Override
    public ProdutoSubgrupo obterProdutoSubgrupoPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
