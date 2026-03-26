package br.com.wasistemas.tasko.produto.application.port.out.produtopreco;

import br.com.wasistemas.tasko.produto.domain.produtopreco.AtualizarProdutoPreco;
import br.com.wasistemas.tasko.produto.domain.produtopreco.ProdutoPreco;

public interface AtualizarProdutoPrecoPort {
    ProdutoPreco atualizarProdutoPreco(Long id, AtualizarProdutoPreco atualizar);
}
