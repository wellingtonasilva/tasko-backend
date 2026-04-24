package br.com.wassitemas.tasko.produto.application.port.out.produtopreco;

import br.com.wassitemas.tasko.produto.domain.produtopreco.AdicionarProdutoPreco;
import br.com.wassitemas.tasko.produto.domain.produtopreco.ProdutoPreco;

public interface AdicionarProdutoPrecoPort {
    ProdutoPreco adicionarProdutoPreco(AdicionarProdutoPreco adicionar);
}
