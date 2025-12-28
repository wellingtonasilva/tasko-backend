package br.com.wasistemas.vendedor.adapter.in.web.request;

import br.com.wasistemas.vendedor.domain.Auditoria;
import lombok.Value;

@Value
public class AtualizarVendedorSupervisorRequest {
    private Long id;
    private String nomeSupervisor;
    private Auditoria auditoria;
}