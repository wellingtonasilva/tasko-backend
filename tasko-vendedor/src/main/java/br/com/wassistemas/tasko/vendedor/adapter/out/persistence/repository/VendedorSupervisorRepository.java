package br.com.wassistemas.tasko.vendedor.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.vendedor.adapter.out.persistence.entity.VendedorSupervisorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface VendedorSupervisorRepository extends JpaRepository<VendedorSupervisorEntity, Long> {
  Page<VendedorSupervisorEntity> findByEmpresaId(Long empresaId, Pageable pageable);
}
