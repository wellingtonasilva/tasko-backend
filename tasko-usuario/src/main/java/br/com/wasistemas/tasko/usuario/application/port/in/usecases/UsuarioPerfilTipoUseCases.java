package br.com.wasistemas.tasko.usuario.application.port.in.usecases;

import br.com.wasistemas.tasko.common.usecases.GenericUseCase;
import br.com.wasistemas.tasko.usuario.domain.perfil.AdicionarUsuarioPerfilTipo;
import br.com.wasistemas.tasko.usuario.domain.perfil.AtualizarUsuarioPerfilTipo;
import br.com.wasistemas.tasko.usuario.domain.perfil.UsuarioPerfilTipo;

public interface UsuarioPerfilTipoUseCases extends GenericUseCase<UsuarioPerfilTipo, AdicionarUsuarioPerfilTipo,
        AtualizarUsuarioPerfilTipo> {
}