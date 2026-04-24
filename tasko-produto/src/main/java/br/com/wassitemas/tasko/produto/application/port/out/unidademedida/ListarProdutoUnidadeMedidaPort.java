package br.com.wassitemas.tasko.produto.application.port.out.unidademedida;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassitemas.tasko.produto.domain.unidademedida.ProdutoUnidadeMedida;
import java.util.List;

public interface ListarProdutoUnidadeMedidaPort {
    List<ProdutoUnidadeMedida> listarProdutoUnidadeMedida(Paginacao paginacao);
}
