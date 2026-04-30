package br.com.wassistemas.tasko.produto.application.port.in.usecases;

import br.com.wassistemas.tasko.produto.domain.produto.AdicionarProduto;
import br.com.wassistemas.tasko.produto.domain.produto.AtualizarProduto;
import br.com.wassistemas.tasko.produto.domain.produto.Produto;
import br.com.wassistemas.tasko.common.usecases.TenantUseCase;

public interface ProdutoUseCases extends
    TenantUseCase<Produto, AdicionarProduto, AtualizarProduto> {
}
