package br.com.wasistemas.tasko.vendedor.application.service;

import br.com.wasistemas.tasko.vendedor.application.port.in.usecases.VendedorUseCases;
import br.com.wasistemas.tasko.vendedor.application.port.out.vendedor.*;
import br.com.wasistemas.tasko.vendedor.domain.Paginacao;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.AdicionarVendedor;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.AtualizarVendedor;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.Vendedor;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class VendedorService implements VendedorUseCases {

    private final AdicionarVendedorPort adicionarVendedorPort;
    private final AtualizarVendedorPort atualizarVendedorPort;
    private final ExcluirVendedorPorIdPort excluirVendedorPorIdPort;
    private final ListarVendedorPort listarVendedorPort;
    private final ObterVendedorPorIdPort obterVendedorPorIdPort;

    @Override
    public Vendedor adicionarVendedor(AdicionarVendedor adicionarVendedor) {
        return adicionarVendedorPort.adicionarVendedor(adicionarVendedor);
    }

    @Override
    public List<Vendedor> listarVendedor(Paginacao paginacao) {
        return  listarVendedorPort.listarVendedor(paginacao);
    }

    @Override
    public Vendedor obterPorId(Long id) {
        return obterVendedorPorIdPort.obterPorId(id);
    }

    @Override
    public Vendedor atualizar(Long id, AtualizarVendedor atualizarVendedor) {
        return atualizarVendedorPort.atualizar(id, atualizarVendedor);
    }

    @Override
    public void excluirById(Long id) {
        excluirVendedorPorIdPort.excluirById(id);
    }
}
