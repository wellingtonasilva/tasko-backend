package br.com.wassistemas.tasko.usuario.domain.usuario.empresa;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.empresa.domain.empresa.Empresa;
import br.com.wassistemas.tasko.usuario.domain.usuario.Usuario;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsuarioEmpresa {
    private Long id;
    private Usuario usuario;
    private Empresa empresa;
    private Auditoria auditoria;
}
