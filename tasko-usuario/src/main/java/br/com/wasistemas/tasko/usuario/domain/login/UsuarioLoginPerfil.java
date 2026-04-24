package br.com.wasistemas.tasko.usuario.domain.login;

import br.com.wasistemas.tasko.common.enumerations.PerfilTipo;
import lombok.Data;

@Data
public class UsuarioLoginPerfil {
    private Long id;
    private PerfilTipo perfilTipo;
}