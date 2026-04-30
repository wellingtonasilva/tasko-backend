package br.com.wassistemas.tasko.produto.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.produto.adapter.out.persistence.entity.ProdutoGrupoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoGrupoRepository extends JpaRepository<ProdutoGrupoEntity, Long> {
  Page<ProdutoGrupoEntity> findAllByEmpresaId(Long empresaId, Pageable pageable);
}
