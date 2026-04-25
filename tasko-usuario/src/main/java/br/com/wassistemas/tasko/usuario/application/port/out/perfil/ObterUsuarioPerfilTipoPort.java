package br.com.wassistemas.tasko.usuario.application.port.out.perfil;

import br.com.wassistemas.tasko.common.domain.usuario.perfil.UsuarioPerfilTipo;

public interface ObterUsuarioPerfilTipoPort {
    UsuarioPerfilTipo obterUsuarioPerfilTipoPorId(Long id);
}
