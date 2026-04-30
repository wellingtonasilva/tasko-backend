package br.com.wassistemas.tasko.pedido.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.pedido.adapter.out.persistence.entity.FormaPagamentoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormaPagamentoRepository extends JpaRepository<FormaPagamentoEntity, Long> {
  Page<FormaPagamentoEntity> findByEmpresaId(Long empresaId, Pageable pageable);
}
