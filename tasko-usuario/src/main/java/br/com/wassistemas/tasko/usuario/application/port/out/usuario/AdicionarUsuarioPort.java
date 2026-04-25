package br.com.wassistemas.tasko.usuario.application.port.out.usuario;

import br.com.wassistemas.tasko.common.domain.usuario.AdicionarUsuario;
import br.com.wassistemas.tasko.common.domain.usuario.Usuario;

public interface AdicionarUsuarioPort {
    Usuario adicionarUsuario(AdicionarUsuario usuario);
}
