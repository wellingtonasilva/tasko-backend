package br.com.wassistemas.tasko.empresa.application.service;

import br.com.wassistemas.tasko.empresa.application.port.in.usecases.EmpresaLocalizacaoUseCases;
import br.com.wassistemas.tasko.empresa.application.port.out.empresalocalizacao.AdicionarEmpresaLocalizacaoPort;
import br.com.wassistemas.tasko.empresa.application.port.out.empresalocalizacao.AtualizarEmpresaLocalizacaoPort;
import br.com.wassistemas.tasko.empresa.application.port.out.empresalocalizacao.ExcluirEmpresaLocalizacaoPorIdPort;
import br.com.wassistemas.tasko.empresa.application.port.out.empresalocalizacao.ListarEmpresaLocalizacaoPort;
import br.com.wassistemas.tasko.empresa.application.port.out.empresalocalizacao.ObterEmpresaLocalizacaoPorIdPort;
import br.com.wassistemas.tasko.empresa.domain.empresalocalizacao.AdicionarEmpresaLocalizacao;
import br.com.wassistemas.tasko.empresa.domain.empresalocalizacao.AtualizarEmpresaLocalizacao;
import br.com.wassistemas.tasko.empresa.domain.empresalocalizacao.EmpresaLocalizacao;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class EmpresaLocalizacaoService implements EmpresaLocalizacaoUseCases {

    private final AdicionarEmpresaLocalizacaoPort adicionarEmpresaLocalizacaoPort;
    private final AtualizarEmpresaLocalizacaoPort atualizarEmpresaLocalizacaoPort;
    private final ExcluirEmpresaLocalizacaoPorIdPort excluirEmpresaLocalizacaoPorIdPort;
    private final ListarEmpresaLocalizacaoPort listarEmpresaLocalizacaoPort;
    private final ObterEmpresaLocalizacaoPorIdPort obterEmpresaLocalizacaoPorIdPort;

    @Override
    public EmpresaLocalizacao adicionar(AdicionarEmpresaLocalizacao adicionar) {
        return adicionarEmpresaLocalizacaoPort.adicionarEmpresaLocalizacao(adicionar);
    }

    @Override
    public List<EmpresaLocalizacao> listar(Paginacao paginacao) {
        return listarEmpresaLocalizacaoPort.listarEmpresaLocalizacao(paginacao);
    }

    @Override
    public EmpresaLocalizacao obterPorId(Long id) {
        return obterEmpresaLocalizacaoPorIdPort.obterEmpresaLocalizacaoPorId(id);
    }

    @Override
    public EmpresaLocalizacao atualizar(Long id, AtualizarEmpresaLocalizacao atualizar) {
        return atualizarEmpresaLocalizacaoPort.atualizarEmpresaLocalizacao(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirEmpresaLocalizacaoPorIdPort.excluirEmpresaLocalizacaoPorId(id);
    }
}
