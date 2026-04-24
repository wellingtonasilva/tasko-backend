package br.com.wassistemas.tasko.cliente.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.cliente.adapter.out.persistence.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
}

