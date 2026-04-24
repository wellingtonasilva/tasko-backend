package br.com.wassistemas.tasko.vendedor.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.GenericUseCase;
import br.com.wassistemas.tasko.vendedor.domain.supervisor.AdicionarVendedorSupervisor;
import br.com.wassistemas.tasko.vendedor.domain.supervisor.AtualizarVendedorSupervisor;
import br.com.wassistemas.tasko.vendedor.domain.supervisor.VendedorSupervisor;

public interface VendedorSupervisorUseCase extends GenericUseCase<VendedorSupervisor, AdicionarVendedorSupervisor,
        AtualizarVendedorSupervisor> {
}
