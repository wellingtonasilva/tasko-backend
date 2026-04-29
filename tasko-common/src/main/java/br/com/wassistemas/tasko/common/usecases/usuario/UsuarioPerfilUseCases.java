package br.com.wassistemas.tasko.common.usecases.usuario;

import br.com.wassistemas.tasko.common.domain.usuario.perfil.AdicionarUsuarioPerfil;
import br.com.wassistemas.tasko.common.domain.usuario.perfil.AtualizarUsuarioPerfil;
import br.com.wassistemas.tasko.common.domain.usuario.perfil.UsuarioPerfil;
import br.com.wassistemas.tasko.common.usecases.BaseUseCase;

public interface UsuarioPerfilUseCases extends BaseUseCase<UsuarioPerfil, AdicionarUsuarioPerfil,
        AtualizarUsuarioPerfil> {
}
