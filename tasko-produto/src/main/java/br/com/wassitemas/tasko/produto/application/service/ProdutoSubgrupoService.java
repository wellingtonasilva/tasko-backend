package br.com.wassitemas.tasko.produto.application.service;

import br.com.wassitemas.tasko.produto.application.port.in.usecases.ProdutoSubgrupoUseCases;
import br.com.wassitemas.tasko.produto.application.port.out.subgrupo.AdicionarProdutoSubgrupoPort;
import br.com.wassitemas.tasko.produto.application.port.out.subgrupo.AtualizarProdutoSubgrupoPort;
import br.com.wassitemas.tasko.produto.application.port.out.subgrupo.ExcluirProdutoSubgrupoPorIdPort;
import br.com.wassitemas.tasko.produto.application.port.out.subgrupo.ListarProdutoSubgrupoPort;
import br.com.wassitemas.tasko.produto.application.port.out.subgrupo.ObterProdutoSubgrupoPorIdPort;
import br.com.wassitemas.tasko.produto.domain.subgrupo.AdicionarProdutoSubgrupo;
import br.com.wassitemas.tasko.produto.domain.subgrupo.AtualizarProdutoSubgrupo;
import br.com.wassitemas.tasko.produto.domain.subgrupo.ProdutoSubgrupo;
import br.com.wassistemas.tasko.common.domain.Paginacao;
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
    public ProdutoSubgrupo adicionar(Long empresaId, AdicionarProdutoSubgrupo adicionar) {
        return adicionarProdutoSubgrupoPort.adicionarProdutoSubgrupo(adicionar);
    }

    @Override
    public List<ProdutoSubgrupo> listar(Long empresaId, Paginacao paginacao) {
        return listarProdutoSubgrupoPort.listarProdutoSubgrupo(paginacao);
    }

    @Override
    public ProdutoSubgrupo obterPorId(Long empresaId, Long id) {
        return obterProdutoSubgrupoPorIdPort.obterProdutoSubgrupoPorId(id);
    }

    @Override
    public ProdutoSubgrupo atualizar(Long empresaId, Long id, AtualizarProdutoSubgrupo atualizar) {
        return atualizarProdutoSubgrupoPort.atualizarProdutoSubgrupo(id, atualizar);
    }

    @Override
    public void excluirPorId(Long empresaId, Long id) {
        excluirProdutoSubgrupoPorIdPort.excluirProdutoSubgrupoPorId(id);
    }
}
