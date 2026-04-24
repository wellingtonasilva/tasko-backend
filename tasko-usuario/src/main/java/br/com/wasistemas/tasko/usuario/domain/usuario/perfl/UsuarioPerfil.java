package br.com.wasistemas.tasko.usuario.domain.usuario.perfl;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import br.com.wasistemas.tasko.common.enumerations.PerfilTipo;
import br.com.wasistemas.tasko.usuario.domain.perfil.UsuarioPerfilTipo;
import br.com.wasistemas.tasko.usuario.domain.usuario.Usuario;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioPerfil {
    private Long id;
    private PerfilTipo perfilTipo;
    private Usuario usuario;
    private Auditoria auditoria;
}