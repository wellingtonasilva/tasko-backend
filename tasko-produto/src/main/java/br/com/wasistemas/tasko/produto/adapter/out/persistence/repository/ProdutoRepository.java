package br.com.wasistemas.tasko.produto.adapter.out.persistence.repository;

import br.com.wasistemas.tasko.produto.adapter.out.persistence.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
}
