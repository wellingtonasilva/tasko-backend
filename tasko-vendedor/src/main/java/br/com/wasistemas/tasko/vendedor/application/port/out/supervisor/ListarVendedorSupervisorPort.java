package br.com.wasistemas.tasko.vendedor.application.port.out.supervisor;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.vendedor.domain.supervisor.VendedorSupervisor;
import java.util.List;

public interface ListarVendedorSupervisorPort {
    List<VendedorSupervisor> listarVendedorSupervisor(Paginacao paginacao);
}
