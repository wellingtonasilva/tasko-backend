package br.com.wassistemas.tasko.common.domain.usuario.perfil;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioPerfilTipo {
    private Long id;
    private String descricaoPerfilTipo;
    private Auditoria auditoria;
}