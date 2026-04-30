package br.com.wassistemas.tasko.produto.application.port.out.produtoestoque;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.produto.domain.produtoestoque.ProdutoEstoqueLocalizacao;
import java.util.List;

public interface ListarProdutoEstoqueLocalizacaoPort {
    List<ProdutoEstoqueLocalizacao> listarProdutoEstoqueLocalizacao(Paginacao paginacao);
}
