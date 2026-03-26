package br.com.wasistemas.tasko.produto.application.port.out.grupo;

import br.com.wasistemas.tasko.produto.domain.grupo.ProdutoGrupo;

public interface ObterProdutoGrupoPorIdPort {
    ProdutoGrupo obterProdutoGrupoPorId(Long id);
}
