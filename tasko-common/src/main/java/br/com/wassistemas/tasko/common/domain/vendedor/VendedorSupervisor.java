package br.com.wassistemas.tasko.common.domain.vendedor;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VendedorSupervisor {
    private Long id;
    private String nomeSupervisor;
    private Auditoria auditoria;
}