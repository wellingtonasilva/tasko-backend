package br.com.wassitemas.tasko.produto.application.port.in.usecases;

import br.com.wassitemas.tasko.produto.domain.grupo.AdicionarProdutoGrupo;
import br.com.wassitemas.tasko.produto.domain.grupo.AtualizarProdutoGrupo;
import br.com.wassitemas.tasko.produto.domain.grupo.ProdutoGrupo;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface ProdutoGrupoUseCases extends GenericUseCase<ProdutoGrupo, AdicionarProdutoGrupo, AtualizarProdutoGrupo> {
}
