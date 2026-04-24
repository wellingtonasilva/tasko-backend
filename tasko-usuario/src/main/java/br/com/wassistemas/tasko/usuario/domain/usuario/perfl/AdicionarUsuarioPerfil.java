package br.com.wassistemas.tasko.usuario.domain.usuario.perfl;

import br.com.wassistemas.tasko.common.enumerations.PerfilTipo;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdicionarUsuarioPerfil
{
    private PerfilTipo perfilTipo;
    private Long usuarioId;
}