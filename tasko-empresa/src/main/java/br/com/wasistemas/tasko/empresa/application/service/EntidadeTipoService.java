package br.com.wasistemas.tasko.empresa.application.service;

import br.com.wasistemas.tasko.empresa.application.port.in.usecases.EntidadeTipoUseCases;
import br.com.wasistemas.tasko.empresa.application.port.out.entidadetipo.*;
import br.com.wasistemas.tasko.empresa.domain.entidadetipo.AdicionarEntidadeTipo;
import br.com.wasistemas.tasko.empresa.domain.entidadetipo.AtualizarEntidadeTipo;
import br.com.wasistemas.tasko.empresa.domain.entidadetipo.EntidadeTipo;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class EntidadeTipoService implements EntidadeTipoUseCases {

    private final AdicionarEntidadeTipoPort adicionarEntidadeTipoPort;
    private final AtualizarEntidadeTipoPort atualizarEntidadeTipoPort;
    private final ExcluirEntidadeTipoPorIdPort excluirEntidadeTipoPorIdPort;
    private final ListarEntidadeTipoPort listarEntidadeTipoPort;
    private final ObterEntidadeTipoPorIdPort obterEntidadeTipoPorIdPort;

    @Override
    public EntidadeTipo adicionar(AdicionarEntidadeTipo adicionar) {
        return adicionarEntidadeTipoPort.adicionarEntidadeTipo(adicionar);
    }

    @Override
    public List<EntidadeTipo> listar(Paginacao paginacao) {
        return listarEntidadeTipoPort.listarEntidadeTipo(paginacao);
    }

    @Override
    public EntidadeTipo obterPorId(Long id) {
        return obterEntidadeTipoPorIdPort.obterEntidadeTipoPorId(id);
    }

    @Override
    public EntidadeTipo atualizar(Long id, AtualizarEntidadeTipo atualizar) {
        return atualizarEntidadeTipoPort.atualizarEntidadeTipo(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirEntidadeTipoPorIdPort.excluirEntidadeTipoPorId(id);
    }
}
