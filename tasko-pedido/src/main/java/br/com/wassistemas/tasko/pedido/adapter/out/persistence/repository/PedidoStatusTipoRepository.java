package br.com.wassistemas.tasko.pedido.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.pedido.adapter.out.persistence.entity.PedidoStatusTipoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoStatusTipoRepository extends JpaRepository<PedidoStatusTipoEntity, Long> {
}
