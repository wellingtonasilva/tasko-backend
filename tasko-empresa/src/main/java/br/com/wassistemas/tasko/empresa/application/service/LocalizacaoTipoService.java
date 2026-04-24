package br.com.wassistemas.tasko.empresa.application.service;

import br.com.wassistemas.tasko.empresa.application.port.in.usecases.LocalizacaoTipoUseCases;
import br.com.wassistemas.tasko.empresa.application.port.out.localizacaotipo.AdicionarLocalizacaoTipoPort;
import br.com.wassistemas.tasko.empresa.application.port.out.localizacaotipo.AtualizarLocalizacaoTipoPort;
import br.com.wassistemas.tasko.empresa.application.port.out.localizacaotipo.ExcluirLocalizacaoTipoPorIdPort;
import br.com.wassistemas.tasko.empresa.application.port.out.localizacaotipo.ListarLocalizacaoTipoPort;
import br.com.wassistemas.tasko.empresa.application.port.out.localizacaotipo.ObterLocalizacaoTipoPorIdPort;
import br.com.wassistemas.tasko.empresa.domain.localizacaotipo.AdicionarLocalizacaoTipo;
import br.com.wassistemas.tasko.empresa.domain.localizacaotipo.AtualizarLocalizacaoTipo;
import br.com.wassistemas.tasko.empresa.domain.localizacaotipo.LocalizacaoTipo;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class LocalizacaoTipoService implements LocalizacaoTipoUseCases {

    private final AdicionarLocalizacaoTipoPort adicionarLocalizacaoTipoPort;
    private final AtualizarLocalizacaoTipoPort atualizarLocalizacaoTipoPort;
    private final ExcluirLocalizacaoTipoPorIdPort excluirLocalizacaoTipoPorIdPort;
    private final ListarLocalizacaoTipoPort listarLocalizacaoTipoPort;
    private final ObterLocalizacaoTipoPorIdPort obterLocalizacaoTipoPorIdPort;

    @Override
    public LocalizacaoTipo adicionar(AdicionarLocalizacaoTipo adicionar) {
        return adicionarLocalizacaoTipoPort.adicionarLocalizacaoTipo(adicionar);
    }

    @Override
    public List<LocalizacaoTipo> listar(Paginacao paginacao) {
        return listarLocalizacaoTipoPort.listarLocalizacaoTipo(paginacao);
    }

    @Override
    public LocalizacaoTipo obterPorId(Long id) {
        return obterLocalizacaoTipoPorIdPort.obterLocalizacaoTipoPorId(id);
    }

    @Override
    public LocalizacaoTipo atualizar(Long id, AtualizarLocalizacaoTipo atualizar) {
        return atualizarLocalizacaoTipoPort.atualizarLocalizacaoTipo(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirLocalizacaoTipoPorIdPort.excluirLocalizacaoTipoPorId(id);
    }
}
