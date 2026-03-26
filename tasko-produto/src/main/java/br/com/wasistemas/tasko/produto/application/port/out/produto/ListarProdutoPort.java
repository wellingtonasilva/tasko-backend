package br.com.wasistemas.tasko.produto.application.port.out.produto;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.produto.domain.produto.Produto;
import java.util.List;

public interface ListarProdutoPort {
    List<Produto> listarProduto(Paginacao paginacao);
}
