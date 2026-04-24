package br.com.wassitemas.tasko.produto.application.port.in.usecases;

import br.com.wassitemas.tasko.produto.domain.produtocodigobarras.AdicionarProdutoCodigoBarras;
import br.com.wassitemas.tasko.produto.domain.produtocodigobarras.AtualizarProdutoCodigoBarras;
import br.com.wassitemas.tasko.produto.domain.produtocodigobarras.ProdutoCodigoBarras;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface ProdutoCodigoBarrasUseCases extends GenericUseCase<ProdutoCodigoBarras, AdicionarProdutoCodigoBarras, AtualizarProdutoCodigoBarras> {
}
