package br.com.wasistemas.tasko.produto.application.port.in.usecases;

import br.com.wasistemas.tasko.produto.domain.subgrupo.AdicionarProdutoSubgrupo;
import br.com.wasistemas.tasko.produto.domain.subgrupo.AtualizarProdutoSubgrupo;
import br.com.wasistemas.tasko.produto.domain.subgrupo.ProdutoSubgrupo;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface ProdutoSubgrupoUseCases extends GenericUseCase<ProdutoSubgrupo, AdicionarProdutoSubgrupo, AtualizarProdutoSubgrupo> {
}
