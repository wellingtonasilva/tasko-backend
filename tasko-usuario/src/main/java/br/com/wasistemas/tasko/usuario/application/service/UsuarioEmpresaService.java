package br.com.wasistemas.tasko.usuario.application.service;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.usuario.application.port.in.usecases.UsuarioEmpresaUseCases;
import br.com.wasistemas.tasko.usuario.application.port.out.usuario.empresa.*;
import br.com.wasistemas.tasko.usuario.domain.usuario.empresa.AdicionarUsuarioEmpresa;
import br.com.wasistemas.tasko.usuario.domain.usuario.empresa.AtualizarUsuarioEmpresa;
import br.com.wasistemas.tasko.usuario.domain.usuario.empresa.UsuarioEmpresa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioEmpresaService implements UsuarioEmpresaUseCases {

    private final AdicionarUsuarioEmpresaPort adicionarUsuarioEmpresaPort;
    private final AtualizarUsuarioEmpresaPort atualizarUsuarioEmpresaPort;
    private final ListarUsuarioEmpresaPort listarUsuarioEmpresaPort;
    private final ObterUsuarioEmpresaPort obterUsuarioEmpresaPort;
    private final ExcluirUsuarioEmpresaPort excluirUsuarioEmpresaPort;

    @Override
    public UsuarioEmpresa adicionar(AdicionarUsuarioEmpresa adicionar) {
        return adicionarUsuarioEmpresaPort.adicionarUsuarioEmpresa(adicionar);
    }

    @Override
    public List<UsuarioEmpresa> listar(Paginacao paginacao) {
        return listarUsuarioEmpresaPort.listarUsuarioEmpresa(paginacao);
    }

    @Override
    public UsuarioEmpresa obterPorId(Long id) {
        return obterUsuarioEmpresaPort.obterUsuarioEmpresa(id);
    }

    @Override
    public UsuarioEmpresa atualizar(Long id, AtualizarUsuarioEmpresa atualizar) {
        return atualizarUsuarioEmpresaPort.atualizarUsuarioEmpresa(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirUsuarioEmpresaPort.excluirUsuarioEmpresa(id);
    }
}
