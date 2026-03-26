package br.com.wasistemas.tasko.produto.adapter.out.persistence.repository;

import br.com.wasistemas.tasko.produto.adapter.out.persistence.entity.ProdutoSubgrupoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoSubgrupoRepository extends JpaRepository<ProdutoSubgrupoEntity, Long> {
}
