package br.com.wasistemas.tasko.empresa.adapter.out.persistence;

import br.com.wasistemas.tasko.empresa.adapter.out.persistence.mapper.EmpresaLocalizacaoEntityMapper;
import br.com.wasistemas.tasko.empresa.adapter.out.persistence.repository.EmpresaLocalizacaoRepository;
import br.com.wasistemas.tasko.empresa.application.port.out.empresalocalizacao.*;
import br.com.wasistemas.tasko.empresa.domain.empresalocalizacao.AdicionarEmpresaLocalizacao;
import br.com.wasistemas.tasko.empresa.domain.empresalocalizacao.AtualizarEmpresaLocalizacao;
import br.com.wasistemas.tasko.empresa.domain.empresalocalizacao.EmpresaLocalizacao;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EmpresaLocalizacaoPersistenceAdapter implements AdicionarEmpresaLocalizacaoPort, AtualizarEmpresaLocalizacaoPort,
        ExcluirEmpresaLocalizacaoPorIdPort, ListarEmpresaLocalizacaoPort, ObterEmpresaLocalizacaoPorIdPort {

    private final EmpresaLocalizacaoRepository repository;
    private final EmpresaLocalizacaoEntityMapper mapper;

    @Override
    public EmpresaLocalizacao adicionarEmpresaLocalizacao(AdicionarEmpresaLocalizacao adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public EmpresaLocalizacao atualizarEmpresaLocalizacao(Long id, AtualizarEmpresaLocalizacao atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirEmpresaLocalizacaoPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<EmpresaLocalizacao> listarEmpresaLocalizacao(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public EmpresaLocalizacao obterEmpresaLocalizacaoPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
