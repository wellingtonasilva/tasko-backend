package br.com.wasistemas.tasko.vendedor.application.service;

import br.com.wasistemas.tasko.vendedor.application.port.in.usecases.VendedorSupervisorUseCase;
import br.com.wasistemas.tasko.vendedor.domain.Paginacao;
import br.com.wasistemas.tasko.vendedor.domain.supervisor.AdicionarVendedorSupervisor;
import br.com.wasistemas.tasko.vendedor.domain.supervisor.AtualizarVendedorSupervisor;
import br.com.wasistemas.tasko.vendedor.domain.supervisor.VendedorSupervisor;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class VendedorSupervisorService implements VendedorSupervisorUseCase {
    @Override
    public VendedorSupervisor adicionarVendedorSupervisor(AdicionarVendedorSupervisor adicionarVendedorSupervisor) {
        return null;
    }

    @Override
    public List<VendedorSupervisor> listarVendedorSupervisor(Paginacao paginacao) {
        return List.of();
    }

    @Override
    public VendedorSupervisor obterVendedorSupervisorPorId(Long id) {
        return null;
    }

    @Override
    public VendedorSupervisor atualizarVendedorSupervisor(Long id, AtualizarVendedorSupervisor atualizarVendedorSupervisor) {
        return null;
    }

    @Override
    public void excluirVendedorSupervisorById(Long id) {

    }
}
