package br.com.wassistemas.tasko.usuario.application.port.out.usuario;

import br.com.wassistemas.tasko.usuario.domain.login.UsuarioResetToken;
import com.mailjet.client.errors.MailjetException;

public interface EnviarEmailRecuperacaoSenhaPort {

  void enviarEmailRecuperacaoSenha(UsuarioResetToken token) throws MailjetException;
}
