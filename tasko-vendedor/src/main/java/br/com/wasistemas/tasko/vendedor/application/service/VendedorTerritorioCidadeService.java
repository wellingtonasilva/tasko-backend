package br.com.wasistemas.tasko.vendedor.application.service;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.vendedor.application.port.in.usecases.VendedorTerritorioCidadeUseCases;
import br.com.wasistemas.tasko.vendedor.application.port.out.territorio.cidade.*;
import br.com.wasistemas.tasko.vendedor.domain.territorio.cidade.AdicionarVendedorTerritorioCidade;
import br.com.wasistemas.tasko.vendedor.domain.territorio.cidade.AtualizarVendedorTerritorioCidade;
import br.com.wasistemas.tasko.vendedor.domain.territorio.cidade.VendedorTerritorioCidade;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class VendedorTerritorioCidadeService implements VendedorTerritorioCidadeUseCases {
    private final AdicionarVendedorTerritorioCidadePort adicionarVendedorTerritorioCidadePort;
    private final AtualizarVendedorTerritorioCidadePort atualizarVendedorTerritorioCidadePort;
    private final ExcluirVendedorTerritorioCidadePorIdPort excluirVendedorTerritorioCidadePorIdPort;
    private final ListarVendedorTerritorioCidadePort listarVendedorTerritorioCidadePort;
    private final ObterVendedorTerritorioCidadePorIdPort obterVendedorTerritorioCidadePorIdPort;

    @Override
    public VendedorTerritorioCidade adicionar(AdicionarVendedorTerritorioCidade adicionar) {
        return adicionarVendedorTerritorioCidadePort.adicionarVendedorTerritorioCidade(adicionar);
    }

    @Override
    public List<VendedorTerritorioCidade> listar(Paginacao paginacao) {
        return listarVendedorTerritorioCidadePort.listarVendedorTerritorioCidade(paginacao);
    }

    @Override
    public VendedorTerritorioCidade obterPorId(Long id) {
        return obterVendedorTerritorioCidadePorIdPort.obterVendedorTerritorioCidadePorId(id);
    }

    @Override
    public VendedorTerritorioCidade atualizar(Long id, AtualizarVendedorTerritorioCidade atualizar) {
        return atualizarVendedorTerritorioCidadePort.AtualizarVendedorTerritorioCidade(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirVendedorTerritorioCidadePorIdPort.excluirVendedorTerritorioCidadePorId(id);
    }
}
