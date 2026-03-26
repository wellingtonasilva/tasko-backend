package br.com.wasistemas.tasko.produto.application.port.out.produtoestoque;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.produto.domain.produtoestoque.ProdutoEstoqueLocalizacao;
import java.util.List;

public interface ListarProdutoEstoqueLocalizacaoPort {
    List<ProdutoEstoqueLocalizacao> listarProdutoEstoqueLocalizacao(Paginacao paginacao);
}
