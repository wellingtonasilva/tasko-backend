package br.com.wasistemas.tasko.usuario.adapter.in.web.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AtualizarUsuarioPerfilRequest {
    private Long id;
    private Long perfilTipoId;
    private Long usuarioId;
}