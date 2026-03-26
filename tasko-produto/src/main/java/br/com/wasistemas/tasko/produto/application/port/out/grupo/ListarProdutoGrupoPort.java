package br.com.wasistemas.tasko.produto.application.port.out.grupo;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.produto.domain.grupo.ProdutoGrupo;
import java.util.List;

public interface ListarProdutoGrupoPort {
    List<ProdutoGrupo> listarProdutoGrupo(Paginacao paginacao);
}
