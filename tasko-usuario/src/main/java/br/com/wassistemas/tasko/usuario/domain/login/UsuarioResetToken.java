package br.com.wassistemas.tasko.usuario.domain.login;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class UsuarioResetToken {
  private Long id;
  private String email;
  private String token;
  private LocalDateTime validoAte;
  private Boolean utilizado;
}