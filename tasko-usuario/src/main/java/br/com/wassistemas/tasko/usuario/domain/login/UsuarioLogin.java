package br.com.wassistemas.tasko.usuario.domain.login;

import br.com.wassistemas.tasko.common.domain.vendedor.Vendedor;
import java.util.List;
import lombok.Data;

@Data
public class UsuarioLogin {
  private Long id;
  private Vendedor vendedor;
  private String nomeUsuario;
  private String senha;
  private List<UsuarioLoginPerfil> perfis;
  private List<UsuarioLoginEmpresa> empresas;
  private String token;
}
