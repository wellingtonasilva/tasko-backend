package br.com.wassistemas.tasko.empresa.application.service;

import br.com.wassistemas.tasko.empresa.application.port.in.usecases.TabelaPrecoUseCases;
import br.com.wassistemas.tasko.empresa.application.port.out.tabelapreco.AdicionarTabelaPrecoPort;
import br.com.wassistemas.tasko.empresa.application.port.out.tabelapreco.AtualizarTabelaPrecoPort;
import br.com.wassistemas.tasko.empresa.application.port.out.tabelapreco.ExcluirTabelaPrecoPorIdPort;
import br.com.wassistemas.tasko.empresa.application.port.out.tabelapreco.ListarTabelaPrecoPort;
import br.com.wassistemas.tasko.empresa.application.port.out.tabelapreco.ObterTabelaPrecoPorIdPort;
import br.com.wassistemas.tasko.empresa.domain.tabelapreco.AdicionarTabelaPreco;
import br.com.wassistemas.tasko.empresa.domain.tabelapreco.AtualizarTabelaPreco;
import br.com.wassistemas.tasko.empresa.domain.tabelapreco.TabelaPreco;
import br.com.wassistemas.tasko.common.domain.Paginacao;
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
    public TabelaPreco adicionar(Long empresaId, AdicionarTabelaPreco adicionar) {
        return adicionarTabelaPrecoPort.adicionarTabelaPreco(adicionar);
    }

    @Override
    public List<TabelaPreco> listar(Long empresaId, Paginacao paginacao) {
        return listarTabelaPrecoPort.listarTabelaPreco(paginacao);
    }

    @Override
    public TabelaPreco obterPorId(Long empresaId, Long id) {
        return obterTabelaPrecoPorIdPort.obterTabelaPrecoPorId(id);
    }

    @Override
    public TabelaPreco atualizar(Long empresaId, Long id, AtualizarTabelaPreco atualizar) {
        return atualizarTabelaPrecoPort.atualizarTabelaPreco(id, atualizar);
    }

    @Override
    public void excluirPorId(Long empresaId, Long id) {
        excluirTabelaPrecoPorIdPort.excluirTabelaPrecoPorId(id);
    }
}
