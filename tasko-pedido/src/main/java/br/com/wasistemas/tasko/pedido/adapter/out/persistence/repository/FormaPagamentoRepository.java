package br.com.wasistemas.tasko.pedido.adapter.out.persistence.repository;

import br.com.wasistemas.tasko.pedido.adapter.out.persistence.entity.FormaPagamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormaPagamentoRepository extends JpaRepository<FormaPagamentoEntity, Long> {
}
