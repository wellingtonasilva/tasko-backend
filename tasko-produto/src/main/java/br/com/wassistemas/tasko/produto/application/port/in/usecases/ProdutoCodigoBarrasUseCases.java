package br.com.wassistemas.tasko.produto.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.BaseUseCase;
import br.com.wassistemas.tasko.produto.domain.produtocodigobarras.AdicionarProdutoCodigoBarras;
import br.com.wassistemas.tasko.produto.domain.produtocodigobarras.AtualizarProdutoCodigoBarras;
import br.com.wassistemas.tasko.produto.domain.produtocodigobarras.ProdutoCodigoBarras;

public interface ProdutoCodigoBarrasUseCases extends
    BaseUseCase<ProdutoCodigoBarras, AdicionarProdutoCodigoBarras, AtualizarProdutoCodigoBarras> {
}
