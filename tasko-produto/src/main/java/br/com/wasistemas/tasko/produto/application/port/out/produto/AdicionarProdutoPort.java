package br.com.wasistemas.tasko.produto.application.port.out.produto;

import br.com.wasistemas.tasko.produto.domain.produto.AdicionarProduto;
import br.com.wasistemas.tasko.produto.domain.produto.Produto;

public interface AdicionarProdutoPort {
    Produto adicionarProduto(AdicionarProduto adicionar);
}
