package br.com.wasistemas.tasko.pedido.adapter.out.persistence.repository;

import br.com.wasistemas.tasko.pedido.adapter.out.persistence.entity.PedidoItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoItemRepository extends JpaRepository<PedidoItemEntity, Long> {
}
