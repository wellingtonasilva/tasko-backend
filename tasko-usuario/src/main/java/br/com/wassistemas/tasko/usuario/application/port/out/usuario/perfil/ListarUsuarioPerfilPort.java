package br.com.wassistemas.tasko.usuario.application.port.out.usuario.perfil;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.usuario.domain.usuario.perfl.UsuarioPerfil;
import java.util.List;

public interface ListarUsuarioPerfilPort {
    List<UsuarioPerfil> listarUsuarioPerfil(Paginacao paginacao);
}
