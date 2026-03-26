package br.com.wasistemas.tasko.produto.application.port.out.produto;

import br.com.wasistemas.tasko.produto.domain.produto.AtualizarProduto;
import br.com.wasistemas.tasko.produto.domain.produto.Produto;

public interface AtualizarProdutoPort {
    Produto atualizarProduto(Long id, AtualizarProduto atualizar);
}
