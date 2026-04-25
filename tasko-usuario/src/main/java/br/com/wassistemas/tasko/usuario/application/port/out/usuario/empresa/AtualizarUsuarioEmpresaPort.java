package br.com.wassistemas.tasko.usuario.application.port.out.usuario.empresa;

import br.com.wassistemas.tasko.common.domain.usuario.empresa.AtualizarUsuarioEmpresa;
import br.com.wassistemas.tasko.common.domain.usuario.empresa.UsuarioEmpresa;

public interface AtualizarUsuarioEmpresaPort {
    UsuarioEmpresa atualizarUsuarioEmpresa(Long id, AtualizarUsuarioEmpresa atualizarUsuarioEmpresa);
}
