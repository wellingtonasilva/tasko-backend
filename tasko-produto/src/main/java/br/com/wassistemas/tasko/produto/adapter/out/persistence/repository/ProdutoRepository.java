package br.com.wassistemas.tasko.produto.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.produto.adapter.out.persistence.entity.ProdutoEntity;
import br.com.wassistemas.tasko.produto.adapter.out.persistence.projections.ProdutoProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
  //Page<ProdutoEntity> findAllByEmpresaId(Long empresaId, Pageable pageable);

  @Query("SELECT " +
      "p.id AS id, " +
      "p.empresaId AS empresaId, " +
      "p.nomeProduto AS nomeProduto, " +
      "p.descricaoProduto AS descricaoProduto, " +
      "p.unidadeMedidaId AS unidadeMedidaId, " +
      "p.grupoId AS grupoId, " +
      "p.subgrupoId AS subgrupoId, " +
      "p.pesoLiquido AS pesoLiquido, " +
      "p.marca AS marca, " +
      "p.fornecedor AS fornecedor, " +
      "p.aliquotaIcms AS aliquotaIcms, " +
      "p.aliquotaIpi AS aliquotaIpi, " +
      "p.dimensaoAltura AS dimensaoAltura, " +
      "p.dimensaoLargura AS dimensaoLargura, " +
      "p.dimensaoProfundidade AS dimensaoProfundidade, " +
      "p.precoCusto AS precoCusto, " +
      "p.precoSugerido AS precoSugerido, " +
      "p.margemMinima AS margemMinima, " +
      "p.quantidadeDisponivel AS quantidadeDisponivel, " +
      "p.quantidadeReservada AS quantidadeReservada, " +
      "COALESCE(pg.descricaoGrupo, '') AS descricaoGrupo, " +
      "COALESCE(ps.descricaoSubgrupo, '') AS descricaoSubgrupo, " +
      "COALESCE(pum.descricaoUnidadeMedida, '') AS descricaoUnidadeMedida, " +
      "COALESCE(pum.codigo, '') AS descricaoUnidadeMedidaCodigo " +
      "FROM ProdutoEntity p " +
      "LEFT JOIN ProdutoGrupoEntity pg ON p.grupoId = pg.id " +
      "LEFT JOIN ProdutoSubgrupoEntity ps ON p.subgrupoId = ps.id " +
      "LEFT JOIN ProdutoUnidadeMedidaEntity pum ON p.unidadeMedidaId = pum.id " +
      "WHERE p.empresaId = :empresaId")
  Page<ProdutoProjection> findAllByEmpresaId(Long empresaId, Pageable pageable);
}
