package br.com.wasistemas.tasko.produto.application.port.out.unidademedida;

import br.com.wasistemas.tasko.produto.domain.unidademedida.AtualizarProdutoUnidadeMedida;
import br.com.wasistemas.tasko.produto.domain.unidademedida.ProdutoUnidadeMedida;

public interface AtualizarProdutoUnidadeMedidaPort {
    ProdutoUnidadeMedida atualizarProdutoUnidadeMedida(Long id, AtualizarProdutoUnidadeMedida atualizar);
}
