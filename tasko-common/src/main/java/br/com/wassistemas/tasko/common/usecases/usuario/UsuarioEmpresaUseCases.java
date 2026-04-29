package br.com.wassistemas.tasko.common.usecases.usuario;

import br.com.wassistemas.tasko.common.domain.usuario.empresa.AtualizarUsuarioEmpresa;
import br.com.wassistemas.tasko.common.domain.usuario.empresa.UsuarioEmpresa;
import br.com.wassistemas.tasko.common.domain.usuario.empresa.AdicionarUsuarioEmpresa;
import br.com.wassistemas.tasko.common.usecases.TenantUseCase;

public interface UsuarioEmpresaUseCases extends TenantUseCase<UsuarioEmpresa, AdicionarUsuarioEmpresa,
        AtualizarUsuarioEmpresa> {
}
