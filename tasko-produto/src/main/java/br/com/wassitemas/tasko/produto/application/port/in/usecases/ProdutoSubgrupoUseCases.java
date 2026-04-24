package br.com.wassitemas.tasko.produto.application.port.in.usecases;

import br.com.wassitemas.tasko.produto.domain.subgrupo.AdicionarProdutoSubgrupo;
import br.com.wassitemas.tasko.produto.domain.subgrupo.AtualizarProdutoSubgrupo;
import br.com.wassitemas.tasko.produto.domain.subgrupo.ProdutoSubgrupo;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface ProdutoSubgrupoUseCases extends GenericUseCase<ProdutoSubgrupo, AdicionarProdutoSubgrupo, AtualizarProdutoSubgrupo> {
}
