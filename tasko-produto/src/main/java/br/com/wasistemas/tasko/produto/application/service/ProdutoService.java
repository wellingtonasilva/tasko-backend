package br.com.wasistemas.tasko.produto.application.service;

import br.com.wasistemas.tasko.produto.application.port.in.usecases.ProdutoUseCases;
import br.com.wasistemas.tasko.produto.application.port.out.produto.*;
import br.com.wasistemas.tasko.produto.domain.produto.AdicionarProduto;
import br.com.wasistemas.tasko.produto.domain.produto.AtualizarProduto;
import br.com.wasistemas.tasko.produto.domain.produto.Produto;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProdutoService implements ProdutoUseCases {

    private final AdicionarProdutoPort adicionarProdutoPort;
    private final AtualizarProdutoPort atualizarProdutoPort;
    private final ExcluirProdutoPorIdPort excluirProdutoPorIdPort;
    private final ListarProdutoPort listarProdutoPort;
    private final ObterProdutoPorIdPort obterProdutoPorIdPort;

    @Override
    public Produto adicionar(AdicionarProduto adicionar) {
        return adicionarProdutoPort.adicionarProduto(adicionar);
    }

    @Override
    public List<Produto> listar(Paginacao paginacao) {
        return listarProdutoPort.listarProduto(paginacao);
    }

    @Override
    public Produto obterPorId(Long id) {
        return obterProdutoPorIdPort.obterProdutoPorId(id);
    }

    @Override
    public Produto atualizar(Long id, AtualizarProduto atualizar) {
        return atualizarProdutoPort.atualizarProduto(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirProdutoPorIdPort.excluirProdutoPorId(id);
    }
}
