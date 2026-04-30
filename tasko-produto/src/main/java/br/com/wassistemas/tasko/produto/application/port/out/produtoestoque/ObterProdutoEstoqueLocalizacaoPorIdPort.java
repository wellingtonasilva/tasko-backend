package br.com.wassistemas.tasko.produto.application.port.out.produtoestoque;

import br.com.wassistemas.tasko.produto.domain.produtoestoque.ProdutoEstoqueLocalizacao;

public interface ObterProdutoEstoqueLocalizacaoPorIdPort {
    ProdutoEstoqueLocalizacao obterProdutoEstoqueLocalizacaoPorId(Long id);
}
