package br.com.wasistemas.tasko.usuario.application.port.in.usecases;

import br.com.wasistemas.tasko.usuario.domain.login.Login;
import br.com.wasistemas.tasko.usuario.domain.login.UsuarioLogin;

public interface UsuarioLoginUseCases {

  UsuarioLogin login(Login login);
}
