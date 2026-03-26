package br.com.wasistemas.tasko.produto.application.port.out.produtopreco;

import br.com.wasistemas.tasko.produto.domain.produtopreco.ProdutoPreco;

public interface ObterProdutoPrecoPorIdPort {
    ProdutoPreco obterProdutoPrecoPorId(Long id);
}
