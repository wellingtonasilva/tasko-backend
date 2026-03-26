package br.com.wasistemas.tasko.produto.application.port.out.unidademedida;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.produto.domain.unidademedida.ProdutoUnidadeMedida;
import java.util.List;

public interface ListarProdutoUnidadeMedidaPort {
    List<ProdutoUnidadeMedida> listarProdutoUnidadeMedida(Paginacao paginacao);
}
