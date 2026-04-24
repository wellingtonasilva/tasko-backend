package br.com.wassitemas.tasko.produto.adapter.out.persistence.repository;

import br.com.wassitemas.tasko.produto.adapter.out.persistence.entity.ProdutoCodigoBarrasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoCodigoBarrasRepository extends JpaRepository<ProdutoCodigoBarrasEntity, Long> {
}
