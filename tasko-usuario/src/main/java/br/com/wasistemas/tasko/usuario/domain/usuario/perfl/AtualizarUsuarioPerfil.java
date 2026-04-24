package br.com.wasistemas.tasko.usuario.domain.usuario.perfl;

import br.com.wasistemas.tasko.common.enumerations.PerfilTipo;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AtualizarUsuarioPerfil {
    private Long id;
    private PerfilTipo perfilTipo;
    private Long usuarioId;
}