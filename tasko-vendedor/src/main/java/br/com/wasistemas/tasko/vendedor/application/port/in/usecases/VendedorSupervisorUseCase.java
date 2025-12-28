package br.com.wasistemas.vendedor.application.port.in.usecases;

import br.com.wasistemas.vendedor.domain.Paginacao;
import br.com.wasistemas.vendedor.domain.supervisor.AdicionarVendedorSupervisor;
import br.com.wasistemas.vendedor.domain.supervisor.AtualizarVendedorSupervisor;
import br.com.wasistemas.vendedor.domain.supervisor.VendedorSupervisor;

import java.util.List;

public interface VendedorSupervisorUseCase {
    VendedorSupervisor adicionarVendedorSupervisor(AdicionarVendedorSupervisor adicionarVendedorSupervisor);
    List<VendedorSupervisor> listarVendedorSupervisor(Paginacao paginacao);
    VendedorSupervisor obterVendedorSupervisorPorId(Long id);
    VendedorSupervisor atualizarVendedorSupervisor(Long id, AtualizarVendedorSupervisor atualizarVendedorSupervisor);
    void excluirVendedorSupervisorById(Long id);
}
