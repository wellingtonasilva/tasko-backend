package br.com.wassistemas.tasko.usuario.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.BaseUseCase;
import br.com.wassistemas.tasko.usuario.domain.perfil.AdicionarUsuarioPerfilTipo;
import br.com.wassistemas.tasko.usuario.domain.perfil.AtualizarUsuarioPerfilTipo;
import br.com.wassistemas.tasko.common.domain.usuario.perfil.UsuarioPerfilTipo;

public interface UsuarioPerfilTipoUseCases extends BaseUseCase<UsuarioPerfilTipo, AdicionarUsuarioPerfilTipo,
        AtualizarUsuarioPerfilTipo> {
}