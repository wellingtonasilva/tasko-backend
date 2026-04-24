package br.com.wassitemas.tasko.produto.application.port.out.subgrupo;

import br.com.wassitemas.tasko.produto.domain.subgrupo.AdicionarProdutoSubgrupo;
import br.com.wassitemas.tasko.produto.domain.subgrupo.ProdutoSubgrupo;

public interface AdicionarProdutoSubgrupoPort {
    ProdutoSubgrupo adicionarProdutoSubgrupo(AdicionarProdutoSubgrupo adicionar);
}
