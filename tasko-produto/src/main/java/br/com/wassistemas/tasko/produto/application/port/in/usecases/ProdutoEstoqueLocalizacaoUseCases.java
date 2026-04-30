package br.com.wassistemas.tasko.produto.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.BaseUseCase;
import br.com.wassistemas.tasko.produto.domain.produtoestoque.AdicionarProdutoEstoqueLocalizacao;
import br.com.wassistemas.tasko.produto.domain.produtoestoque.AtualizarProdutoEstoqueLocalizacao;
import br.com.wassistemas.tasko.produto.domain.produtoestoque.ProdutoEstoqueLocalizacao;

public interface ProdutoEstoqueLocalizacaoUseCases extends
    BaseUseCase<ProdutoEstoqueLocalizacao, AdicionarProdutoEstoqueLocalizacao, AtualizarProdutoEstoqueLocalizacao> {
}
