package br.com.wassistemas.tasko.produto.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.produto.adapter.out.persistence.entity.ProdutoEstoqueLocalizacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoEstoqueLocalizacaoRepository extends JpaRepository<ProdutoEstoqueLocalizacaoEntity, Long> {
}
