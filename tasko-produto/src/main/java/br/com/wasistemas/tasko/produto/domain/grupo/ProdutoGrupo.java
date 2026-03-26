package br.com.wasistemas.tasko.produto.domain.grupo;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ProdutoGrupo {
    private Long id;
    private String descricaoGrupo;
    private Auditoria auditoria;
}
