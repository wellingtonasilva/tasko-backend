package br.com.wassistemas.tasko.produto.application.port.out.produtopreco;

import br.com.wassistemas.tasko.produto.domain.produtopreco.AdicionarProdutoPreco;
import br.com.wassistemas.tasko.produto.domain.produtopreco.ProdutoPreco;

public interface AdicionarProdutoPrecoPort {
    ProdutoPreco adicionarProdutoPreco(AdicionarProdutoPreco adicionar);
}
