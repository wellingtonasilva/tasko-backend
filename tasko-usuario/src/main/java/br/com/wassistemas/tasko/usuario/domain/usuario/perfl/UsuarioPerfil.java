package br.com.wassistemas.tasko.usuario.domain.usuario.perfl;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.common.enumerations.PerfilTipo;
import br.com.wassistemas.tasko.usuario.domain.usuario.Usuario;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsuarioPerfil {
    private Long id;
    private PerfilTipo perfilTipo;
    private Usuario usuario;
    private Auditoria auditoria;
}