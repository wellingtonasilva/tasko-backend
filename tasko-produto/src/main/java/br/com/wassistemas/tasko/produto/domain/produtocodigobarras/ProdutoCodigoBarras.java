package br.com.wassistemas.tasko.produto.domain.produtocodigobarras;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ProdutoCodigoBarras {
    private Long id;
    private Long produtoId;
    private Long codigoBarrasTipoId;
    private String codigoBarras;
    private Boolean principal;
    private Auditoria auditoria;
}
