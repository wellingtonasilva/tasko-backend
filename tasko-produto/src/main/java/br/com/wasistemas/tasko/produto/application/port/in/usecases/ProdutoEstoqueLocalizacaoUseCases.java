package br.com.wasistemas.tasko.produto.application.port.in.usecases;

import br.com.wasistemas.tasko.produto.domain.produtoestoque.AdicionarProdutoEstoqueLocalizacao;
import br.com.wasistemas.tasko.produto.domain.produtoestoque.AtualizarProdutoEstoqueLocalizacao;
import br.com.wasistemas.tasko.produto.domain.produtoestoque.ProdutoEstoqueLocalizacao;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface ProdutoEstoqueLocalizacaoUseCases extends GenericUseCase<ProdutoEstoqueLocalizacao, AdicionarProdutoEstoqueLocalizacao, AtualizarProdutoEstoqueLocalizacao> {
}
