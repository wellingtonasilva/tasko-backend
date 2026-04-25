package br.com.wassistemas.tasko.usuario.adapter.in.web.response;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.common.domain.empresa.Empresa;
import br.com.wassistemas.tasko.common.domain.usuario.Usuario;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsuarioEmpresaResponse {
    private Long id;
    private Usuario usuario;
    private Long empresaId;
    private Auditoria auditoria;
}
