package br.com.wassistemas.tasko.produto.application.port.out.unidademedida;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.produto.domain.unidademedida.ProdutoUnidadeMedida;
import java.util.List;

public interface ListarProdutoUnidadeMedidaPort {
    List<ProdutoUnidadeMedida> listarProdutoUnidadeMedida(Paginacao paginacao);
}
