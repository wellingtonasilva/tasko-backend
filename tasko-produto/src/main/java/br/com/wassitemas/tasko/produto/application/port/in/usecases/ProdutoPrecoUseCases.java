package br.com.wassitemas.tasko.produto.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.BaseUseCase;
import br.com.wassitemas.tasko.produto.domain.produtopreco.AdicionarProdutoPreco;
import br.com.wassitemas.tasko.produto.domain.produtopreco.AtualizarProdutoPreco;
import br.com.wassitemas.tasko.produto.domain.produtopreco.ProdutoPreco;

public interface ProdutoPrecoUseCases extends
    BaseUseCase<ProdutoPreco, AdicionarProdutoPreco, AtualizarProdutoPreco> {
}
