package br.com.wassistemas.tasko.produto.application.port.out.grupo;

import br.com.wassistemas.tasko.produto.domain.grupo.AdicionarProdutoGrupo;
import br.com.wassistemas.tasko.produto.domain.grupo.ProdutoGrupo;

public interface AdicionarProdutoGrupoPort {
    ProdutoGrupo adicionarProdutoGrupo(AdicionarProdutoGrupo adicionar);
}
