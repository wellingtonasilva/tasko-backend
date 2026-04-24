package br.com.wassistemas.tasko.vendedor.adapter.out.persistence;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.vendedor.adapter.out.persistence.mapper.VendedorEntityMapper;
import br.com.wassistemas.tasko.vendedor.adapter.out.persistence.repository.VendedorSupervisorRepository;
import br.com.wassistemas.tasko.vendedor.application.port.out.supervisor.AdicionarVendedorSupervisorPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.supervisor.AtualizarVendedorSupervisorPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.supervisor.ExcluirVendedorSupervisorPorIdPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.supervisor.ListarVendedorSupervisorPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.supervisor.ObterVendedorSupervisorPorIdPort;
import br.com.wassistemas.tasko.vendedor.domain.supervisor.AdicionarVendedorSupervisor;
import br.com.wassistemas.tasko.vendedor.domain.supervisor.AtualizarVendedorSupervisor;
import br.com.wassistemas.tasko.vendedor.domain.supervisor.VendedorSupervisor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class VendedorSupervisorPersistenceAdapater implements AdicionarVendedorSupervisorPort,
    AtualizarVendedorSupervisorPort, ExcluirVendedorSupervisorPorIdPort,
    ObterVendedorSupervisorPorIdPort,
    ListarVendedorSupervisorPort {

    private final VendedorSupervisorRepository vendedorSupervisorRepository;
    private final VendedorEntityMapper vendedorMapper;

    @Override
    public VendedorSupervisor adicionarVendedorSupervisor(AdicionarVendedorSupervisor adicionarVendedorSupervisor) {
        return vendedorMapper.toDomain(vendedorSupervisorRepository.save(vendedorMapper.toEntity(adicionarVendedorSupervisor)));
    }

    @Override
    public VendedorSupervisor atualizarVendedorSupervisor(Long id, AtualizarVendedorSupervisor atualizarVendedorSupervisor) {
        return vendedorMapper.toDomain(vendedorSupervisorRepository.save(vendedorMapper.toEntity(id, atualizarVendedorSupervisor)));
    }

    @Override
    public void excluirVendedorSupervisorPorId(Long id) {
        vendedorSupervisorRepository.deleteById(id);
    }

    @Override
    public VendedorSupervisor obterVendedorSupervisorPorId(Long id) {
        return vendedorMapper.toDomain(vendedorSupervisorRepository.findById(id).orElse(null));
    }

    @Override
    public List<VendedorSupervisor> listarVendedorSupervisor(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC
                : Sort.Direction.ASC;

        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));

        return vendedorSupervisorRepository.findAll(pageable).map(vendedorMapper::toDomain).toList();
    }
}
