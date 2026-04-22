package br.com.wasistemas.tasko.usuario.application.port.out.usuario.empresa;

import br.com.wasistemas.tasko.usuario.domain.usuario.empresa.AtualizarUsuarioEmpresa;
import br.com.wasistemas.tasko.usuario.domain.usuario.empresa.UsuarioEmpresa;

public interface AtualizarUsuarioEmpresaPort {
    UsuarioEmpresa atualizarUsuarioEmpresa(AtualizarUsuarioEmpresa atualizarUsuarioEmpresa);
}
