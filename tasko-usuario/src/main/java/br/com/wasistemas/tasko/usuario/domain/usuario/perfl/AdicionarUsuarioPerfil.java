package br.com.wasistemas.tasko.usuario.domain.usuario.perfl;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdicionarUsuarioPerfil
{
    private Long perfilTipoId;
    private Long usuarioId;
}