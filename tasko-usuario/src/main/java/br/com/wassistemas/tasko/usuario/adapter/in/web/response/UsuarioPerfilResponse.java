package br.com.wassistemas.tasko.usuario.adapter.in.web.response;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.common.enumerations.PerfilTipo;
import br.com.wassistemas.tasko.common.domain.usuario.Usuario;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsuarioPerfilResponse {
    private Long id;
    private PerfilTipo perfilTipo;
    private Usuario usuario;
    private Auditoria auditoria;
}