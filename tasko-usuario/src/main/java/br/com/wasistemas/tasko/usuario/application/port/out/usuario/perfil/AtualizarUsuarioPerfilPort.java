package br.com.wasistemas.tasko.usuario.application.port.out.usuario.perfil;

import br.com.wasistemas.tasko.usuario.domain.usuario.perfl.AdicionarUsuarioPerfil;
import br.com.wasistemas.tasko.usuario.domain.usuario.perfl.AtualizarUsuarioPerfil;
import br.com.wasistemas.tasko.usuario.domain.usuario.perfl.UsuarioPerfil;

public interface AtualizarUsuarioPerfilPort {
    UsuarioPerfil atualizarUsuarioPerfil(Long id, AtualizarUsuarioPerfil atualizar);
}
