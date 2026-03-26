package br.com.wasistemas.tasko.produto.application.port.out.subgrupo;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.produto.domain.subgrupo.ProdutoSubgrupo;
import java.util.List;

public interface ListarProdutoSubgrupoPort {
    List<ProdutoSubgrupo> listarProdutoSubgrupo(Paginacao paginacao);
}
