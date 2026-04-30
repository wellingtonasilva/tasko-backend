package br.com.wassistemas.tasko.produto.application.port.out.produtocodigobarras;

import br.com.wassistemas.tasko.produto.domain.produtocodigobarras.ProdutoCodigoBarras;

public interface ObterProdutoCodigoBarrasPorIdPort {
    ProdutoCodigoBarras obterProdutoCodigoBarrasPorId(Long id);
}
