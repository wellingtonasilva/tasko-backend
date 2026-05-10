package br.com.wassistemas.tasko.usuario.adapter.in.web.response;

import br.com.wassistemas.tasko.common.domain.vendedor.Vendedor;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsuarioLoginResponse {
  private Long id;
  private Vendedor vendedor;
  private String nomeUsuario;
  private String token;
  private List<UsuarioPerfilResponse> perfis;
  private List<UsuarioEmpresaResponse> empresas;
}
