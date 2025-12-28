package br.com.wasistemas.tasko.vendedor.adapter.out.persistence.repository;

import br.com.wasistemas.tasko.vendedor.adapter.out.persistence.entity.VendedorSupervisorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorSupervisorRepository extends JpaRepository<VendedorSupervisorEntity, Long> {
}
