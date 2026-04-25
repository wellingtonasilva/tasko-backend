package br.com.wassistemas.tasko.usuario.application.port.out.usuario;

import br.com.wassistemas.tasko.common.domain.usuario.AtualizarUsuario;
import br.com.wassistemas.tasko.common.domain.usuario.Usuario;

public interface AtualizarUsuarioPort {
    Usuario atualizarUsuario(Long id, AtualizarUsuario usuario);
}
