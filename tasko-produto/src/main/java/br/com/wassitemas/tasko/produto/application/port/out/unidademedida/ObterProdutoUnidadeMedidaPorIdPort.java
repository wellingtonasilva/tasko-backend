package br.com.wassitemas.tasko.produto.application.port.out.unidademedida;

import br.com.wassitemas.tasko.produto.domain.unidademedida.ProdutoUnidadeMedida;

public interface ObterProdutoUnidadeMedidaPorIdPort {
    ProdutoUnidadeMedida obterProdutoUnidadeMedidaPorId(Long id);
}
