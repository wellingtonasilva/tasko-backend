package br.com.wassistemas.tasko.usuario.application.port.out.usuario.empresa;

import br.com.wassistemas.tasko.common.domain.usuario.AdicionarUsuarioEmpresa;
import br.com.wassistemas.tasko.common.domain.usuario.empresa.UsuarioEmpresa;

public interface AdicionarUsuarioEmpresaPort {
    UsuarioEmpresa  adicionarUsuarioEmpresa(AdicionarUsuarioEmpresa adicionarUsuarioEmpresa);
}
