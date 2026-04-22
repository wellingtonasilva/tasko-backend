package br.com.wasistemas.tasko.usuario.application.port.out.perfil;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.usuario.domain.perfil.UsuarioPerfilTipo;

import java.util.List;

public interface ListarUsuarioPerfilTipoPort {
    List<UsuarioPerfilTipo> listarUsuarioPerfilTipo(Paginacao paginacao);
}
