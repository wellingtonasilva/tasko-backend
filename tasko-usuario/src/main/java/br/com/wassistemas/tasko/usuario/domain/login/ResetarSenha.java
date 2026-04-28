package br.com.wassistemas.tasko.usuario.domain.login;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ResetarSenha {
  String token;
  String novaSenha;
}
