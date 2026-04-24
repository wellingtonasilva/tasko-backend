package br.com.wassitemas.tasko.produto.application.port.in.usecases;

import br.com.wassitemas.tasko.produto.domain.produtoestoque.AdicionarProdutoEstoqueLocalizacao;
import br.com.wassitemas.tasko.produto.domain.produtoestoque.AtualizarProdutoEstoqueLocalizacao;
import br.com.wassitemas.tasko.produto.domain.produtoestoque.ProdutoEstoqueLocalizacao;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface ProdutoEstoqueLocalizacaoUseCases extends GenericUseCase<ProdutoEstoqueLocalizacao, AdicionarProdutoEstoqueLocalizacao, AtualizarProdutoEstoqueLocalizacao> {
}
