package br.com.wassitemas.tasko.produto.application.port.out.produtopreco;

import br.com.wassitemas.tasko.produto.domain.produtopreco.AtualizarProdutoPreco;
import br.com.wassitemas.tasko.produto.domain.produtopreco.ProdutoPreco;

public interface AtualizarProdutoPrecoPort {
    ProdutoPreco atualizarProdutoPreco(Long id, AtualizarProdutoPreco atualizar);
}
