package br.com.wasistemas.tasko.vendedor.application.port.out.supervisor;

import br.com.wasistemas.tasko.vendedor.domain.supervisor.VendedorSupervisor;

public interface ObterVendedorSupervisorPorIdPort {
    VendedorSupervisor obterVendedorSupervisorPorId(Long id);
}
