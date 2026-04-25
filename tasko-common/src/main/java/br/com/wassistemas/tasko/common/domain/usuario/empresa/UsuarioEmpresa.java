package br.com.wassistemas.tasko.common.domain.usuario.empresa;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.common.domain.empresa.Empresa;
import br.com.wassistemas.tasko.common.domain.usuario.Usuario;
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
