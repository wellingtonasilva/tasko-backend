package br.com.wasistemas.tasko.vendedor.domain.supervisor;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VendedorSupervisor {
    private Long id;
    private String nomeSupervisor;
    private Auditoria auditoria;
}