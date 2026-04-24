package br.com.wassistemas.tasko.usuario.domain.login;

import br.com.wassistemas.tasko.common.enumerations.PerfilTipo;
import lombok.Data;

@Data
public class UsuarioLoginPerfil {
    private Long id;
    private PerfilTipo perfilTipo;
}