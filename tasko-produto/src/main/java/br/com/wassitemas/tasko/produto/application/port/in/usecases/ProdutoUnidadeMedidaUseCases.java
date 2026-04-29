package br.com.wassitemas.tasko.produto.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.BaseUseCase;
import br.com.wassitemas.tasko.produto.domain.unidademedida.AdicionarProdutoUnidadeMedida;
import br.com.wassitemas.tasko.produto.domain.unidademedida.AtualizarProdutoUnidadeMedida;
import br.com.wassitemas.tasko.produto.domain.unidademedida.ProdutoUnidadeMedida;

public interface ProdutoUnidadeMedidaUseCases extends
    BaseUseCase<ProdutoUnidadeMedida, AdicionarProdutoUnidadeMedida, AtualizarProdutoUnidadeMedida> {
}
