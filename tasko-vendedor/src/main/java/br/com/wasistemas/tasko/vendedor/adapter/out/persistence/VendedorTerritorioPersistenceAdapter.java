package br.com.wasistemas.tasko.vendedor.adapter.out.persistence;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.vendedor.adapter.out.persistence.mapper.VendedorEntityMapper;
import br.com.wasistemas.tasko.vendedor.adapter.out.persistence.repository.VendedorTerritorioRepository;
import br.com.wasistemas.tasko.vendedor.application.port.out.territorio.*;
import br.com.wasistemas.tasko.vendedor.domain.territorio.AdicionarVendedorTerritorio;
import br.com.wasistemas.tasko.vendedor.domain.territorio.AtualizarVendedorTerritorio;
import br.com.wasistemas.tasko.vendedor.domain.territorio.VendedorTerritorio;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class VendedorTerritorioPersistenceAdapter implements AdicionarVendedorTerritorioPort,
        AtualizarVendedorTerritorioPort, ExcluirVendedorTerritorioPorIdPort, ListarVendedorTerritorioPort,
        ObterVendedorTerritorioPorIdPort {

    private final VendedorTerritorioRepository vendedorTerritorioRepository;
    private final VendedorEntityMapper vendedorMapper;

    @Override
    public VendedorTerritorio adicionarVendedorTerritorio(AdicionarVendedorTerritorio adicionarVendedorTerritorio) {
        return vendedorMapper.toDomain(vendedorTerritorioRepository.save(vendedorMapper.toEntity(adicionarVendedorTerritorio)));
    }

    @Override
    public VendedorTerritorio atualizarVendedorTerritorio(Long id, AtualizarVendedorTerritorio atualizarVendedorTerritorio) {
        return vendedorMapper.toDomain(vendedorTerritorioRepository.save(vendedorMapper.toEntity(id, atualizarVendedorTerritorio)));
    }

    @Override
    public void excluirVendedorTerritorioPorId(Long id) {
        vendedorTerritorioRepository.deleteById(id);
    }

    @Override
    public List<VendedorTerritorio> listarVendedorTerritorio(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC
                : Sort.Direction.ASC;

        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));

        return vendedorTerritorioRepository.findAll(pageable).map(vendedorMapper::toDomain).toList();
    }

    @Override
    public VendedorTerritorio obterVendedorTerritorioPorId(Long id) {
        return vendedorMapper.toDomain(vendedorTerritorioRepository.findById(id).orElse(null));
    }
}
