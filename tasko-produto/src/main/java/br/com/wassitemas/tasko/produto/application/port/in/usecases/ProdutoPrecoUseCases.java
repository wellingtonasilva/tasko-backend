package br.com.wassitemas.tasko.produto.application.port.in.usecases;

import br.com.wassitemas.tasko.produto.domain.produtopreco.AdicionarProdutoPreco;
import br.com.wassitemas.tasko.produto.domain.produtopreco.AtualizarProdutoPreco;
import br.com.wassitemas.tasko.produto.domain.produtopreco.ProdutoPreco;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface ProdutoPrecoUseCases extends GenericUseCase<ProdutoPreco, AdicionarProdutoPreco, AtualizarProdutoPreco> {
}
