package br.com.wasistemas.tasko.usuario.application.port.out.usuario;

import br.com.wasistemas.tasko.usuario.domain.usuario.Usuario;

public interface ObterUsuarioPort {
    Usuario obterUsuarioPorId(Long id);
}
