package br.com.wassistemas.tasko.produto.application.port.out.produtocodigobarras;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.produto.domain.produtocodigobarras.ProdutoCodigoBarras;
import java.util.List;

public interface ListarProdutoCodigoBarrasPort {
    List<ProdutoCodigoBarras> listarProdutoCodigoBarras(Paginacao paginacao);
}
