package br.com.wasistemas.tasko.produto.application.port.out.subgrupo;

import br.com.wasistemas.tasko.produto.domain.subgrupo.ProdutoSubgrupo;

public interface ObterProdutoSubgrupoPorIdPort {
    ProdutoSubgrupo obterProdutoSubgrupoPorId(Long id);
}
