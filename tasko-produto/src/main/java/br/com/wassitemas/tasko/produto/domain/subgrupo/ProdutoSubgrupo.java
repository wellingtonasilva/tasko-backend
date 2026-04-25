package br.com.wassitemas.tasko.produto.domain.subgrupo;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ProdutoSubgrupo {
    private Long id;
    private Long empresaId;
    private String descricaoSubgrupo;
    private Auditoria auditoria;
}
