package br.com.wassitemas.tasko.produto.application.port.out.produto;

import br.com.wassitemas.tasko.produto.domain.produto.AtualizarProduto;
import br.com.wassitemas.tasko.produto.domain.produto.Produto;

public interface AtualizarProdutoPort {
    Produto atualizarProduto(Long id, AtualizarProduto atualizar);
}
