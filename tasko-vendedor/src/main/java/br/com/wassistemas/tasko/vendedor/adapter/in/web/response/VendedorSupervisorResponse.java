package br.com.wassistemas.tasko.vendedor.adapter.in.web.response;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class VendedorSupervisorResponse {
    private Long id;
    private String nomeSupervisor;
    private Auditoria auditoria;
}