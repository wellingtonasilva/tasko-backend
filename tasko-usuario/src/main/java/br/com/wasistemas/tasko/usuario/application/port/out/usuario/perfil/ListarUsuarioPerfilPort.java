package br.com.wasistemas.tasko.usuario.application.port.out.usuario.perfil;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.usuario.domain.usuario.perfl.UsuarioPerfil;
import java.util.List;

public interface ListarUsuarioPerfilPort {
    List<UsuarioPerfil> listarUsuarioPerfil(Paginacao paginacao);
}
