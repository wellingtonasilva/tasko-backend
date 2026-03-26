package br.com.wasistemas.tasko.produto.application.port.out.produtocodigobarras;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.produto.domain.produtocodigobarras.ProdutoCodigoBarras;
import java.util.List;

public interface ListarProdutoCodigoBarrasPort {
    List<ProdutoCodigoBarras> listarProdutoCodigoBarras(Paginacao paginacao);
}
