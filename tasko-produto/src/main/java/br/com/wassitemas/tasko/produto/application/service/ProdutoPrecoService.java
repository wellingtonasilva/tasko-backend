package br.com.wassitemas.tasko.produto.application.service;

import br.com.wassitemas.tasko.produto.application.port.in.usecases.ProdutoPrecoUseCases;
import br.com.wassitemas.tasko.produto.application.port.out.produtopreco.AdicionarProdutoPrecoPort;
import br.com.wassitemas.tasko.produto.application.port.out.produtopreco.AtualizarProdutoPrecoPort;
import br.com.wassitemas.tasko.produto.application.port.out.produtopreco.ExcluirProdutoPrecoPorIdPort;
import br.com.wassitemas.tasko.produto.application.port.out.produtopreco.ListarProdutoPrecoPort;
import br.com.wassitemas.tasko.produto.application.port.out.produtopreco.ObterProdutoPrecoPorIdPort;
import br.com.wassitemas.tasko.produto.domain.produtopreco.AdicionarProdutoPreco;
import br.com.wassitemas.tasko.produto.domain.produtopreco.AtualizarProdutoPreco;
import br.com.wassitemas.tasko.produto.domain.produtopreco.ProdutoPreco;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProdutoPrecoService implements ProdutoPrecoUseCases {

    private final AdicionarProdutoPrecoPort adicionarProdutoPrecoPort;
    private final AtualizarProdutoPrecoPort atualizarProdutoPrecoPort;
    private final ExcluirProdutoPrecoPorIdPort excluirProdutoPrecoPorIdPort;
    private final ListarProdutoPrecoPort listarProdutoPrecoPort;
    private final ObterProdutoPrecoPorIdPort obterProdutoPrecoPorIdPort;

    @Override
    public ProdutoPreco adicionar(AdicionarProdutoPreco adicionar) {
        return adicionarProdutoPrecoPort.adicionarProdutoPreco(adicionar);
    }

    @Override
    public List<ProdutoPreco> listar(Paginacao paginacao) {
        return listarProdutoPrecoPort.listarProdutoPreco(paginacao);
    }

    @Override
    public ProdutoPreco obterPorId(Long id) {
        return obterProdutoPrecoPorIdPort.obterProdutoPrecoPorId(id);
    }

    @Override
    public ProdutoPreco atualizar(Long id, AtualizarProdutoPreco atualizar) {
        return atualizarProdutoPrecoPort.atualizarProdutoPreco(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirProdutoPrecoPorIdPort.excluirProdutoPrecoPorId(id);
    }
}
