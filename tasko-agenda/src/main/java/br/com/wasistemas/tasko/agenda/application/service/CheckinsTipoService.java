package br.com.wasistemas.tasko.agenda.application.service;

import br.com.wasistemas.tasko.agenda.application.port.in.usecases.CheckinsTipoUseCases;
import br.com.wasistemas.tasko.agenda.application.port.out.checkinstipo.*;
import br.com.wasistemas.tasko.agenda.domain.checkinstipo.AdicionarCheckinsTipo;
import br.com.wasistemas.tasko.agenda.domain.checkinstipo.AtualizarCheckinsTipo;
import br.com.wasistemas.tasko.agenda.domain.checkinstipo.CheckinsTipo;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CheckinsTipoService implements CheckinsTipoUseCases {

    private final AdicionarCheckinsTipoPort adicionarCheckinsTipoPort;
    private final AtualizarCheckinsTipoPort atualizarCheckinsTipoPort;
    private final ExcluirCheckinsTipoPorIdPort excluirCheckinsTipoPorIdPort;
    private final ListarCheckinsTipoPort listarCheckinsTipoPort;
    private final ObterCheckinsTipoPorIdPort obterCheckinsTipoPorIdPort;

    @Override
    public CheckinsTipo adicionar(AdicionarCheckinsTipo adicionar) {
        return adicionarCheckinsTipoPort.adicionarCheckinsTipo(adicionar);
    }

    @Override
    public List<CheckinsTipo> listar(Paginacao paginacao) {
        return listarCheckinsTipoPort.listarCheckinsTipo(paginacao);
    }

    @Override
    public CheckinsTipo obterPorId(Long id) {
        return obterCheckinsTipoPorIdPort.obterCheckinsTipoPorId(id);
    }

    @Override
    public CheckinsTipo atualizar(Long id, AtualizarCheckinsTipo atualizar) {
        return atualizarCheckinsTipoPort.atualizarCheckinsTipo(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirCheckinsTipoPorIdPort.excluirCheckinsTipoPorId(id);
    }
}
