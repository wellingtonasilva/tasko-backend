package br.com.wassistemas.tasko.common.usecases.usuario;

import br.com.wassistemas.tasko.common.domain.usuario.empresa.AtualizarUsuarioEmpresa;
import br.com.wassistemas.tasko.common.domain.usuario.empresa.UsuarioEmpresa;
import br.com.wassistemas.tasko.common.domain.usuario.empresa.AdicionarUsuarioEmpresa;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface UsuarioEmpresaUseCases extends GenericUseCase<UsuarioEmpresa, AdicionarUsuarioEmpresa,
        AtualizarUsuarioEmpresa> {
}
