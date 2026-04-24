package br.com.wassitemas.tasko.produto.application.port.out.produto;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassitemas.tasko.produto.domain.produto.Produto;
import java.util.List;

public interface ListarProdutoPort {
    List<Produto> listarProduto(Paginacao paginacao);
}
