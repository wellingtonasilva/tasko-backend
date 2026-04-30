package br.com.wassistemas.tasko.produto.application.port.out.produtopreco;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.produto.domain.produtopreco.ProdutoPreco;
import java.util.List;

public interface ListarProdutoPrecoPort {
    List<ProdutoPreco> listarProdutoPreco(Paginacao paginacao);
}
