package br.com.wassistemas.tasko.usuario.adapter.in.web.response;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.empresa.domain.empresa.Empresa;
import br.com.wassistemas.tasko.usuario.domain.usuario.Usuario;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioEmpresaResponse {
    private Long id;
    private Usuario usuario;
    private Empresa empresa;
    private Auditoria auditoria;
}
