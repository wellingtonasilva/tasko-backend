package br.com.wasistemas.tasko.produto.application.port.out.produtoestoque;

import br.com.wasistemas.tasko.produto.domain.produtoestoque.AdicionarProdutoEstoqueLocalizacao;
import br.com.wasistemas.tasko.produto.domain.produtoestoque.ProdutoEstoqueLocalizacao;

public interface AdicionarProdutoEstoqueLocalizacaoPort {
    ProdutoEstoqueLocalizacao adicionarProdutoEstoqueLocalizacao(AdicionarProdutoEstoqueLocalizacao adicionar);
}
