package br.com.wassistemas.tasko.produto.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.TenantUseCase;
import br.com.wassistemas.tasko.produto.domain.grupo.AdicionarProdutoGrupo;
import br.com.wassistemas.tasko.produto.domain.grupo.AtualizarProdutoGrupo;
import br.com.wassistemas.tasko.produto.domain.grupo.ProdutoGrupo;

public interface ProdutoGrupoUseCases extends
    TenantUseCase<ProdutoGrupo, AdicionarProdutoGrupo, AtualizarProdutoGrupo> {
}
