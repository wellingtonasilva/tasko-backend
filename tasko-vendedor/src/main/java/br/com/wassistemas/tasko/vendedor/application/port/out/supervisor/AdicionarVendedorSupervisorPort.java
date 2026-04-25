package br.com.wassistemas.tasko.vendedor.application.port.out.supervisor;

import br.com.wassistemas.tasko.vendedor.domain.supervisor.AdicionarVendedorSupervisor;
import br.com.wassistemas.tasko.common.domain.vendedor.VendedorSupervisor;

public interface AdicionarVendedorSupervisorPort {
    VendedorSupervisor adicionarVendedorSupervisor(AdicionarVendedorSupervisor adicionarVendedorSupervisor);
}
