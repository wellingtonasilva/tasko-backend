package br.com.wassistemas.tasko.cliente.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.cliente.adapter.out.persistence.entity.ClienteTabelaPrecoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteTabelaPrecoRepository extends JpaRepository<ClienteTabelaPrecoEntity, Long> {
  Page<ClienteTabelaPrecoEntity> findByEmpresaId(Long empresaId, Pageable pageable);
}

