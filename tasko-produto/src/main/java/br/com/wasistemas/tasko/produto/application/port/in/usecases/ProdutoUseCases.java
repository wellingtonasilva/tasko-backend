package br.com.wasistemas.tasko.produto.application.port.in.usecases;

import br.com.wasistemas.tasko.produto.domain.produto.AdicionarProduto;
import br.com.wasistemas.tasko.produto.domain.produto.AtualizarProduto;
import br.com.wasistemas.tasko.produto.domain.produto.Produto;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface ProdutoUseCases extends GenericUseCase<Produto, AdicionarProduto, AtualizarProduto> {
}
