package br.com.wassitemas.tasko.produto.application.service;

import br.com.wassitemas.tasko.produto.application.port.in.usecases.ProdutoEstoqueLocalizacaoUseCases;
import br.com.wassitemas.tasko.produto.application.port.out.produtoestoque.AdicionarProdutoEstoqueLocalizacaoPort;
import br.com.wassitemas.tasko.produto.application.port.out.produtoestoque.AtualizarProdutoEstoqueLocalizacaoPort;
import br.com.wassitemas.tasko.produto.application.port.out.produtoestoque.ExcluirProdutoEstoqueLocalizacaoPorIdPort;
import br.com.wassitemas.tasko.produto.application.port.out.produtoestoque.ListarProdutoEstoqueLocalizacaoPort;
import br.com.wassitemas.tasko.produto.application.port.out.produtoestoque.ObterProdutoEstoqueLocalizacaoPorIdPort;
import br.com.wassitemas.tasko.produto.domain.produtoestoque.AdicionarProdutoEstoqueLocalizacao;
import br.com.wassitemas.tasko.produto.domain.produtoestoque.AtualizarProdutoEstoqueLocalizacao;
import br.com.wassitemas.tasko.produto.domain.produtoestoque.ProdutoEstoqueLocalizacao;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProdutoEstoqueLocalizacaoService implements ProdutoEstoqueLocalizacaoUseCases {

    private final AdicionarProdutoEstoqueLocalizacaoPort adicionarProdutoEstoqueLocalizacaoPort;
    private final AtualizarProdutoEstoqueLocalizacaoPort atualizarProdutoEstoqueLocalizacaoPort;
    private final ExcluirProdutoEstoqueLocalizacaoPorIdPort excluirProdutoEstoqueLocalizacaoPorIdPort;
    private final ListarProdutoEstoqueLocalizacaoPort listarProdutoEstoqueLocalizacaoPort;
    private final ObterProdutoEstoqueLocalizacaoPorIdPort obterProdutoEstoqueLocalizacaoPorIdPort;

    @Override
    public ProdutoEstoqueLocalizacao adicionar(AdicionarProdutoEstoqueLocalizacao adicionar) {
        return adicionarProdutoEstoqueLocalizacaoPort.adicionarProdutoEstoqueLocalizacao(adicionar);
    }

    @Override
    public List<ProdutoEstoqueLocalizacao> listar(Paginacao paginacao) {
        return listarProdutoEstoqueLocalizacaoPort.listarProdutoEstoqueLocalizacao(paginacao);
    }

    @Override
    public ProdutoEstoqueLocalizacao obterPorId(Long id) {
        return obterProdutoEstoqueLocalizacaoPorIdPort.obterProdutoEstoqueLocalizacaoPorId(id);
    }

    @Override
    public ProdutoEstoqueLocalizacao atualizar(Long id, AtualizarProdutoEstoqueLocalizacao atualizar) {
        return atualizarProdutoEstoqueLocalizacaoPort.atualizarProdutoEstoqueLocalizacao(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirProdutoEstoqueLocalizacaoPorIdPort.excluirProdutoEstoqueLocalizacaoPorId(id);
    }
}
