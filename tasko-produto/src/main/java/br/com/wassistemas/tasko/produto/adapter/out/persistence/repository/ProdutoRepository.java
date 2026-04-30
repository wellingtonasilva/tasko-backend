package br.com.wassistemas.tasko.produto.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.produto.adapter.out.persistence.entity.ProdutoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
  Page<ProdutoEntity> findAllByEmpresaId(Long empresaId, Pageable pageable);
}
