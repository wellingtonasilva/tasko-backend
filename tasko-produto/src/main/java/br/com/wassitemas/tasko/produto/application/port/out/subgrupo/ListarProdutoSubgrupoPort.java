package br.com.wassitemas.tasko.produto.application.port.out.subgrupo;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassitemas.tasko.produto.domain.subgrupo.ProdutoSubgrupo;
import java.util.List;

public interface ListarProdutoSubgrupoPort {
    List<ProdutoSubgrupo> listarProdutoSubgrupo(Paginacao paginacao);
}
