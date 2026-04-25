package br.com.wassistemas.tasko.common.domain.usuario;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdicionarUsuarioEmpresa {
    private Long usuarioId;
    private Long empresaId;
}
