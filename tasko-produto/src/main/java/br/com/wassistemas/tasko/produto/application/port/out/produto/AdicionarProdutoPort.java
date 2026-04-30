package br.com.wassistemas.tasko.produto.application.port.out.produto;

import br.com.wassistemas.tasko.produto.domain.produto.AdicionarProduto;
import br.com.wassistemas.tasko.produto.domain.produto.Produto;

public interface AdicionarProdutoPort {
    Produto adicionarProduto(AdicionarProduto adicionar);
}
