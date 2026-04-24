package br.com.wassitemas.tasko.produto.application.port.out.produtopreco;

import br.com.wassitemas.tasko.produto.domain.produtopreco.ProdutoPreco;

public interface ObterProdutoPrecoPorIdPort {
    ProdutoPreco obterProdutoPrecoPorId(Long id);
}
