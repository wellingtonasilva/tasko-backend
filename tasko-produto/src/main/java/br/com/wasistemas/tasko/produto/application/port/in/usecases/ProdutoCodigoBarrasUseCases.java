package br.com.wasistemas.tasko.produto.application.port.in.usecases;

import br.com.wasistemas.tasko.produto.domain.produtocodigobarras.AdicionarProdutoCodigoBarras;
import br.com.wasistemas.tasko.produto.domain.produtocodigobarras.AtualizarProdutoCodigoBarras;
import br.com.wasistemas.tasko.produto.domain.produtocodigobarras.ProdutoCodigoBarras;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface ProdutoCodigoBarrasUseCases extends GenericUseCase<ProdutoCodigoBarras, AdicionarProdutoCodigoBarras, AtualizarProdutoCodigoBarras> {
}
