package br.com.wassistemas.tasko.produto.application.port.out.unidademedida;

import br.com.wassistemas.tasko.produto.domain.unidademedida.AdicionarProdutoUnidadeMedida;
import br.com.wassistemas.tasko.produto.domain.unidademedida.ProdutoUnidadeMedida;

public interface AdicionarProdutoUnidadeMedidaPort {
    ProdutoUnidadeMedida adicionarProdutoUnidadeMedida(AdicionarProdutoUnidadeMedida adicionar);
}
