package br.com.wasistemas.tasko.vendedor.application.port.out.supervisor;

import br.com.wasistemas.tasko.vendedor.domain.supervisor.AtualizarVendedorSupervisor;
import br.com.wasistemas.tasko.vendedor.domain.supervisor.VendedorSupervisor;

public interface AtualizarVendedorSupervisorPort {
    VendedorSupervisor atualizarVendedorSupervisor(Long id, AtualizarVendedorSupervisor atualizarVendedorSupervisor);
}
