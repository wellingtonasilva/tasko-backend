package br.com.wassistemas.tasko.vendedor.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.TenantUseCase;
import br.com.wassistemas.tasko.vendedor.domain.supervisor.AdicionarVendedorSupervisor;
import br.com.wassistemas.tasko.vendedor.domain.supervisor.AtualizarVendedorSupervisor;
import br.com.wassistemas.tasko.common.domain.vendedor.VendedorSupervisor;

public interface VendedorSupervisorUseCase extends TenantUseCase<VendedorSupervisor, AdicionarVendedorSupervisor,
        AtualizarVendedorSupervisor> {
}
