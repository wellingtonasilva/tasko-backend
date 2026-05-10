package br.com.wassistemas.tasko.produto.adapter.in.web.response;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ProdutoGrupoResponse {

  private Long id;
  private Long empresaId;
  private String descricaoGrupo;
}
