package br.com.wassistemas.tasko.vendedor.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.vendedor.adapter.out.persistence.entity.VendedorMetaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorMetaRepository extends JpaRepository<VendedorMetaEntity, Long> {
}
