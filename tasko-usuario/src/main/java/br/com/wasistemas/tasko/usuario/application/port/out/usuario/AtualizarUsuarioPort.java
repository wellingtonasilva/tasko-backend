package br.com.wasistemas.tasko.usuario.application.port.out.usuario;

import br.com.wasistemas.tasko.usuario.domain.usuario.AtualizarUsuario;
import br.com.wasistemas.tasko.usuario.domain.usuario.Usuario;

public interface AtualizarUsuarioPort {
    Usuario atualizarUsuario(Long id, AtualizarUsuario usuario);
}
