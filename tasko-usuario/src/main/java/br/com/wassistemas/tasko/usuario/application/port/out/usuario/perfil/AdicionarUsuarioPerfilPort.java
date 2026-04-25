package br.com.wassistemas.tasko.usuario.application.port.out.usuario.perfil;

import br.com.wassistemas.tasko.common.domain.usuario.perfil.AdicionarUsuarioPerfil;
import br.com.wassistemas.tasko.common.domain.usuario.perfil.UsuarioPerfil;

public interface AdicionarUsuarioPerfilPort {
    UsuarioPerfil adicionarUsuarioPerfil(AdicionarUsuarioPerfil adicionar);
}
