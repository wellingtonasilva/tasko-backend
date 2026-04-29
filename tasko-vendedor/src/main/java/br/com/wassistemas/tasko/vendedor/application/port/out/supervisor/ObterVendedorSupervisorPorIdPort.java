package br.com.wassistemas.tasko.vendedor.application.port.out.supervisor;

import br.com.wassistemas.tasko.common.domain.vendedor.VendedorSupervisor;

public interface ObterVendedorSupervisorPorIdPort {

  VendedorSupervisor obterVendedorSupervisorPorId(Long empresaId, Long id);
}
