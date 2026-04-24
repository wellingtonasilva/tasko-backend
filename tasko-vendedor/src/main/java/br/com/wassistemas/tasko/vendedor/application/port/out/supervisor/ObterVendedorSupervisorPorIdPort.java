package br.com.wassistemas.tasko.vendedor.application.port.out.supervisor;

import br.com.wassistemas.tasko.vendedor.domain.supervisor.VendedorSupervisor;

public interface ObterVendedorSupervisorPorIdPort {
    VendedorSupervisor obterVendedorSupervisorPorId(Long id);
}
