package br.com.wassistemas.tasko.usuario.application.port.in.usecases;

import br.com.wassistemas.tasko.common.exception.ResourceNotFoundException;
import br.com.wassistemas.tasko.usuario.domain.login.Login;
import br.com.wassistemas.tasko.usuario.domain.login.ResetarSenha;
import br.com.wassistemas.tasko.usuario.domain.login.SolicitacaoRecuperarSenha;
import br.com.wassistemas.tasko.usuario.domain.login.UsuarioLogin;
import com.mailjet.client.errors.MailjetException;

public interface UsuarioLoginUseCases {

  UsuarioLogin login(Login login) throws ResourceNotFoundException;

  void solicitarRecuperacaoSenha(SolicitacaoRecuperarSenha solicitacaoRecuperarSenha)
      throws MailjetException;

  void resetarSenha(ResetarSenha resetarSenha) throws ResourceNotFoundException;
}
