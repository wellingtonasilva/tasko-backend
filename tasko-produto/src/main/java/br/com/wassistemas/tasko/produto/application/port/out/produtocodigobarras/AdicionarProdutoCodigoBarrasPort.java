package br.com.wassistemas.tasko.produto.application.port.out.produtocodigobarras;

import br.com.wassistemas.tasko.produto.domain.produtocodigobarras.AdicionarProdutoCodigoBarras;
import br.com.wassistemas.tasko.produto.domain.produtocodigobarras.ProdutoCodigoBarras;

public interface AdicionarProdutoCodigoBarrasPort {
    ProdutoCodigoBarras adicionarProdutoCodigoBarras(AdicionarProdutoCodigoBarras adicionar);
}
