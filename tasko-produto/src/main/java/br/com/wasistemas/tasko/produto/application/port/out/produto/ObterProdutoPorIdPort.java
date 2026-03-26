package br.com.wasistemas.tasko.produto.application.port.out.produto;

import br.com.wasistemas.tasko.produto.domain.produto.Produto;

public interface ObterProdutoPorIdPort {
    Produto obterProdutoPorId(Long id);
}
