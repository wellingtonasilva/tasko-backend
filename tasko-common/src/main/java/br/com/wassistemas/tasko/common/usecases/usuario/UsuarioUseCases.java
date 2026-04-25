package br.com.wassistemas.tasko.common.usecases.usuario;

import br.com.wassistemas.tasko.common.usecases.GenericUseCase;
import br.com.wassistemas.tasko.common.domain.usuario.AdicionarUsuario;
import br.com.wassistemas.tasko.common.domain.usuario.Usuario;
import br.com.wassistemas.tasko.common.domain.usuario.AtualizarUsuario;

public interface UsuarioUseCases extends GenericUseCase<Usuario, AdicionarUsuario, AtualizarUsuario> {
}
