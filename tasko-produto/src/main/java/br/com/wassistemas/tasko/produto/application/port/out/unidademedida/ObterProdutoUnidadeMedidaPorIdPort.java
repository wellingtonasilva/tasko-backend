package br.com.wassistemas.tasko.produto.application.port.out.unidademedida;

import br.com.wassistemas.tasko.produto.domain.unidademedida.ProdutoUnidadeMedida;

public interface ObterProdutoUnidadeMedidaPorIdPort {
    ProdutoUnidadeMedida obterProdutoUnidadeMedidaPorId(Long id);
}
