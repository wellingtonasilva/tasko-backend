package br.com.wassitemas.tasko.produto.domain.grupo;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ProdutoGrupo {
    private Long id;
    private Long empresaId;
    private String descricaoGrupo;
    private Auditoria auditoria;
}
