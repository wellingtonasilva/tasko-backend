package br.com.wasistemas.tasko.produto.adapter.out.persistence.repository;

import br.com.wasistemas.tasko.produto.adapter.out.persistence.entity.ProdutoGrupoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoGrupoRepository extends JpaRepository<ProdutoGrupoEntity, Long> {
}
