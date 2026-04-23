package br.com.wasistemas.tasko.usuario.adapter.in.web.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdicionarUsuarioPerfilRequest
{
    private Long perfilTipoId;
    private Long usuarioId;
}