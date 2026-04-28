package br.com.wassistemas.tasko.usuario.adapter.in.web.request;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Value;

@Value
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
public class ResetarSenhaRequest {
  String token;
  String novaSenha;
}
