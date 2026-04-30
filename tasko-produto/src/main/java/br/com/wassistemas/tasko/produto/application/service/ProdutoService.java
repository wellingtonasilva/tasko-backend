package br.com.wassistemas.tasko.produto.application.service;

import br.com.wassistemas.tasko.produto.application.port.in.usecases.ProdutoUseCases;
import br.com.wassistemas.tasko.produto.application.port.out.produto.AdicionarProdutoPort;
import br.com.wassistemas.tasko.produto.application.port.out.produto.AtualizarProdutoPort;
import br.com.wassistemas.tasko.produto.application.port.out.produto.ExcluirProdutoPorIdPort;
import br.com.wassistemas.tasko.produto.application.port.out.produto.ListarProdutoPort;
import br.com.wassistemas.tasko.produto.application.port.out.produto.ObterProdutoPorIdPort;
import br.com.wassistemas.tasko.produto.domain.produto.AdicionarProduto;
import br.com.wassistemas.tasko.produto.domain.produto.AtualizarProduto;
import br.com.wassistemas.tasko.produto.domain.produto.Produto;
import br.com.wassistemas.tasko.common.domain.Paginacao;
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
    public Produto adicionar(Long empresaId, AdicionarProduto adicionar) {
        return adicionarProdutoPort.adicionarProduto(adicionar);
    }

    @Override
    public List<Produto> listar(Long empresaId, Paginacao paginacao) {
        return listarProdutoPort.listarProduto(empresaId, paginacao);
    }

    @Override
    public Produto obterPorId(Long empresaId, Long id) {
        return obterProdutoPorIdPort.obterProdutoPorId(id);
    }

    @Override
    public Produto atualizar(Long empresaId, Long id, AtualizarProduto atualizar) {
        return atualizarProdutoPort.atualizarProduto(id, atualizar);
    }

    @Override
    public void excluirPorId(Long empresaId, Long id) {
        excluirProdutoPorIdPort.excluirProdutoPorId(id);
    }
}
