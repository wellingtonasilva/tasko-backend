package br.com.wassitemas.tasko.produto.application.port.out.grupo;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassitemas.tasko.produto.domain.grupo.ProdutoGrupo;
import java.util.List;

public interface ListarProdutoGrupoPort {
    List<ProdutoGrupo> listarProdutoGrupo(Paginacao paginacao);
}
