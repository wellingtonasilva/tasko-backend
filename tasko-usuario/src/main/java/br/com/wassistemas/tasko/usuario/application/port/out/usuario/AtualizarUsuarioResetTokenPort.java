package br.com.wassistemas.tasko.usuario.application.port.out.usuario;

import br.com.wassistemas.tasko.usuario.domain.login.AtualizarUsuarioResetToken;
import br.com.wassistemas.tasko.usuario.domain.login.UsuarioResetToken;

public interface AtualizarUsuarioResetTokenPort {
    UsuarioResetToken atualizarUsuarioResetToken(
        AtualizarUsuarioResetToken atualizarUsuarioResetToken);
}
