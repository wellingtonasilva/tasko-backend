package br.com.wasistemas.tasko.usuario.application.port.out.usuario.empresa;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.usuario.domain.usuario.empresa.UsuarioEmpresa;
import java.util.List;

public interface ListarUsuarioEmpresaPort {
    List<UsuarioEmpresa> listarUsuarioEmpresa(Paginacao paginacao);
}
