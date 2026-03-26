package br.com.wasistemas.tasko.produto.application.port.out.subgrupo;

import br.com.wasistemas.tasko.produto.domain.subgrupo.AdicionarProdutoSubgrupo;
import br.com.wasistemas.tasko.produto.domain.subgrupo.ProdutoSubgrupo;

public interface AdicionarProdutoSubgrupoPort {
    ProdutoSubgrupo adicionarProdutoSubgrupo(AdicionarProdutoSubgrupo adicionar);
}
