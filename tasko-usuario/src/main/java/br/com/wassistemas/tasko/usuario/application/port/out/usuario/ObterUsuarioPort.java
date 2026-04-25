package br.com.wassistemas.tasko.usuario.application.port.out.usuario;

import br.com.wassistemas.tasko.common.domain.usuario.Usuario;

public interface ObterUsuarioPort {
    Usuario obterUsuarioPorId(Long id);
}
