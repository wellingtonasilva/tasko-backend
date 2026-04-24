package br.com.wassitemas.tasko.produto.application.port.out.subgrupo;

import br.com.wassitemas.tasko.produto.domain.subgrupo.AtualizarProdutoSubgrupo;
import br.com.wassitemas.tasko.produto.domain.subgrupo.ProdutoSubgrupo;

public interface AtualizarProdutoSubgrupoPort {
    ProdutoSubgrupo atualizarProdutoSubgrupo(Long id, AtualizarProdutoSubgrupo atualizar);
}
