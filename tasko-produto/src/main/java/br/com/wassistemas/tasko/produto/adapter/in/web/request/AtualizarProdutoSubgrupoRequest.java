package br.com.wassistemas.tasko.produto.adapter.in.web.request;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class AtualizarProdutoSubgrupoRequest {
    private Long id;
    private Long empresaId;
    private String descricaoSubgrupo;
    private Auditoria auditoria;
}
