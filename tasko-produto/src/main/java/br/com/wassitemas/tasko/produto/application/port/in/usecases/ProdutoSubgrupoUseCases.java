package br.com.wassitemas.tasko.produto.application.port.in.usecases;

import br.com.wassitemas.tasko.produto.domain.subgrupo.AdicionarProdutoSubgrupo;
import br.com.wassitemas.tasko.produto.domain.subgrupo.AtualizarProdutoSubgrupo;
import br.com.wassitemas.tasko.produto.domain.subgrupo.ProdutoSubgrupo;
import br.com.wassistemas.tasko.common.usecases.TenantUseCase;

public interface ProdutoSubgrupoUseCases extends
    TenantUseCase<ProdutoSubgrupo, AdicionarProdutoSubgrupo, AtualizarProdutoSubgrupo> {
}
