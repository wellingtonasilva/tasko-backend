package br.com.wassistemas.tasko.produto.application.port.out.unidademedida;

import br.com.wassistemas.tasko.produto.domain.unidademedida.AtualizarProdutoUnidadeMedida;
import br.com.wassistemas.tasko.produto.domain.unidademedida.ProdutoUnidadeMedida;

public interface AtualizarProdutoUnidadeMedidaPort {
    ProdutoUnidadeMedida atualizarProdutoUnidadeMedida(Long id, AtualizarProdutoUnidadeMedida atualizar);
}
