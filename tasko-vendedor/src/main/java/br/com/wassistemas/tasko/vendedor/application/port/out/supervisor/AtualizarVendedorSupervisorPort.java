package br.com.wassistemas.tasko.vendedor.application.port.out.supervisor;

import br.com.wassistemas.tasko.vendedor.domain.supervisor.AtualizarVendedorSupervisor;
import br.com.wassistemas.tasko.common.domain.vendedor.VendedorSupervisor;

public interface AtualizarVendedorSupervisorPort {

  VendedorSupervisor atualizarVendedorSupervisor(Long id,
      AtualizarVendedorSupervisor atualizarVendedorSupervisor);
}
