package br.com.wassitemas.tasko.produto.application.port.out.produto;

import br.com.wassitemas.tasko.produto.domain.produto.AdicionarProduto;
import br.com.wassitemas.tasko.produto.domain.produto.Produto;

public interface AdicionarProdutoPort {
    Produto adicionarProduto(AdicionarProduto adicionar);
}
