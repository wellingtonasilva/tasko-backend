package br.com.wasistemas.tasko.empresa.application.service;

import br.com.wasistemas.tasko.empresa.application.port.in.usecases.EmpresaUseCases;
import br.com.wasistemas.tasko.empresa.application.port.out.empresa.*;
import br.com.wasistemas.tasko.empresa.domain.empresa.AdicionarEmpresa;
import br.com.wasistemas.tasko.empresa.domain.empresa.AtualizarEmpresa;
import br.com.wasistemas.tasko.empresa.domain.empresa.Empresa;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class EmpresaService implements EmpresaUseCases {

    private final AdicionarEmpresaPort adicionarEmpresaPort;
    private final AtualizarEmpresaPort atualizarEmpresaPort;
    private final ExcluirEmpresaPorIdPort excluirEmpresaPorIdPort;
    private final ListarEmpresaPort listarEmpresaPort;
    private final ObterEmpresaPorIdPort obterEmpresaPorIdPort;

    @Override
    public Empresa adicionar(AdicionarEmpresa adicionar) {
        return adicionarEmpresaPort.adicionarEmpresa(adicionar);
    }

    @Override
    public List<Empresa> listar(Paginacao paginacao) {
        return listarEmpresaPort.listarEmpresa(paginacao);
    }

    @Override
    public Empresa obterPorId(Long id) {
        return obterEmpresaPorIdPort.obterEmpresaPorId(id);
    }

    @Override
    public Empresa atualizar(Long id, AtualizarEmpresa atualizar) {
        return atualizarEmpresaPort.atualizarEmpresa(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirEmpresaPorIdPort.excluirEmpresaPorId(id);
    }
}
