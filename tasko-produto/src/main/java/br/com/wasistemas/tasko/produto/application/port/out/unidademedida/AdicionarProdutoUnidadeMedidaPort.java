package br.com.wasistemas.tasko.produto.application.port.out.unidademedida;

import br.com.wasistemas.tasko.produto.domain.unidademedida.AdicionarProdutoUnidadeMedida;
import br.com.wasistemas.tasko.produto.domain.unidademedida.ProdutoUnidadeMedida;

public interface AdicionarProdutoUnidadeMedidaPort {
    ProdutoUnidadeMedida adicionarProdutoUnidadeMedida(AdicionarProdutoUnidadeMedida adicionar);
}
