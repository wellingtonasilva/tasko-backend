package br.com.wasistemas.tasko.usuario.domain.usuario.empresa;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import br.com.wasistemas.tasko.empresa.domain.empresa.Empresa;
import br.com.wasistemas.tasko.usuario.domain.usuario.Usuario;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioEmpresa {
    private Long id;
    private Usuario usuario;
    private Empresa empresa;
    private Auditoria auditoria;
}
