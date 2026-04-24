package br.com.wassitemas.tasko.produto.application.port.in.usecases;

import br.com.wassitemas.tasko.produto.domain.unidademedida.AdicionarProdutoUnidadeMedida;
import br.com.wassitemas.tasko.produto.domain.unidademedida.AtualizarProdutoUnidadeMedida;
import br.com.wassitemas.tasko.produto.domain.unidademedida.ProdutoUnidadeMedida;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface ProdutoUnidadeMedidaUseCases extends GenericUseCase<ProdutoUnidadeMedida, AdicionarProdutoUnidadeMedida, AtualizarProdutoUnidadeMedida> {
}
