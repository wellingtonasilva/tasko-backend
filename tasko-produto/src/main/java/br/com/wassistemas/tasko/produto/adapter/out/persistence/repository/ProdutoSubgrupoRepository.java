package br.com.wassistemas.tasko.produto.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.produto.adapter.out.persistence.entity.ProdutoSubgrupoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoSubgrupoRepository extends JpaRepository<ProdutoSubgrupoEntity, Long> {
  Page<ProdutoSubgrupoEntity> findAllByEmpresaId(Long empresaId, Pageable pageable);
}
