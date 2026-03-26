package br.com.wasistemas.tasko.produto.domain.subgrupo;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ProdutoSubgrupo {
    private Long id;
    private String descricaoSubgrupo;
    private Auditoria auditoria;
}
