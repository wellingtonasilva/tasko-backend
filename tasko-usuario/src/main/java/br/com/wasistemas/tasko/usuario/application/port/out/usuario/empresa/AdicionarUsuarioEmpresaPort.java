package br.com.wasistemas.tasko.usuario.application.port.out.usuario.empresa;

import br.com.wasistemas.tasko.usuario.domain.usuario.empresa.AdicionarUsuarioEmpresa;
import br.com.wasistemas.tasko.usuario.domain.usuario.empresa.UsuarioEmpresa;

public interface AdicionarUsuarioEmpresaPort {
    UsuarioEmpresa  adicionarUsuarioEmpresa(AdicionarUsuarioEmpresa adicionarUsuarioEmpresa);
}
