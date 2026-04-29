package br.com.wassitemas.tasko.produto.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.BaseUseCase;
import br.com.wassitemas.tasko.produto.domain.produtoestoque.AdicionarProdutoEstoqueLocalizacao;
import br.com.wassitemas.tasko.produto.domain.produtoestoque.AtualizarProdutoEstoqueLocalizacao;
import br.com.wassitemas.tasko.produto.domain.produtoestoque.ProdutoEstoqueLocalizacao;

public interface ProdutoEstoqueLocalizacaoUseCases extends
    BaseUseCase<ProdutoEstoqueLocalizacao, AdicionarProdutoEstoqueLocalizacao, AtualizarProdutoEstoqueLocalizacao> {
}
