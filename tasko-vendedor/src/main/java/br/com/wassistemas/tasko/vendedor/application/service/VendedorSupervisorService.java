package br.com.wassistemas.tasko.vendedor.application.service;

import br.com.wassistemas.tasko.vendedor.application.port.in.usecases.VendedorSupervisorUseCase;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.vendedor.application.port.out.supervisor.AdicionarVendedorSupervisorPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.supervisor.AtualizarVendedorSupervisorPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.supervisor.ExcluirVendedorSupervisorPorIdPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.supervisor.ListarVendedorSupervisorPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.supervisor.ObterVendedorSupervisorPorIdPort;
import br.com.wassistemas.tasko.vendedor.domain.supervisor.AdicionarVendedorSupervisor;
import br.com.wassistemas.tasko.vendedor.domain.supervisor.AtualizarVendedorSupervisor;
import br.com.wassistemas.tasko.common.domain.vendedor.VendedorSupervisor;
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
    public VendedorSupervisor adicionar(Long empresaId, AdicionarVendedorSupervisor adicionar) {
        return adicionarVendedorSupervisorPort.adicionarVendedorSupervisor(adicionar);
    }

    @Override
    public List<VendedorSupervisor> listar(Long empresaId, Paginacao paginacao) {
        return listarVendedorSupervisorPort.listarVendedorSupervisor(empresaId, paginacao);
    }

    @Override
    public VendedorSupervisor obterPorId(Long empresaId, Long id) {
        return obterVendedorSupervisorPorIdPort.obterVendedorSupervisorPorId(empresaId, id);
    }

    @Override
    public VendedorSupervisor atualizar(Long empresaId, Long id, AtualizarVendedorSupervisor atualizar) {
        return atualizarVendedorSupervisorPort.atualizarVendedorSupervisor(id, atualizar);
    }

    @Override
    public void excluirPorId(Long empresaId, Long id) {
        excluirVendedorSupervisorPorIdPort.excluirVendedorSupervisorPorId(empresaId, id);
    }
}
