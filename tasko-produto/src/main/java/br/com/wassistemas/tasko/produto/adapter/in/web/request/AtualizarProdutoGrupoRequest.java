package br.com.wassistemas.tasko.produto.adapter.in.web.request;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class AtualizarProdutoGrupoRequest {
    private Long id;
    private Long empresaId;
    private String descricaoGrupo;
}
