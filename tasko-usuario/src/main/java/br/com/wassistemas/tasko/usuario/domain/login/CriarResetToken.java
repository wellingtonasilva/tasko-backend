package br.com.wassistemas.tasko.usuario.domain.login;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CriarResetToken {
  private String email;
  private String token;
  private LocalDateTime validoAte;
  private Boolean utilizado;
}
