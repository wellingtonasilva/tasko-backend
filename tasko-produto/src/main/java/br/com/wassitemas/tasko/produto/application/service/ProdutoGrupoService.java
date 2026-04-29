package br.com.wassitemas.tasko.produto.application.service;

import br.com.wassitemas.tasko.produto.application.port.in.usecases.ProdutoGrupoUseCases;
import br.com.wassitemas.tasko.produto.application.port.out.grupo.AdicionarProdutoGrupoPort;
import br.com.wassitemas.tasko.produto.application.port.out.grupo.AtualizarProdutoGrupoPort;
import br.com.wassitemas.tasko.produto.application.port.out.grupo.ExcluirProdutoGrupoPorIdPort;
import br.com.wassitemas.tasko.produto.application.port.out.grupo.ListarProdutoGrupoPort;
import br.com.wassitemas.tasko.produto.application.port.out.grupo.ObterProdutoGrupoPorIdPort;
import br.com.wassitemas.tasko.produto.domain.grupo.AdicionarProdutoGrupo;
import br.com.wassitemas.tasko.produto.domain.grupo.AtualizarProdutoGrupo;
import br.com.wassitemas.tasko.produto.domain.grupo.ProdutoGrupo;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProdutoGrupoService implements ProdutoGrupoUseCases {

    private final AdicionarProdutoGrupoPort adicionarProdutoGrupoPort;
    private final AtualizarProdutoGrupoPort atualizarProdutoGrupoPort;
    private final ExcluirProdutoGrupoPorIdPort excluirProdutoGrupoPorIdPort;
    private final ListarProdutoGrupoPort listarProdutoGrupoPort;
    private final ObterProdutoGrupoPorIdPort obterProdutoGrupoPorIdPort;

    @Override
    public ProdutoGrupo adicionar(Long empresaId, AdicionarProdutoGrupo adicionar) {
        return adicionarProdutoGrupoPort.adicionarProdutoGrupo(adicionar);
    }

    @Override
    public List<ProdutoGrupo> listar(Long empresaId, Paginacao paginacao) {
        return listarProdutoGrupoPort.listarProdutoGrupo(paginacao);
    }

    @Override
    public ProdutoGrupo obterPorId(Long empresaId, Long id) {
        return obterProdutoGrupoPorIdPort.obterProdutoGrupoPorId(id);
    }

    @Override
    public ProdutoGrupo atualizar(Long empresaId, Long id, AtualizarProdutoGrupo atualizar) {
        return atualizarProdutoGrupoPort.atualizarProdutoGrupo(id, atualizar);
    }

    @Override
    public void excluirPorId(Long empresaId, Long id) {
        excluirProdutoGrupoPorIdPort.excluirProdutoGrupoPorId(id);
    }
}
