package br.com.wassistemas.tasko.usuario.adapter.in.web.response;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioPerfilTipoResponse {
    private Long id;
    private String descricaoPerfilTipo;
}