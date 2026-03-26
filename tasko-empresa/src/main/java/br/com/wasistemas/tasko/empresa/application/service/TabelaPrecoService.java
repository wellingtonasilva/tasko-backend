package br.com.wasistemas.tasko.empresa.application.service;

import br.com.wasistemas.tasko.empresa.application.port.in.usecases.TabelaPrecoUseCases;
import br.com.wasistemas.tasko.empresa.application.port.out.tabelapreco.*;
import br.com.wasistemas.tasko.empresa.domain.tabelapreco.AdicionarTabelaPreco;
import br.com.wasistemas.tasko.empresa.domain.tabelapreco.AtualizarTabelaPreco;
import br.com.wasistemas.tasko.empresa.domain.tabelapreco.TabelaPreco;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class TabelaPrecoService implements TabelaPrecoUseCases {

    private final AdicionarTabelaPrecoPort adicionarTabelaPrecoPort;
    private final AtualizarTabelaPrecoPort atualizarTabelaPrecoPort;
    private final ExcluirTabelaPrecoPorIdPort excluirTabelaPrecoPorIdPort;
    private final ListarTabelaPrecoPort listarTabelaPrecoPort;
    private final ObterTabelaPrecoPorIdPort obterTabelaPrecoPorIdPort;

    @Override
    public TabelaPreco adicionar(AdicionarTabelaPreco adicionar) {
        return adicionarTabelaPrecoPort.adicionarTabelaPreco(adicionar);
    }

    @Override
    public List<TabelaPreco> listar(Paginacao paginacao) {
        return listarTabelaPrecoPort.listarTabelaPreco(paginacao);
    }

    @Override
    public TabelaPreco obterPorId(Long id) {
        return obterTabelaPrecoPorIdPort.obterTabelaPrecoPorId(id);
    }

    @Override
    public TabelaPreco atualizar(Long id, AtualizarTabelaPreco atualizar) {
        return atualizarTabelaPrecoPort.atualizarTabelaPreco(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirTabelaPrecoPorIdPort.excluirTabelaPrecoPorId(id);
    }
}
