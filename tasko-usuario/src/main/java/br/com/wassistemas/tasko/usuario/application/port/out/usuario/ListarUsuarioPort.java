package br.com.wassistemas.tasko.usuario.application.port.out.usuario;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.domain.usuario.Usuario;

import java.util.List;

public interface ListarUsuarioPort {
    List<Usuario> listarUsuario(Paginacao paginacao);
}
