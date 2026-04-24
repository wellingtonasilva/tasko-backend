package br.com.wassistemas.tasko.vendedor.adapter.out.persistence;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.vendedor.adapter.out.persistence.mapper.VendedorEntityMapper;
import br.com.wassistemas.tasko.vendedor.adapter.out.persistence.repository.VendedorTerritorioCidadeRepository;
import br.com.wassistemas.tasko.vendedor.application.port.out.territorio.cidade.AdicionarVendedorTerritorioCidadePort;
import br.com.wassistemas.tasko.vendedor.application.port.out.territorio.cidade.AtualizarVendedorTerritorioCidadePort;
import br.com.wassistemas.tasko.vendedor.application.port.out.territorio.cidade.ExcluirVendedorTerritorioCidadePorIdPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.territorio.cidade.ListarVendedorTerritorioCidadePort;
import br.com.wassistemas.tasko.vendedor.application.port.out.territorio.cidade.ObterVendedorTerritorioCidadePorIdPort;
import br.com.wassistemas.tasko.vendedor.domain.territorio.cidade.AdicionarVendedorTerritorioCidade;
import br.com.wassistemas.tasko.vendedor.domain.territorio.cidade.AtualizarVendedorTerritorioCidade;
import br.com.wassistemas.tasko.vendedor.domain.territorio.cidade.VendedorTerritorioCidade;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class VendedorTerritorioCidadePersistenceAdapter implements
    AdicionarVendedorTerritorioCidadePort,
    AtualizarVendedorTerritorioCidadePort, ExcluirVendedorTerritorioCidadePorIdPort,
    ListarVendedorTerritorioCidadePort, ObterVendedorTerritorioCidadePorIdPort {

    private final VendedorTerritorioCidadeRepository vendedorTerritorioCidadeRepository;
    private final VendedorEntityMapper vendedorMapper;

    @Override
    public VendedorTerritorioCidade adicionarVendedorTerritorioCidade(AdicionarVendedorTerritorioCidade adicionarVendedorTerritorioCidade) {
        return vendedorMapper.toDomain(vendedorTerritorioCidadeRepository.save(vendedorMapper.toEntity(adicionarVendedorTerritorioCidade)));
    }

    @Override
    public VendedorTerritorioCidade AtualizarVendedorTerritorioCidade(Long id, AtualizarVendedorTerritorioCidade atualizarVendedorTerritorioCidade) {
        return vendedorMapper.toDomain(vendedorTerritorioCidadeRepository.save(vendedorMapper.toEntity(id, atualizarVendedorTerritorioCidade)));
    }

    @Override
    public void excluirVendedorTerritorioCidadePorId(Long id) {
        vendedorTerritorioCidadeRepository.deleteById(id);
    }

    @Override
    public List<VendedorTerritorioCidade> listarVendedorTerritorioCidade(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC
                : Sort.Direction.ASC;

        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));

        return vendedorTerritorioCidadeRepository.findAll(pageable).map(vendedorMapper::toDomain).toList();
    }

    @Override
    public VendedorTerritorioCidade obterVendedorTerritorioCidadePorId(Long id) {
        return vendedorMapper.toDomain(vendedorTerritorioCidadeRepository.findById(id).orElse(null));
    }
}
