package br.com.wassistemas.tasko.usuario.application.service;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.usecases.usuario.UsuarioEmpresaUseCases;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.empresa.AdicionarUsuarioEmpresaPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.empresa.AtualizarUsuarioEmpresaPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.empresa.ExcluirUsuarioEmpresaPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.empresa.ListarUsuarioEmpresaPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.empresa.ObterUsuarioEmpresaPort;
import br.com.wassistemas.tasko.common.domain.usuario.empresa.AdicionarUsuarioEmpresa;
import br.com.wassistemas.tasko.common.domain.usuario.empresa.AtualizarUsuarioEmpresa;
import br.com.wassistemas.tasko.common.domain.usuario.empresa.UsuarioEmpresa;
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
    public UsuarioEmpresa adicionar(Long empresaId, AdicionarUsuarioEmpresa adicionar) {
        return adicionarUsuarioEmpresaPort.adicionarUsuarioEmpresa(adicionar);
    }

    @Override
    public List<UsuarioEmpresa> listar(Long empresaId, Paginacao paginacao) {
        return listarUsuarioEmpresaPort.listarUsuarioEmpresa(paginacao);
    }

    @Override
    public UsuarioEmpresa obterPorId(Long empresaId, Long id) {
        return obterUsuarioEmpresaPort.obterUsuarioEmpresa(id);
    }

    @Override
    public UsuarioEmpresa atualizar(Long empresaId, Long id, AtualizarUsuarioEmpresa atualizar) {
        return atualizarUsuarioEmpresaPort.atualizarUsuarioEmpresa(id, atualizar);
    }

    @Override
    public void excluirPorId(Long empresaId, Long id) {
        excluirUsuarioEmpresaPort.excluirUsuarioEmpresa(id);
    }
}
