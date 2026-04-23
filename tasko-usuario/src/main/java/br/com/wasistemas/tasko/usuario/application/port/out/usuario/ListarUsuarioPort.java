package br.com.wasistemas.tasko.usuario.application.port.out.usuario;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.usuario.domain.usuario.Usuario;

import java.util.List;

public interface ListarUsuarioPort {
    List<Usuario> listarUsuario(Paginacao paginacao);
}
