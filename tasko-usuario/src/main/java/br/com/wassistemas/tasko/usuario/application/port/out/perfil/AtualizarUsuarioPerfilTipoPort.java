package br.com.wassistemas.tasko.usuario.application.port.out.perfil;

import br.com.wassistemas.tasko.usuario.domain.perfil.AtualizarUsuarioPerfilTipo;
import br.com.wassistemas.tasko.common.domain.usuario.perfil.UsuarioPerfilTipo;

public interface AtualizarUsuarioPerfilTipoPort {
    UsuarioPerfilTipo atualizarUsuarioPerfilTipo(Long id, AtualizarUsuarioPerfilTipo atualizarUsuarioPerfilTipo);
}
