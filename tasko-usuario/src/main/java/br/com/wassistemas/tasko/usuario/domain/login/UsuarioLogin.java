package br.com.wassistemas.tasko.usuario.domain.login;

import br.com.wassistemas.tasko.common.domain.usuario.empresa.UsuarioEmpresa;
import br.com.wassistemas.tasko.common.domain.usuario.perfil.UsuarioPerfil;
import br.com.wassistemas.tasko.common.domain.vendedor.Vendedor;
import java.util.List;
import lombok.Data;

@Data
public class UsuarioLogin {
  private Long id;
  private Vendedor vendedor;
  private String nomeUsuario;
  private String senha;
  private List<UsuarioPerfil> perfis;
  private List<UsuarioEmpresa> empresas;
  private String token;
}
