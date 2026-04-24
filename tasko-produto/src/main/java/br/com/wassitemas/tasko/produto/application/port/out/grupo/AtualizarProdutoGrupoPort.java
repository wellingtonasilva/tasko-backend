package br.com.wassitemas.tasko.produto.application.port.out.grupo;

import br.com.wassitemas.tasko.produto.domain.grupo.AtualizarProdutoGrupo;
import br.com.wassitemas.tasko.produto.domain.grupo.ProdutoGrupo;

public interface AtualizarProdutoGrupoPort {
    ProdutoGrupo atualizarProdutoGrupo(Long id, AtualizarProdutoGrupo atualizar);
}
