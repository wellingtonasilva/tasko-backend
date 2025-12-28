package br.com.wasistemas.vendedor.application.port.in.usecases;

import br.com.wasistemas.vendedor.domain.vendedor.AdicionarVendedor;
import br.com.wasistemas.vendedor.domain.Paginacao;
import br.com.wasistemas.vendedor.domain.vendedor.AtualizarVendedor;
import br.com.wasistemas.vendedor.domain.vendedor.Vendedor;

import java.util.List;

public interface VendedorUseCases {
    Vendedor adicionarVendedor(AdicionarVendedor adicionarVendedor);
    List<Vendedor> listarVendedor(Paginacao paginacao);
    Vendedor obterPorId(Long id);
    Vendedor atualizar(Long id, AtualizarVendedor atualizarVendedor);
    void excluirById(Long id);
}
