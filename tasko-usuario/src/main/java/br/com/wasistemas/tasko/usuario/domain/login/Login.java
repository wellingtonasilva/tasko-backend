package br.com.wasistemas.tasko.usuario.domain.login;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Login {
  private String nomeUsuario;
  private String senha;
}
