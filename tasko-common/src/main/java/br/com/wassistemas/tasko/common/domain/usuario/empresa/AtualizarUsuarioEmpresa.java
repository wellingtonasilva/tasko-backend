package br.com.wassistemas.tasko.common.domain.usuario.empresa;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AtualizarUsuarioEmpresa {
    private Long id;
    private Long usuarioId;
    private Long empresaId;
}
