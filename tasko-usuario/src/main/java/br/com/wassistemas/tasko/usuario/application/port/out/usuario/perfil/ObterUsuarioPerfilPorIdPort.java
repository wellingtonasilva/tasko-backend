package br.com.wassistemas.tasko.usuario.application.port.out.usuario.perfil;

import br.com.wassistemas.tasko.usuario.domain.usuario.perfl.UsuarioPerfil;

public interface ObterUsuarioPerfilPorIdPort {
    UsuarioPerfil obterUsuarioPerfilPorId(Long id);
}
