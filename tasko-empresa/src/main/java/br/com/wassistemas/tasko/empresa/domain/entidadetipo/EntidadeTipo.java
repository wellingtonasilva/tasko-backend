package br.com.wassistemas.tasko.empresa.domain.entidadetipo;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class EntidadeTipo {
    private Long id;
    private String descricaoEntidadeTipo;
    private Auditoria auditoria;
}
