package br.com.wassistemas.tasko.produto.application.port.out.produtoestoque;

import br.com.wassistemas.tasko.produto.domain.produtoestoque.AdicionarProdutoEstoqueLocalizacao;
import br.com.wassistemas.tasko.produto.domain.produtoestoque.ProdutoEstoqueLocalizacao;

public interface AdicionarProdutoEstoqueLocalizacaoPort {
    ProdutoEstoqueLocalizacao adicionarProdutoEstoqueLocalizacao(AdicionarProdutoEstoqueLocalizacao adicionar);
}
