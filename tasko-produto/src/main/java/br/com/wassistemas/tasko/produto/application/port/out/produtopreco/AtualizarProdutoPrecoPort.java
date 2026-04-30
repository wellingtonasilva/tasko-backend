package br.com.wassistemas.tasko.produto.application.port.out.produtopreco;

import br.com.wassistemas.tasko.produto.domain.produtopreco.AtualizarProdutoPreco;
import br.com.wassistemas.tasko.produto.domain.produtopreco.ProdutoPreco;

public interface AtualizarProdutoPrecoPort {
    ProdutoPreco atualizarProdutoPreco(Long id, AtualizarProdutoPreco atualizar);
}
