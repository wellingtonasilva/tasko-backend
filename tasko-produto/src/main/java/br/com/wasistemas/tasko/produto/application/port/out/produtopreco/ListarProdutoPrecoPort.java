package br.com.wasistemas.tasko.produto.application.port.out.produtopreco;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.produto.domain.produtopreco.ProdutoPreco;
import java.util.List;

public interface ListarProdutoPrecoPort {
    List<ProdutoPreco> listarProdutoPreco(Paginacao paginacao);
}
