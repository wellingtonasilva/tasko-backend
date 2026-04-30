package br.com.wassistemas.tasko.pedido.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.pedido.adapter.out.persistence.entity.PedidoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoEntity, Long> {
  Page<PedidoEntity> findByEmpresaId(Long empresaId, Pageable pageable);
}
