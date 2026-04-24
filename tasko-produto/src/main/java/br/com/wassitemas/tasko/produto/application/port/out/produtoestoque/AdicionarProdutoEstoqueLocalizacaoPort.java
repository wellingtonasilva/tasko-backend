package br.com.wassitemas.tasko.produto.application.port.out.produtoestoque;

import br.com.wassitemas.tasko.produto.domain.produtoestoque.AdicionarProdutoEstoqueLocalizacao;
import br.com.wassitemas.tasko.produto.domain.produtoestoque.ProdutoEstoqueLocalizacao;

public interface AdicionarProdutoEstoqueLocalizacaoPort {
    ProdutoEstoqueLocalizacao adicionarProdutoEstoqueLocalizacao(AdicionarProdutoEstoqueLocalizacao adicionar);
}
