package br.com.wasistemas.tasko.vendedor.adapter.in.web.request;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import lombok.Value;

@Value
public class AtualizarVendedorSupervisorRequest {
    private Long id;
    private String nomeSupervisor;
    private Auditoria auditoria;
}