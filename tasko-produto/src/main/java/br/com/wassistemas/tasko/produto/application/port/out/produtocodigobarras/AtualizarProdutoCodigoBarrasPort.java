package br.com.wassistemas.tasko.produto.application.port.out.produtocodigobarras;

import br.com.wassistemas.tasko.produto.domain.produtocodigobarras.AtualizarProdutoCodigoBarras;
import br.com.wassistemas.tasko.produto.domain.produtocodigobarras.ProdutoCodigoBarras;

public interface AtualizarProdutoCodigoBarrasPort {
    ProdutoCodigoBarras atualizarProdutoCodigoBarras(Long id, AtualizarProdutoCodigoBarras atualizar);
}
