package br.com.wasistemas.tasko.usuario.application.port.in.usecases;

import br.com.wasistemas.tasko.common.usecases.GenericUseCase;
import br.com.wasistemas.tasko.usuario.domain.usuario.empresa.AdicionarUsuarioEmpresa;
import br.com.wasistemas.tasko.usuario.domain.usuario.empresa.AtualizarUsuarioEmpresa;
import br.com.wasistemas.tasko.usuario.domain.usuario.empresa.UsuarioEmpresa;

public interface UsuarioEmpresaUseCases extends GenericUseCase<UsuarioEmpresa, AdicionarUsuarioEmpresa,
        AtualizarUsuarioEmpresa> {
}
