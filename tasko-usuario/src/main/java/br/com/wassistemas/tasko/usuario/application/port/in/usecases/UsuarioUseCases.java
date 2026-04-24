package br.com.wassistemas.tasko.usuario.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.GenericUseCase;
import br.com.wassistemas.tasko.usuario.domain.usuario.AdicionarUsuario;
import br.com.wassistemas.tasko.usuario.domain.usuario.AtualizarUsuario;
import br.com.wassistemas.tasko.usuario.domain.usuario.Usuario;

public interface UsuarioUseCases extends GenericUseCase<Usuario, AdicionarUsuario, AtualizarUsuario> {
}
