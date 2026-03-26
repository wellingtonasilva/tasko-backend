package br.com.wasistemas.tasko.pedido.adapter.out.persistence.repository;

import br.com.wasistemas.tasko.pedido.adapter.out.persistence.entity.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoEntity, Long> {
}
