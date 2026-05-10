package br.com.wassistemas.tasko.produto.adapter.out.persistence.projections;

import java.math.BigDecimal;

public interface ProdutoProjection {

  Long getId();

  Long getEmpresaId();

  String getNomeProduto();

  String getDescricaoProduto();

  Long getUnidadeMedidaId();

  Long getGrupoId();

  Long gretSubgrupoId();

  BigDecimal getPesoLiquido();

  String getMarca();

  String getFornecedor();

  BigDecimal getAliquotaIcms();

  BigDecimal getAliquotaIpi();

  BigDecimal getDimensaoAltura();

  BigDecimal getDimensaoLargura();

  BigDecimal getDimensaoProfundidade();

  BigDecimal getPrecoCusto();

  BigDecimal getPrecoSugerido();

  BigDecimal getMargemMinima();

  BigDecimal getQuantidadeDisponivel();

  BigDecimal getQuantidadeReservada();

  String getDescricaoGrupo();

  String getDescricaoSubgrupo();

  String getDescricaoUnidadeMedida();

  String getDescricaoUnidadeMedidaCodigo();
}


