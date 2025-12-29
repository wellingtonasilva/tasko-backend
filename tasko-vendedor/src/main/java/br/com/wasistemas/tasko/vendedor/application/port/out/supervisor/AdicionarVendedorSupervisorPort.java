package br.com.wasistemas.tasko.vendedor.application.port.out.supervisor;

import br.com.wasistemas.tasko.vendedor.domain.supervisor.AdicionarVendedorSupervisor;
import br.com.wasistemas.tasko.vendedor.domain.supervisor.VendedorSupervisor;

public interface AdicionarVendedorSupervisorPort {
    VendedorSupervisor adicionarVendedorSupervisor(AdicionarVendedorSupervisor adicionarVendedorSupervisor);
}
