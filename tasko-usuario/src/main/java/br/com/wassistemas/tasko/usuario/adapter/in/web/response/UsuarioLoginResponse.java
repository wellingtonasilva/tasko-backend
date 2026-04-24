package br.com.wassistemas.tasko.usuario.adapter.in.web.response;

import br.com.wassistemas.tasko.usuario.domain.usuario.empresa.UsuarioEmpresa;
import br.com.wassistemas.tasko.usuario.domain.usuario.perfl.UsuarioPerfil;
import br.com.wassistemas.tasko.vendedor.domain.vendedor.Vendedor;
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
  private String senha;
  private List<UsuarioPerfil> perfis;
  private List<UsuarioEmpresa> empresas;
}
