package br.com.wasistemas.tasko.produto.application.port.out.grupo;

import br.com.wasistemas.tasko.produto.domain.grupo.AtualizarProdutoGrupo;
import br.com.wasistemas.tasko.produto.domain.grupo.ProdutoGrupo;

public interface AtualizarProdutoGrupoPort {
    ProdutoGrupo atualizarProdutoGrupo(Long id, AtualizarProdutoGrupo atualizar);
}
