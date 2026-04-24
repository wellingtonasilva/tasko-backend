package br.com.wassistemas.tasko.usuario.adapter.in.web.request;

import br.com.wassistemas.tasko.common.enumerations.PerfilTipo;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AtualizarUsuarioPerfilRequest {
    private Long id;
    private PerfilTipo perfilTipo;
    private Long usuarioId;
}