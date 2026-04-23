package br.com.wasistemas.tasko.usuario.adapter.in.web.response;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import br.com.wasistemas.tasko.usuario.domain.perfil.UsuarioPerfilTipo;
import br.com.wasistemas.tasko.usuario.domain.usuario.Usuario;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioPerfilResponse {
    private Long id;
    private UsuarioPerfilTipo perfilTipo;
    private Usuario usuario;
    private Auditoria auditoria;
}