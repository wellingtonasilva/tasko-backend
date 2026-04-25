package br.com.wassistemas.tasko.vendedor.application.port.out.supervisor;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.domain.vendedor.VendedorSupervisor;
import java.util.List;

public interface ListarVendedorSupervisorPort {
    List<VendedorSupervisor> listarVendedorSupervisor(Paginacao paginacao);
}
