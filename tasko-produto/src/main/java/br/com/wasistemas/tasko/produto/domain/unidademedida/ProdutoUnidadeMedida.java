package br.com.wasistemas.tasko.produto.domain.unidademedida;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ProdutoUnidadeMedida {
    private Long id;
    private String descricaoUnidadeMedida;
    private Auditoria auditoria;
}
