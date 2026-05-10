package br.com.wassistemas.tasko.vendedor.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.vendedor.adapter.out.persistence.entity.VendedorTerritorioEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorTerritorioRepository extends JpaRepository<VendedorTerritorioEntity, Long> {
  Page<VendedorTerritorioEntity> findByEmpresaId(Long empresaId, Pageable pageable);
}
