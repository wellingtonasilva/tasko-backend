package br.com.wasistemas.tasko.usuario.application.port.out.usuario.perfil;

import br.com.wasistemas.tasko.usuario.domain.usuario.perfl.UsuarioPerfil;

public interface ObterUsuarioPerfilPorIdPort {
    UsuarioPerfil obterUsuarioPerfilPorId(Long id);
}
