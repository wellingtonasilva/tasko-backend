package br.com.wassistemas.tasko.usuario.application.port.out.usuario.empresa;

import br.com.wassistemas.tasko.common.domain.usuario.empresa.UsuarioEmpresa;
import java.util.List;

public interface ObterUsuarioEmpresaUsuarioIdPort {
    List<UsuarioEmpresa> obterUsuarioEmpresaUsuarioId(Long usuarioId);
}
