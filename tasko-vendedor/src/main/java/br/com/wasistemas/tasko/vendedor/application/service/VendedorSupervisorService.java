package br.com.wasistemas.tasko.vendedor.application.service;

import br.com.wasistemas.tasko.vendedor.application.port.in.usecases.VendedorSupervisorUseCase;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.vendedor.application.port.out.supervisor.*;
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
    private final AdicionarVendedorSupervisorPort adicionarVendedorSupervisorPort;
    private final AtualizarVendedorSupervisorPort atualizarVendedorSupervisorPort;
    private final ExcluirVendedorSupervisorPorIdPort excluirVendedorSupervisorPorIdPort;
    private final ObterVendedorSupervisorPorIdPort obterVendedorSupervisorPorIdPort;
    private final ListarVendedorSupervisorPort listarVendedorSupervisorPort;

    @Override
    public VendedorSupervisor adicionar(AdicionarVendedorSupervisor adicionar) {
        return adicionarVendedorSupervisorPort.adicionarVendedorSupervisor(adicionar);
    }

    @Override
    public List<VendedorSupervisor> listar(Paginacao paginacao) {
        return listarVendedorSupervisorPort.listarVendedorSupervisor(paginacao);
    }

    @Override
    public VendedorSupervisor obterPorId(Long id) {
        return obterVendedorSupervisorPorIdPort.obterVendedorSupervisorPorId(id);
    }

    @Override
    public VendedorSupervisor atualizar(Long id, AtualizarVendedorSupervisor atualizar) {
        return atualizarVendedorSupervisorPort.atualizarVendedorSupervisor(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirVendedorSupervisorPorIdPort.excluirVendedorSupervisorPorId(id);
    }
}
