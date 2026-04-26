package br.com.wassistemas.tasko.empresa.adapter.out.persistence;

import br.com.wassistemas.tasko.empresa.adapter.out.persistence.mapper.EmpresaEntityMapper;
import br.com.wassistemas.tasko.empresa.adapter.out.persistence.repository.EmpresaRepository;
import br.com.wassistemas.tasko.empresa.application.port.out.empresa.AdicionarEmpresaPort;
import br.com.wassistemas.tasko.empresa.application.port.out.empresa.AtualizarEmpresaPort;
import br.com.wassistemas.tasko.empresa.application.port.out.empresa.ExcluirEmpresaPorIdPort;
import br.com.wassistemas.tasko.empresa.application.port.out.empresa.ExisteEmpresaComDominioPort;
import br.com.wassistemas.tasko.empresa.application.port.out.empresa.ExisteEmpresaComEmailPort;
import br.com.wassistemas.tasko.empresa.application.port.out.empresa.ListarEmpresaPort;
import br.com.wassistemas.tasko.empresa.application.port.out.empresa.ObterEmpresaPorIdPort;
import br.com.wassistemas.tasko.empresa.domain.empresa.AdicionarEmpresa;
import br.com.wassistemas.tasko.empresa.domain.empresa.AtualizarEmpresa;
import br.com.wassistemas.tasko.common.domain.empresa.Empresa;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EmpresaPersistenceAdapter implements AdicionarEmpresaPort, AtualizarEmpresaPort,
    ExcluirEmpresaPorIdPort, ListarEmpresaPort, ObterEmpresaPorIdPort, ExisteEmpresaComDominioPort,
    ExisteEmpresaComEmailPort {

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

    @Override
    public Long existeEmpresaComDominio(String dominio) {
        return repository.countByDominio(dominio);
    }

    @Override
    public Long existeEmpresaComEmail(String email) {
        return repository.countByEmail(email);
    }
}
