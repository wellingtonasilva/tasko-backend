package br.com.wassitemas.tasko.produto.application.port.out.produtocodigobarras;

import br.com.wassitemas.tasko.produto.domain.produtocodigobarras.ProdutoCodigoBarras;

public interface ObterProdutoCodigoBarrasPorIdPort {
    ProdutoCodigoBarras obterProdutoCodigoBarrasPorId(Long id);
}
