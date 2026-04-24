package br.com.wassistemas.tasko.vendedor.domain.supervisor;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AtualizarVendedorSupervisor {
    private Long id;
    private String nomeSupervisor;
    private Auditoria auditoria;
}