package br.com.wasistemas.tasko.usuario.application.port.out.perfil;

import br.com.wasistemas.tasko.usuario.domain.perfil.AtualizarUsuarioPerfilTipo;
import br.com.wasistemas.tasko.usuario.domain.perfil.UsuarioPerfilTipo;

public interface AtualizarUsuarioPerfilTipoPort {
    UsuarioPerfilTipo atualizarUsuarioPerfilTipo(AtualizarUsuarioPerfilTipo atualizarUsuarioPerfilTipo);
}
