package br.com.wasistemas.tasko.produto.application.port.out.unidademedida;

import br.com.wasistemas.tasko.produto.domain.unidademedida.ProdutoUnidadeMedida;

public interface ObterProdutoUnidadeMedidaPorIdPort {
    ProdutoUnidadeMedida obterProdutoUnidadeMedidaPorId(Long id);
}
