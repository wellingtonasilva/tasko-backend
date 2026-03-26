package br.com.wasistemas.tasko.produto.domain.codigobarrastipo;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class CodigoBarrasTipo {
    private Long id;
    private String nomeTipo;
    private Auditoria auditoria;
}
