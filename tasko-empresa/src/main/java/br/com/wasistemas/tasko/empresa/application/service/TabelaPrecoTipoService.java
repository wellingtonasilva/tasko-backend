package br.com.wasistemas.tasko.empresa.application.service;

import br.com.wasistemas.tasko.empresa.application.port.in.usecases.TabelaPrecoTipoUseCases;
import br.com.wasistemas.tasko.empresa.application.port.out.tabelaprecotipo.*;
import br.com.wasistemas.tasko.empresa.domain.tabelaprecotipo.AdicionarTabelaPrecoTipo;
import br.com.wasistemas.tasko.empresa.domain.tabelaprecotipo.AtualizarTabelaPrecoTipo;
import br.com.wasistemas.tasko.empresa.domain.tabelaprecotipo.TabelaPrecoTipo;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class TabelaPrecoTipoService implements TabelaPrecoTipoUseCases {

    private final AdicionarTabelaPrecoTipoPort adicionarTabelaPrecoTipoPort;
    private final AtualizarTabelaPrecoTipoPort atualizarTabelaPrecoTipoPort;
    private final ExcluirTabelaPrecoTipoPorIdPort excluirTabelaPrecoTipoPorIdPort;
    private final ListarTabelaPrecoTipoPort listarTabelaPrecoTipoPort;
    private final ObterTabelaPrecoTipoPorIdPort obterTabelaPrecoTipoPorIdPort;

    @Override
    public TabelaPrecoTipo adicionar(AdicionarTabelaPrecoTipo adicionar) {
        return adicionarTabelaPrecoTipoPort.adicionarTabelaPrecoTipo(adicionar);
    }

    @Override
    public List<TabelaPrecoTipo> listar(Paginacao paginacao) {
        return listarTabelaPrecoTipoPort.listarTabelaPrecoTipo(paginacao);
    }

    @Override
    public TabelaPrecoTipo obterPorId(Long id) {
        return obterTabelaPrecoTipoPorIdPort.obterTabelaPrecoTipoPorId(id);
    }

    @Override
    public TabelaPrecoTipo atualizar(Long id, AtualizarTabelaPrecoTipo atualizar) {
        return atualizarTabelaPrecoTipoPort.atualizarTabelaPrecoTipo(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirTabelaPrecoTipoPorIdPort.excluirTabelaPrecoTipoPorId(id);
    }
}
