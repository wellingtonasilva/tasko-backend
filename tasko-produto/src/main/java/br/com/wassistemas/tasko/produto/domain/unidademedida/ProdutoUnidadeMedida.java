package br.com.wassistemas.tasko.produto.domain.unidademedida;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProdutoUnidadeMedida {

  private Long id;
  private String codigo;
  private String descricaoUnidadeMedida;
  private Auditoria auditoria;
}
