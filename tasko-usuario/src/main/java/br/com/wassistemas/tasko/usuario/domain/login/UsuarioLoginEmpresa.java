package br.com.wassistemas.tasko.usuario.domain.login;

import br.com.wassistemas.tasko.empresa.domain.empresa.Empresa;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioLoginEmpresa {
    private Long id;
    private Empresa empresa;
}
