package br.com.wasistemas.tasko.produto.application.port.out.produtoestoque;

import br.com.wasistemas.tasko.produto.domain.produtoestoque.ProdutoEstoqueLocalizacao;

public interface ObterProdutoEstoqueLocalizacaoPorIdPort {
    ProdutoEstoqueLocalizacao obterProdutoEstoqueLocalizacaoPorId(Long id);
}
