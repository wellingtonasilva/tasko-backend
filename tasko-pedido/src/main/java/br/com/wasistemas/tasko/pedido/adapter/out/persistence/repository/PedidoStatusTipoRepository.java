package br.com.wasistemas.tasko.pedido.adapter.out.persistence.repository;

import br.com.wasistemas.tasko.pedido.adapter.out.persistence.entity.PedidoStatusTipoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoStatusTipoRepository extends JpaRepository<PedidoStatusTipoEntity, Long> {
}
