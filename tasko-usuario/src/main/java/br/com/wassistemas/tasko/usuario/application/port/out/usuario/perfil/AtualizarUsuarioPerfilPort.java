package br.com.wassistemas.tasko.usuario.application.port.out.usuario.perfil;

import br.com.wassistemas.tasko.usuario.domain.usuario.perfl.AtualizarUsuarioPerfil;
import br.com.wassistemas.tasko.common.domain.usuario.perfil.UsuarioPerfil;

public interface AtualizarUsuarioPerfilPort {
    UsuarioPerfil atualizarUsuarioPerfil(Long id, AtualizarUsuarioPerfil atualizar);
}
