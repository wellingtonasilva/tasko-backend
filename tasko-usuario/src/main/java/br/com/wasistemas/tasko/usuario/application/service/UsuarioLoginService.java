package br.com.wasistemas.tasko.usuario.application.service;

import br.com.wasistemas.tasko.usuario.application.port.in.usecases.UsuarioLoginUseCases;
import br.com.wasistemas.tasko.usuario.application.port.out.usuario.ObterUsuarioPorNomeUsuarioPort;
import br.com.wasistemas.tasko.usuario.domain.login.Login;
import br.com.wasistemas.tasko.usuario.domain.login.UsuarioLogin;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioLoginService implements UsuarioLoginUseCases {

  private final ObterUsuarioPorNomeUsuarioPort obterUsuarioPorNomeUsuarioPort;

  @Override
  public UsuarioLogin login(Login login) {
    return obterUsuarioPorNomeUsuarioPort.obterUsuarioPorId(login.getNomeUsuario(),
        login.getSenha());
  }
}
