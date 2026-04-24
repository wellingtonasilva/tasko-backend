package br.com.wassitemas.tasko.produto.application.port.out.grupo;

import br.com.wassitemas.tasko.produto.domain.grupo.AdicionarProdutoGrupo;
import br.com.wassitemas.tasko.produto.domain.grupo.ProdutoGrupo;

public interface AdicionarProdutoGrupoPort {
    ProdutoGrupo adicionarProdutoGrupo(AdicionarProdutoGrupo adicionar);
}
