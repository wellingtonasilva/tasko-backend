package br.com.wassistemas.tasko.usuario.application.port.in.usecases;

import br.com.wassistemas.tasko.common.exception.ResourceNotFoundException;
import br.com.wassistemas.tasko.usuario.domain.login.Login;
import br.com.wassistemas.tasko.usuario.domain.login.UsuarioLogin;

public interface UsuarioLoginUseCases {

  UsuarioLogin login(Login login) throws ResourceNotFoundException;
}
