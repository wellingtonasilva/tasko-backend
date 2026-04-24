package br.com.wassistemas.tasko.usuario.application.port.out.perfil;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.usuario.domain.perfil.UsuarioPerfilTipo;

import java.util.List;

public interface ListarUsuarioPerfilTipoPort {
    List<UsuarioPerfilTipo> listarUsuarioPerfilTipo(Paginacao paginacao);
}
