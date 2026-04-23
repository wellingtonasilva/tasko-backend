package br.com.wasistemas.tasko.usuario.application.port.in.usecases;

import br.com.wasistemas.tasko.common.usecases.GenericUseCase;
import br.com.wasistemas.tasko.usuario.domain.usuario.AdicionarUsuario;
import br.com.wasistemas.tasko.usuario.domain.usuario.AtualizarUsuario;
import br.com.wasistemas.tasko.usuario.domain.usuario.Usuario;

public interface UsuarioUseCases extends GenericUseCase<Usuario, AdicionarUsuario, AtualizarUsuario> {
}
