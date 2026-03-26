package br.com.wasistemas.tasko.produto.application.port.out.produtocodigobarras;

import br.com.wasistemas.tasko.produto.domain.produtocodigobarras.AdicionarProdutoCodigoBarras;
import br.com.wasistemas.tasko.produto.domain.produtocodigobarras.ProdutoCodigoBarras;

public interface AdicionarProdutoCodigoBarrasPort {
    ProdutoCodigoBarras adicionarProdutoCodigoBarras(AdicionarProdutoCodigoBarras adicionar);
}
