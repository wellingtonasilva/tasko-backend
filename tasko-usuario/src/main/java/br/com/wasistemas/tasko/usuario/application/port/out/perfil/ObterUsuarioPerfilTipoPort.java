package br.com.wasistemas.tasko.usuario.application.port.out.perfil;

import br.com.wasistemas.tasko.usuario.domain.perfil.UsuarioPerfilTipo;

public interface ObterUsuarioPerfilTipoPort {
    UsuarioPerfilTipo obterUsuarioPerfilTipoPorId(Long id);
}
