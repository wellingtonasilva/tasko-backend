package br.com.wasistemas.tasko.produto.application.port.in.usecases;

import br.com.wasistemas.tasko.produto.domain.produtopreco.AdicionarProdutoPreco;
import br.com.wasistemas.tasko.produto.domain.produtopreco.AtualizarProdutoPreco;
import br.com.wasistemas.tasko.produto.domain.produtopreco.ProdutoPreco;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface ProdutoPrecoUseCases extends GenericUseCase<ProdutoPreco, AdicionarProdutoPreco, AtualizarProdutoPreco> {
}
