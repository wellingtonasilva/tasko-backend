package br.com.wasistemas.tasko.usuario.domain.login;

import br.com.wasistemas.tasko.vendedor.domain.vendedor.Vendedor;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioLogin {
  private Long id;
  private Vendedor vendedor;
  private String nomeUsuario;
  private String senha;
  private List<UsuarioLoginPerfil> perfis;
  private List<UsuarioLoginEmpresa> empresas;
}
