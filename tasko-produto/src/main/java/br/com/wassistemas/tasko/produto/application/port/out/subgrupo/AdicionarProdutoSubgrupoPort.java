package br.com.wassistemas.tasko.produto.application.port.out.subgrupo;

import br.com.wassistemas.tasko.produto.domain.subgrupo.AdicionarProdutoSubgrupo;
import br.com.wassistemas.tasko.produto.domain.subgrupo.ProdutoSubgrupo;

public interface AdicionarProdutoSubgrupoPort {
    ProdutoSubgrupo adicionarProdutoSubgrupo(AdicionarProdutoSubgrupo adicionar);
}
