package br.com.wassistemas.tasko.vendedor.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.vendedor.adapter.out.persistence.entity.VendedorTerritorioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorTerritorioRepository extends JpaRepository<VendedorTerritorioEntity, Long> {
}
