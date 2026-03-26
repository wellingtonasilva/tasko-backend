package br.com.wasistemas.tasko.produto.application.service;

import br.com.wasistemas.tasko.produto.application.port.in.usecases.ProdutoSubgrupoUseCases;
import br.com.wasistemas.tasko.produto.application.port.out.subgrupo.*;
import br.com.wasistemas.tasko.produto.domain.subgrupo.AdicionarProdutoSubgrupo;
import br.com.wasistemas.tasko.produto.domain.subgrupo.AtualizarProdutoSubgrupo;
import br.com.wasistemas.tasko.produto.domain.subgrupo.ProdutoSubgrupo;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProdutoSubgrupoService implements ProdutoSubgrupoUseCases {

    private final AdicionarProdutoSubgrupoPort adicionarProdutoSubgrupoPort;
    private final AtualizarProdutoSubgrupoPort atualizarProdutoSubgrupoPort;
    private final ExcluirProdutoSubgrupoPorIdPort excluirProdutoSubgrupoPorIdPort;
    private final ListarProdutoSubgrupoPort listarProdutoSubgrupoPort;
    private final ObterProdutoSubgrupoPorIdPort obterProdutoSubgrupoPorIdPort;

    @Override
    public ProdutoSubgrupo adicionar(AdicionarProdutoSubgrupo adicionar) {
        return adicionarProdutoSubgrupoPort.adicionarProdutoSubgrupo(adicionar);
    }

    @Override
    public List<ProdutoSubgrupo> listar(Paginacao paginacao) {
        return listarProdutoSubgrupoPort.listarProdutoSubgrupo(paginacao);
    }

    @Override
    public ProdutoSubgrupo obterPorId(Long id) {
        return obterProdutoSubgrupoPorIdPort.obterProdutoSubgrupoPorId(id);
    }

    @Override
    public ProdutoSubgrupo atualizar(Long id, AtualizarProdutoSubgrupo atualizar) {
        return atualizarProdutoSubgrupoPort.atualizarProdutoSubgrupo(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirProdutoSubgrupoPorIdPort.excluirProdutoSubgrupoPorId(id);
    }
}
