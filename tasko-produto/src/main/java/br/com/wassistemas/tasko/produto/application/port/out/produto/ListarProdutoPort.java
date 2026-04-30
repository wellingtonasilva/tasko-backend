package br.com.wassistemas.tasko.produto.application.port.out.produto;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.produto.domain.produto.Produto;
import java.util.List;

public interface ListarProdutoPort {
    List<Produto> listarProduto(Long empresaId, Paginacao paginacao);
}
