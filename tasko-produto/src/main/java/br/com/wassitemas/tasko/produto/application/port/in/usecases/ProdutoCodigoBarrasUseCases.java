package br.com.wassitemas.tasko.produto.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.BaseUseCase;
import br.com.wassitemas.tasko.produto.domain.produtocodigobarras.AdicionarProdutoCodigoBarras;
import br.com.wassitemas.tasko.produto.domain.produtocodigobarras.AtualizarProdutoCodigoBarras;
import br.com.wassitemas.tasko.produto.domain.produtocodigobarras.ProdutoCodigoBarras;

public interface ProdutoCodigoBarrasUseCases extends
    BaseUseCase<ProdutoCodigoBarras, AdicionarProdutoCodigoBarras, AtualizarProdutoCodigoBarras> {
}
