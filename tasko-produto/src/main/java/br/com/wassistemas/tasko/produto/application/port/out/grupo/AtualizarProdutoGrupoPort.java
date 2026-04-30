package br.com.wassistemas.tasko.produto.application.port.out.grupo;

import br.com.wassistemas.tasko.produto.domain.grupo.AtualizarProdutoGrupo;
import br.com.wassistemas.tasko.produto.domain.grupo.ProdutoGrupo;

public interface AtualizarProdutoGrupoPort {
    ProdutoGrupo atualizarProdutoGrupo(Long id, AtualizarProdutoGrupo atualizar);
}
