package br.com.wassistemas.tasko.pedido.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.pedido.adapter.out.persistence.entity.CondicaoPagamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CondicaoPagamentoRepository extends JpaRepository<CondicaoPagamentoEntity, Long> {
}
