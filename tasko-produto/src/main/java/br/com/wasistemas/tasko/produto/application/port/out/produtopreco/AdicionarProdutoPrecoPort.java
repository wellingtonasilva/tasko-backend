package br.com.wasistemas.tasko.produto.application.port.out.produtopreco;

import br.com.wasistemas.tasko.produto.domain.produtopreco.AdicionarProdutoPreco;
import br.com.wasistemas.tasko.produto.domain.produtopreco.ProdutoPreco;

public interface AdicionarProdutoPrecoPort {
    ProdutoPreco adicionarProdutoPreco(AdicionarProdutoPreco adicionar);
}
