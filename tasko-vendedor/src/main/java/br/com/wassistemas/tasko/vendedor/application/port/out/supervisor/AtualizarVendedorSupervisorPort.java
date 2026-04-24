package br.com.wassistemas.tasko.vendedor.application.port.out.supervisor;

import br.com.wassistemas.tasko.vendedor.domain.supervisor.AtualizarVendedorSupervisor;
import br.com.wassistemas.tasko.vendedor.domain.supervisor.VendedorSupervisor;

public interface AtualizarVendedorSupervisorPort {
    VendedorSupervisor atualizarVendedorSupervisor(Long id, AtualizarVendedorSupervisor atualizarVendedorSupervisor);
}
