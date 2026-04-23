package br.com.wasistemas.tasko.usuario.application.port.in.usecases;

import br.com.wasistemas.tasko.common.usecases.GenericUseCase;
import br.com.wasistemas.tasko.usuario.domain.usuario.perfl.AdicionarUsuarioPerfil;
import br.com.wasistemas.tasko.usuario.domain.usuario.perfl.AtualizarUsuarioPerfil;
import br.com.wasistemas.tasko.usuario.domain.usuario.perfl.UsuarioPerfil;

public interface UsuarioPerfilUseCases extends GenericUseCase<UsuarioPerfil, AdicionarUsuarioPerfil,
        AtualizarUsuarioPerfil> {
}
