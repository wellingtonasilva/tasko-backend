package br.com.wassistemas.tasko.empresa.application.service;

import br.com.wassistemas.tasko.empresa.application.port.in.usecases.TabelaPrecoTipoUseCases;
import br.com.wassistemas.tasko.empresa.application.port.out.tabelaprecotipo.AdicionarTabelaPrecoTipoPort;
import br.com.wassistemas.tasko.empresa.application.port.out.tabelaprecotipo.AtualizarTabelaPrecoTipoPort;
import br.com.wassistemas.tasko.empresa.application.port.out.tabelaprecotipo.ExcluirTabelaPrecoTipoPorIdPort;
import br.com.wassistemas.tasko.empresa.application.port.out.tabelaprecotipo.ListarTabelaPrecoTipoPort;
import br.com.wassistemas.tasko.empresa.application.port.out.tabelaprecotipo.ObterTabelaPrecoTipoPorIdPort;
import br.com.wassistemas.tasko.empresa.domain.tabelaprecotipo.AdicionarTabelaPrecoTipo;
import br.com.wassistemas.tasko.empresa.domain.tabelaprecotipo.AtualizarTabelaPrecoTipo;
import br.com.wassistemas.tasko.empresa.domain.tabelaprecotipo.TabelaPrecoTipo;
import br.com.wassistemas.tasko.common.domain.Paginacao;
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
