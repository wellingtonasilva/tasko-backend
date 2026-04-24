package br.com.wassistemas.tasko.usuario.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.GenericUseCase;
import br.com.wassistemas.tasko.usuario.domain.perfil.AdicionarUsuarioPerfilTipo;
import br.com.wassistemas.tasko.usuario.domain.perfil.AtualizarUsuarioPerfilTipo;
import br.com.wassistemas.tasko.usuario.domain.perfil.UsuarioPerfilTipo;

public interface UsuarioPerfilTipoUseCases extends GenericUseCase<UsuarioPerfilTipo, AdicionarUsuarioPerfilTipo,
        AtualizarUsuarioPerfilTipo> {
}