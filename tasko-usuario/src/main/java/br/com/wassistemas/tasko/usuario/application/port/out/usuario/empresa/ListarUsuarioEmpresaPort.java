package br.com.wassistemas.tasko.usuario.application.port.out.usuario.empresa;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.usuario.domain.usuario.empresa.UsuarioEmpresa;
import java.util.List;

public interface ListarUsuarioEmpresaPort {
    List<UsuarioEmpresa> listarUsuarioEmpresa(Paginacao paginacao);
}
