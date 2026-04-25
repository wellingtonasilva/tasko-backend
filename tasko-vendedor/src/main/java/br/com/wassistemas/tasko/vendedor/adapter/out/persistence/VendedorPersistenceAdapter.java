package br.com.wassistemas.tasko.vendedor.adapter.out.persistence;

import br.com.wassistemas.tasko.vendedor.adapter.out.persistence.mapper.VendedorEntityMapper;
import br.com.wassistemas.tasko.vendedor.adapter.out.persistence.repository.VendedorRepository;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.vendedor.application.port.out.vendedor.AdicionarVendedorPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.vendedor.AtualizarVendedorPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.vendedor.ExcluirVendedorPorIdPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.vendedor.ListarVendedorPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.vendedor.ObterVendedorPorIdPort;
import br.com.wassistemas.tasko.vendedor.domain.vendedor.AdicionarVendedor;
import br.com.wassistemas.tasko.vendedor.domain.vendedor.AtualizarVendedor;
import br.com.wassistemas.tasko.common.domain.vendedor.Vendedor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class VendedorPersistenceAdapter implements AdicionarVendedorPort, AtualizarVendedorPort,
    ExcluirVendedorPorIdPort, ListarVendedorPort, ObterVendedorPorIdPort {
    private final VendedorRepository vendedorRepository;
    private final VendedorEntityMapper vendedorMapper;

    @Override
    public Vendedor adicionarVendedor(AdicionarVendedor adicionarVendedor) {
        return vendedorMapper.toDomain(vendedorRepository.save(vendedorMapper.toEntity(adicionarVendedor)));
    }

    @Override
    public Vendedor atualizar(Long id, AtualizarVendedor atualizarVendedor) {
        return vendedorMapper.toDomain(vendedorRepository.save(vendedorMapper.toEntity(id, atualizarVendedor)));
    }

    @Override
    public void excluirById(Long id) {
        vendedorRepository.deleteById(id);
    }

    @Override
    public List<Vendedor> listarVendedor(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC
                : Sort.Direction.ASC;

        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));

        return vendedorRepository.findAll(pageable).map(vendedorMapper::toDomain).toList();
    }

    @Override
    public Vendedor obterPorId(Long id) {
        return vendedorMapper.toDomain(vendedorRepository.findById(id).orElse(null));
    }
}
