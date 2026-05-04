package br.com.wassistemas.tasko.common.usecases.usuario;

import br.com.wassistemas.tasko.common.usecases.TenantUseCase;
import br.com.wassistemas.tasko.common.domain.usuario.AdicionarUsuario;
import br.com.wassistemas.tasko.common.domain.usuario.Usuario;
import br.com.wassistemas.tasko.common.domain.usuario.AtualizarUsuario;

public interface UsuarioUseCases extends
    TenantUseCase<Usuario, AdicionarUsuario, AtualizarUsuario> {

  Usuario adicionarUsuarioComEmpresa(Long empresaId, AdicionarUsuario adicionarUsuario);
}
