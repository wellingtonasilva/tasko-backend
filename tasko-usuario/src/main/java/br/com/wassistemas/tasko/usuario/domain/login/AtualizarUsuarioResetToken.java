package br.com.wassistemas.tasko.usuario.domain.login;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AtualizarUsuarioResetToken {
  private Long id;
  private Boolean utilizado;
}