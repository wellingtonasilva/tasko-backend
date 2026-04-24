package br.com.wassistemas.tasko.usuario.adapter.in.web.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginRequest {
  private String nomeUsuario;
  private String senha;
}
