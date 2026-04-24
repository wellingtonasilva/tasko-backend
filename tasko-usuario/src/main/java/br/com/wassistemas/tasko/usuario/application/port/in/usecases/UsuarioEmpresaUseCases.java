package br.com.wassistemas.tasko.usuario.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.GenericUseCase;
import br.com.wassistemas.tasko.usuario.domain.usuario.empresa.AdicionarUsuarioEmpresa;
import br.com.wassistemas.tasko.usuario.domain.usuario.empresa.AtualizarUsuarioEmpresa;
import br.com.wassistemas.tasko.usuario.domain.usuario.empresa.UsuarioEmpresa;

public interface UsuarioEmpresaUseCases extends GenericUseCase<UsuarioEmpresa, AdicionarUsuarioEmpresa,
        AtualizarUsuarioEmpresa> {
}
