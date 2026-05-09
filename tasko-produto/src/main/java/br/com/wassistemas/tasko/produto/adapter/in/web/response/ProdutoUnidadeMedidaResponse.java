package br.com.wassistemas.tasko.produto.adapter.in.web.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProdutoUnidadeMedidaResponse {

  private Long id;
  private String codigo;
  private String descricaoUnidadeMedida;
}
