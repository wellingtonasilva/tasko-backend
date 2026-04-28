package br.com.wassistemas.tasko.usuario.application.port.out.usuario;

import br.com.wassistemas.tasko.usuario.domain.login.CriarResetToken;
import br.com.wassistemas.tasko.usuario.domain.login.UsuarioResetToken;

public interface AdicionarUsuarioResetTokenPort {
    UsuarioResetToken adicionarUsuarioResetToken(CriarResetToken criarResetToken);
}
