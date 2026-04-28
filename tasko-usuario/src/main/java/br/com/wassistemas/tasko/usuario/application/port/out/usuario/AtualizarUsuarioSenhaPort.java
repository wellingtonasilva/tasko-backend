package br.com.wassistemas.tasko.usuario.application.port.out.usuario;

import br.com.wassistemas.tasko.common.domain.usuario.Usuario;

public interface AtualizarUsuarioSenhaPort {
    Usuario atualizarUsuarioSenha(Long id, String novaSenha);
}
