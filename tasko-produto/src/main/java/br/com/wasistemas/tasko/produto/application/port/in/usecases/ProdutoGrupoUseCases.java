package br.com.wasistemas.tasko.produto.application.port.in.usecases;

import br.com.wasistemas.tasko.produto.domain.grupo.AdicionarProdutoGrupo;
import br.com.wasistemas.tasko.produto.domain.grupo.AtualizarProdutoGrupo;
import br.com.wasistemas.tasko.produto.domain.grupo.ProdutoGrupo;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface ProdutoGrupoUseCases extends GenericUseCase<ProdutoGrupo, AdicionarProdutoGrupo, AtualizarProdutoGrupo> {
}
