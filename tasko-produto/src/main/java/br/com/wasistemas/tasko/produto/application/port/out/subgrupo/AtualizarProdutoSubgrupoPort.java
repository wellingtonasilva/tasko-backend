package br.com.wasistemas.tasko.produto.application.port.out.subgrupo;

import br.com.wasistemas.tasko.produto.domain.subgrupo.AtualizarProdutoSubgrupo;
import br.com.wasistemas.tasko.produto.domain.subgrupo.ProdutoSubgrupo;

public interface AtualizarProdutoSubgrupoPort {
    ProdutoSubgrupo atualizarProdutoSubgrupo(Long id, AtualizarProdutoSubgrupo atualizar);
}
