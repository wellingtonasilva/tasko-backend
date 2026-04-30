package br.com.wassistemas.tasko.cliente.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.cliente.adapter.out.persistence.entity.ClienteEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

  Page<ClienteEntity> findByEmpresaId(Long empresaId, Pageable pageable);
}

