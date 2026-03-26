package br.com.wasistemas.tasko.produto.application.service;

import br.com.wasistemas.tasko.produto.application.port.in.usecases.ProdutoUnidadeMedidaUseCases;
import br.com.wasistemas.tasko.produto.application.port.out.unidademedida.*;
import br.com.wasistemas.tasko.produto.domain.unidademedida.AdicionarProdutoUnidadeMedida;
import br.com.wasistemas.tasko.produto.domain.unidademedida.AtualizarProdutoUnidadeMedida;
import br.com.wasistemas.tasko.produto.domain.unidademedida.ProdutoUnidadeMedida;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProdutoUnidadeMedidaService implements ProdutoUnidadeMedidaUseCases {

    private final AdicionarProdutoUnidadeMedidaPort adicionarProdutoUnidadeMedidaPort;
    private final AtualizarProdutoUnidadeMedidaPort atualizarProdutoUnidadeMedidaPort;
    private final ExcluirProdutoUnidadeMedidaPorIdPort excluirProdutoUnidadeMedidaPorIdPort;
    private final ListarProdutoUnidadeMedidaPort listarProdutoUnidadeMedidaPort;
    private final ObterProdutoUnidadeMedidaPorIdPort obterProdutoUnidadeMedidaPorIdPort;

    @Override
    public ProdutoUnidadeMedida adicionar(AdicionarProdutoUnidadeMedida adicionar) {
        return adicionarProdutoUnidadeMedidaPort.adicionarProdutoUnidadeMedida(adicionar);
    }

    @Override
    public List<ProdutoUnidadeMedida> listar(Paginacao paginacao) {
        return listarProdutoUnidadeMedidaPort.listarProdutoUnidadeMedida(paginacao);
    }

    @Override
    public ProdutoUnidadeMedida obterPorId(Long id) {
        return obterProdutoUnidadeMedidaPorIdPort.obterProdutoUnidadeMedidaPorId(id);
    }

    @Override
    public ProdutoUnidadeMedida atualizar(Long id, AtualizarProdutoUnidadeMedida atualizar) {
        return atualizarProdutoUnidadeMedidaPort.atualizarProdutoUnidadeMedida(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirProdutoUnidadeMedidaPorIdPort.excluirProdutoUnidadeMedidaPorId(id);
    }
}
