package br.com.wassistemas.tasko.vendedor.adapter.out.persistence;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.vendedor.adapter.out.persistence.entity.VendedorTerritorioEntity;
import br.com.wassistemas.tasko.vendedor.adapter.out.persistence.mapper.VendedorEntityMapper;
import br.com.wassistemas.tasko.vendedor.adapter.out.persistence.repository.VendedorTerritorioRepository;
import br.com.wassistemas.tasko.vendedor.application.port.out.territorio.AdicionarVendedorTerritorioPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.territorio.AtualizarVendedorTerritorioPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.territorio.ExcluirVendedorTerritorioPorIdPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.territorio.ListarVendedorTerritorioPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.territorio.ObterVendedorTerritorioPorIdPort;
import br.com.wassistemas.tasko.vendedor.domain.territorio.AdicionarVendedorTerritorio;
import br.com.wassistemas.tasko.vendedor.domain.territorio.AtualizarVendedorTerritorio;
import br.com.wassistemas.tasko.common.domain.vendedor.VendedorTerritorio;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class VendedorTerritorioPersistenceAdapter implements AdicionarVendedorTerritorioPort,
    AtualizarVendedorTerritorioPort, ExcluirVendedorTerritorioPorIdPort,
    ListarVendedorTerritorioPort,
    ObterVendedorTerritorioPorIdPort {

  private final VendedorTerritorioRepository vendedorTerritorioRepository;
  private final VendedorEntityMapper vendedorMapper;

  @Override
  public VendedorTerritorio adicionarVendedorTerritorio(
      AdicionarVendedorTerritorio adicionarVendedorTerritorio) {
    return vendedorMapper.toDomain(
        vendedorTerritorioRepository.save(vendedorMapper.toEntity(adicionarVendedorTerritorio)));
  }

  @Override
  public VendedorTerritorio atualizarVendedorTerritorio(Long id,
      AtualizarVendedorTerritorio atualizarVendedorTerritorio) {
    VendedorTerritorioEntity entity = vendedorTerritorioRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Território não encontrado"));
    vendedorMapper.updateVendedorTerritorioCidadeEntity(atualizarVendedorTerritorio, entity);

    return vendedorMapper.toDomain(vendedorTerritorioRepository.save(entity));
  }

  @Override
  public void excluirVendedorTerritorioPorId(Long id) {
    vendedorTerritorioRepository.deleteById(id);
  }

  @Override
  public List<VendedorTerritorio> listarVendedorTerritorio(Long empresaId, Paginacao paginacao) {
    Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
        ? Sort.Direction.DESC
        : Sort.Direction.ASC;

    Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
        Sort.by(direction, paginacao.getSortBy()));

    return vendedorTerritorioRepository.findByEmpresaId(empresaId, pageable)
        .map(vendedorMapper::toDomain).toList();
  }

  @Override
  public VendedorTerritorio obterVendedorTerritorioPorId(Long id) {
    return vendedorMapper.toDomain(vendedorTerritorioRepository.findById(id).orElse(null));
  }
}
