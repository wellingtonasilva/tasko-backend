package br.com.wassitemas.tasko.produto.application.port.out.produtoestoque;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassitemas.tasko.produto.domain.produtoestoque.ProdutoEstoqueLocalizacao;
import java.util.List;

public interface ListarProdutoEstoqueLocalizacaoPort {
    List<ProdutoEstoqueLocalizacao> listarProdutoEstoqueLocalizacao(Paginacao paginacao);
}
