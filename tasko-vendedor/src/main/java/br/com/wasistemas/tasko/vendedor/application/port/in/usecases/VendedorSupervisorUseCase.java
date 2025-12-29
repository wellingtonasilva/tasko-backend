package br.com.wasistemas.tasko.vendedor.application.port.in.usecases;

import br.com.wasistemas.tasko.common.usecases.GenericUseCase;
import br.com.wasistemas.tasko.vendedor.domain.supervisor.AdicionarVendedorSupervisor;
import br.com.wasistemas.tasko.vendedor.domain.supervisor.AtualizarVendedorSupervisor;
import br.com.wasistemas.tasko.vendedor.domain.supervisor.VendedorSupervisor;

public interface VendedorSupervisorUseCase extends GenericUseCase<VendedorSupervisor, AdicionarVendedorSupervisor,
        AtualizarVendedorSupervisor> {
}
