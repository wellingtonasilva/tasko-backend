package br.com.wassistemas.tasko.produto.application.service;

import br.com.wassistemas.tasko.produto.application.port.in.usecases.ProdutoCodigoBarrasUseCases;
import br.com.wassistemas.tasko.produto.application.port.out.produtocodigobarras.AdicionarProdutoCodigoBarrasPort;
import br.com.wassistemas.tasko.produto.application.port.out.produtocodigobarras.AtualizarProdutoCodigoBarrasPort;
import br.com.wassistemas.tasko.produto.application.port.out.produtocodigobarras.ExcluirProdutoCodigoBarrasPorIdPort;
import br.com.wassistemas.tasko.produto.application.port.out.produtocodigobarras.ListarProdutoCodigoBarrasPort;
import br.com.wassistemas.tasko.produto.application.port.out.produtocodigobarras.ObterProdutoCodigoBarrasPorIdPort;
import br.com.wassistemas.tasko.produto.domain.produtocodigobarras.AdicionarProdutoCodigoBarras;
import br.com.wassistemas.tasko.produto.domain.produtocodigobarras.AtualizarProdutoCodigoBarras;
import br.com.wassistemas.tasko.produto.domain.produtocodigobarras.ProdutoCodigoBarras;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProdutoCodigoBarrasService implements ProdutoCodigoBarrasUseCases {

    private final AdicionarProdutoCodigoBarrasPort adicionarProdutoCodigoBarrasPort;
    private final AtualizarProdutoCodigoBarrasPort atualizarProdutoCodigoBarrasPort;
    private final ExcluirProdutoCodigoBarrasPorIdPort excluirProdutoCodigoBarrasPorIdPort;
    private final ListarProdutoCodigoBarrasPort listarProdutoCodigoBarrasPort;
    private final ObterProdutoCodigoBarrasPorIdPort obterProdutoCodigoBarrasPorIdPort;

    @Override
    public ProdutoCodigoBarras adicionar(AdicionarProdutoCodigoBarras adicionar) {
        return adicionarProdutoCodigoBarrasPort.adicionarProdutoCodigoBarras(adicionar);
    }

    @Override
    public List<ProdutoCodigoBarras> listar(Paginacao paginacao) {
        return listarProdutoCodigoBarrasPort.listarProdutoCodigoBarras(paginacao);
    }

    @Override
    public ProdutoCodigoBarras obterPorId(Long id) {
        return obterProdutoCodigoBarrasPorIdPort.obterProdutoCodigoBarrasPorId(id);
    }

    @Override
    public ProdutoCodigoBarras atualizar(Long id, AtualizarProdutoCodigoBarras atualizar) {
        return atualizarProdutoCodigoBarrasPort.atualizarProdutoCodigoBarras(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirProdutoCodigoBarrasPorIdPort.excluirProdutoCodigoBarrasPorId(id);
    }
}
