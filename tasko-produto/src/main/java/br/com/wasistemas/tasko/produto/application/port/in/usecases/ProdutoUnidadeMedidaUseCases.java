package br.com.wasistemas.tasko.produto.application.port.in.usecases;

import br.com.wasistemas.tasko.produto.domain.unidademedida.AdicionarProdutoUnidadeMedida;
import br.com.wasistemas.tasko.produto.domain.unidademedida.AtualizarProdutoUnidadeMedida;
import br.com.wasistemas.tasko.produto.domain.unidademedida.ProdutoUnidadeMedida;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface ProdutoUnidadeMedidaUseCases extends GenericUseCase<ProdutoUnidadeMedida, AdicionarProdutoUnidadeMedida, AtualizarProdutoUnidadeMedida> {
}
