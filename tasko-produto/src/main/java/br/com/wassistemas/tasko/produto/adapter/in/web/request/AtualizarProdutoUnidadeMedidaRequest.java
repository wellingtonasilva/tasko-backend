package br.com.wassistemas.tasko.produto.adapter.in.web.request;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class AtualizarProdutoUnidadeMedidaRequest {
    private Long id;
    private String descricaoUnidadeMedida;
}
