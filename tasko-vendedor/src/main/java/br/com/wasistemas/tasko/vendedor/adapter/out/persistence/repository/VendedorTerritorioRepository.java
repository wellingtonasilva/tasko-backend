package br.com.wasistemas.tasko.vendedor.adapter.out.persistence.repository;

import br.com.wasistemas.tasko.vendedor.adapter.out.persistence.entity.VendedorTerritorioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorTerritorioRepository extends JpaRepository<VendedorTerritorioEntity, Long> {
}
