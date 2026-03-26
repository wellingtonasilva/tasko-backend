package br.com.wasistemas.tasko.produto.application.port.out.produtocodigobarras;

import br.com.wasistemas.tasko.produto.domain.produtocodigobarras.ProdutoCodigoBarras;

public interface ObterProdutoCodigoBarrasPorIdPort {
    ProdutoCodigoBarras obterProdutoCodigoBarrasPorId(Long id);
}
