package br.com.wasistemas.tasko.produto.adapter.out.persistence.repository;

import br.com.wasistemas.tasko.produto.adapter.out.persistence.entity.ProdutoEstoqueLocalizacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoEstoqueLocalizacaoRepository extends JpaRepository<ProdutoEstoqueLocalizacaoEntity, Long> {
}
