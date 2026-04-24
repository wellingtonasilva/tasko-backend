package br.com.wassistemas.tasko.usuario.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.GenericUseCase;
import br.com.wassistemas.tasko.usuario.domain.usuario.perfl.AdicionarUsuarioPerfil;
import br.com.wassistemas.tasko.usuario.domain.usuario.perfl.AtualizarUsuarioPerfil;
import br.com.wassistemas.tasko.usuario.domain.usuario.perfl.UsuarioPerfil;

public interface UsuarioPerfilUseCases extends GenericUseCase<UsuarioPerfil, AdicionarUsuarioPerfil,
        AtualizarUsuarioPerfil> {
}
