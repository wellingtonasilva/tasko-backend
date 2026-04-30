package br.com.wassistemas.tasko.produto.application.port.out.subgrupo;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.produto.domain.subgrupo.ProdutoSubgrupo;
import java.util.List;

public interface ListarProdutoSubgrupoPort {
    List<ProdutoSubgrupo> listarProdutoSubgrupo(Long empresaId, Paginacao paginacao);
}
