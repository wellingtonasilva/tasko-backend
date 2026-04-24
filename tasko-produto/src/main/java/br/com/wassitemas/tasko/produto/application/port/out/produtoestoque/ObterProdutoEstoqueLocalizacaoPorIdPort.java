package br.com.wassitemas.tasko.produto.application.port.out.produtoestoque;

import br.com.wassitemas.tasko.produto.domain.produtoestoque.ProdutoEstoqueLocalizacao;

public interface ObterProdutoEstoqueLocalizacaoPorIdPort {
    ProdutoEstoqueLocalizacao obterProdutoEstoqueLocalizacaoPorId(Long id);
}
