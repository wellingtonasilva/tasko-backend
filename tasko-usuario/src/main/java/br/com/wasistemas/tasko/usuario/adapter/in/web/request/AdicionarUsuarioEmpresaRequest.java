package br.com.wasistemas.tasko.usuario.adapter.in.web.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdicionarUsuarioEmpresaRequest {
    private Long usuarioId;
    private Long empresaId;
}
