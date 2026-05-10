package br.com.wassistemas.tasko.vendedor.application.service;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.vendedor.application.port.in.usecases.VendedorTerritorioUseCases;
import br.com.wassistemas.tasko.vendedor.application.port.out.territorio.AdicionarVendedorTerritorioPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.territorio.AtualizarVendedorTerritorioPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.territorio.ExcluirVendedorTerritorioPorIdPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.territorio.ListarVendedorTerritorioPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.territorio.ObterVendedorTerritorioPorIdPort;
import br.com.wassistemas.tasko.vendedor.domain.territorio.AdicionarVendedorTerritorio;
import br.com.wassistemas.tasko.vendedor.domain.territorio.AtualizarVendedorTerritorio;
import br.com.wassistemas.tasko.common.domain.vendedor.VendedorTerritorio;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class VendedorTerritorioService implements VendedorTerritorioUseCases {

    private final AdicionarVendedorTerritorioPort adicionarVendedorTerritorioPort;
    private final AtualizarVendedorTerritorioPort atualizarVendedorTerritorioPort;
    private final ExcluirVendedorTerritorioPorIdPort excluirVendedorTerritorioPorIdPort;
    private final ListarVendedorTerritorioPort listarVendedorTerritorioPort;
    private final ObterVendedorTerritorioPorIdPort obterVendedorTerritorioPorIdPort;

    @Override
    public VendedorTerritorio adicionar(Long empresaId, AdicionarVendedorTerritorio adicionar) {
        return adicionarVendedorTerritorioPort.adicionarVendedorTerritorio(adicionar);
    }

    @Override
    public List<VendedorTerritorio> listar(Long empresaId, Paginacao paginacao) {
        return listarVendedorTerritorioPort.listarVendedorTerritorio(empresaId, paginacao);
    }

    @Override
    public VendedorTerritorio obterPorId(Long empresaId, Long id) {
        return obterVendedorTerritorioPorIdPort.obterVendedorTerritorioPorId(id);
    }

    @Override
    public VendedorTerritorio atualizar(Long empresaId, Long id, AtualizarVendedorTerritorio atualizar) {
        return atualizarVendedorTerritorioPort.atualizarVendedorTerritorio(id, atualizar);
    }

    @Override
    public void excluirPorId(Long empresaId, Long id) {
        excluirVendedorTerritorioPorIdPort.excluirVendedorTerritorioPorId(id);
    }
}
