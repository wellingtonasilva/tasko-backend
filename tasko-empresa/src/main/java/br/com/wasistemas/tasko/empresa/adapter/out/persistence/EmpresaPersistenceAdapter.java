package br.com.wasistemas.tasko.empresa.adapter.out.persistence;

import br.com.wasistemas.tasko.empresa.adapter.out.persistence.mapper.EmpresaEntityMapper;
import br.com.wasistemas.tasko.empresa.adapter.out.persistence.repository.EmpresaRepository;
import br.com.wasistemas.tasko.empresa.application.port.out.empresa.*;
import br.com.wasistemas.tasko.empresa.domain.empresa.AdicionarEmpresa;
import br.com.wasistemas.tasko.empresa.domain.empresa.AtualizarEmpresa;
import br.com.wasistemas.tasko.empresa.domain.empresa.Empresa;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EmpresaPersistenceAdapter implements AdicionarEmpresaPort, AtualizarEmpresaPort,
        ExcluirEmpresaPorIdPort, ListarEmpresaPort, ObterEmpresaPorIdPort {

    private final EmpresaRepository repository;
    private final EmpresaEntityMapper mapper;

    @Override
    public Empresa adicionarEmpresa(AdicionarEmpresa adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public Empresa atualizarEmpresa(Long id, AtualizarEmpresa atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirEmpresaPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Empresa> listarEmpresa(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public Empresa obterEmpresaPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
