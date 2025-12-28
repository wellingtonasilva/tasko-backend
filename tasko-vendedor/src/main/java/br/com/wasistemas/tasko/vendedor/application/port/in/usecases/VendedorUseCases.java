package br.com.wasistemas.tasko.vendedor.application.port.in.usecases;

import br.com.wasistemas.tasko.vendedor.domain.Paginacao;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.AdicionarVendedor;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.AtualizarVendedor;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.Vendedor;

import java.util.List;

public interface VendedorUseCases {
    Vendedor adicionarVendedor(AdicionarVendedor adicionarVendedor);
    List<Vendedor> listarVendedor(Paginacao paginacao);
    Vendedor obterPorId(Long id);
    Vendedor atualizar(Long id, AtualizarVendedor atualizarVendedor);
    void excluirById(Long id);
}
