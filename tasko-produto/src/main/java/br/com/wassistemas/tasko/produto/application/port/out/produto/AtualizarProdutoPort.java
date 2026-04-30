package br.com.wassistemas.tasko.produto.application.port.out.produto;

import br.com.wassistemas.tasko.produto.domain.produto.AtualizarProduto;
import br.com.wassistemas.tasko.produto.domain.produto.Produto;

public interface AtualizarProdutoPort {
    Produto atualizarProduto(Long id, AtualizarProduto atualizar);
}
