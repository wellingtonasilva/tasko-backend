package br.com.wasistemas.tasko.produto.adapter.out.persistence.repository;

import br.com.wasistemas.tasko.produto.adapter.out.persistence.entity.ProdutoPrecoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoPrecoRepository extends JpaRepository<ProdutoPrecoEntity, Long> {
}
