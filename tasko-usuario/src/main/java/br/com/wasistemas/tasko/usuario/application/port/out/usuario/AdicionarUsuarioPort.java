package br.com.wasistemas.tasko.usuario.application.port.out.usuario;

import br.com.wasistemas.tasko.usuario.domain.usuario.AdicionarUsuario;
import br.com.wasistemas.tasko.usuario.domain.usuario.Usuario;

public interface AdicionarUsuarioPort {
    Usuario adicionarUsuario(AdicionarUsuario usuario);
}
