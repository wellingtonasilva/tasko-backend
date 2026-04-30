package br.com.wassistemas.tasko.produto.application.port.out.grupo;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.produto.domain.grupo.ProdutoGrupo;
import java.util.List;

public interface ListarProdutoGrupoPort {
    List<ProdutoGrupo> listarProdutoGrupo(Long empresaId, Paginacao paginacao);
}
