package br.com.wassitemas.tasko.produto.application.port.in.usecases;

import br.com.wassitemas.tasko.produto.domain.produto.AdicionarProduto;
import br.com.wassitemas.tasko.produto.domain.produto.AtualizarProduto;
import br.com.wassitemas.tasko.produto.domain.produto.Produto;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface ProdutoUseCases extends GenericUseCase<Produto, AdicionarProduto, AtualizarProduto> {
}
