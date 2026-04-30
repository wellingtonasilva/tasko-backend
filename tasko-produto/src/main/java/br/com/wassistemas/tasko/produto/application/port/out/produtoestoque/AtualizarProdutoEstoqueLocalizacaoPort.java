package br.com.wassistemas.tasko.produto.application.port.out.produtoestoque;

import br.com.wassistemas.tasko.produto.domain.produtoestoque.AtualizarProdutoEstoqueLocalizacao;
import br.com.wassistemas.tasko.produto.domain.produtoestoque.ProdutoEstoqueLocalizacao;

public interface AtualizarProdutoEstoqueLocalizacaoPort {
    ProdutoEstoqueLocalizacao atualizarProdutoEstoqueLocalizacao(Long id, AtualizarProdutoEstoqueLocalizacao atualizar);
}
