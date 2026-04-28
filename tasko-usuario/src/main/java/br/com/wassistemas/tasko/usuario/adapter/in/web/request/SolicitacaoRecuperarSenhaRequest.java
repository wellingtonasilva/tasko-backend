package br.com.wassistemas.tasko.usuario.adapter.in.web.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Value;

@Value
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
public class SolicitacaoRecuperarSenhaRequest {

  @NotEmpty(message = "O campo email é obrigatório")
  String email;
}
