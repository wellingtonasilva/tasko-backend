package br.com.wasistemas.tasko.vendedor.adapter.out.persistence.repository;

import br.com.wasistemas.tasko.vendedor.adapter.out.persistence.entity.VendedorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepository extends JpaRepository<VendedorEntity, Long> {
}
