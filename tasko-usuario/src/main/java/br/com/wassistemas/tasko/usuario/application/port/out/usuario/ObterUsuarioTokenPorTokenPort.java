package br.com.wassistemas.tasko.usuario.application.port.out.usuario;

import br.com.wassistemas.tasko.usuario.domain.login.UsuarioResetToken;

public interface ObterUsuarioTokenPorTokenPort {
    UsuarioResetToken obterUsuarioTokenPorToken(String token);
}
