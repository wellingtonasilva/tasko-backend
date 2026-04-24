package br.com.wassitemas.tasko.produto.application.port.out.produtocodigobarras;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassitemas.tasko.produto.domain.produtocodigobarras.ProdutoCodigoBarras;
import java.util.List;

public interface ListarProdutoCodigoBarrasPort {
    List<ProdutoCodigoBarras> listarProdutoCodigoBarras(Paginacao paginacao);
}
