package br.com.wassistemas.tasko.usuario.application.port.out.usuario.perfil;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.domain.usuario.perfil.UsuarioPerfil;
import java.util.List;

public interface ListarUsuarioPerfilPort {
    List<UsuarioPerfil> listarUsuarioPerfil(Paginacao paginacao);
}
