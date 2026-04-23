package br.com.wasistemas.tasko.usuario.application.service;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.usuario.application.port.in.usecases.UsuarioUseCases;
import br.com.wasistemas.tasko.usuario.application.port.out.usuario.*;
import br.com.wasistemas.tasko.usuario.domain.usuario.AdicionarUsuario;
import br.com.wasistemas.tasko.usuario.domain.usuario.AtualizarUsuario;
import br.com.wasistemas.tasko.usuario.domain.usuario.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService implements UsuarioUseCases {

    private final AdicionarUsuarioPort adicionarUsuarioPort;
    private final AtualizarUsuarioPort atualizarUsuarioPort;
    private final ListarUsuarioPort listarUsuarioPort;
    private final ObterUsuarioPort obterUsuarioPort;
    private final ExcluirUsuarioPort excluirUsuarioPort;

    @Override
    public Usuario adicionar(AdicionarUsuario adicionar) {
        return adicionarUsuarioPort.adicionarUsuario(adicionar);
    }

    @Override
    public List<Usuario> listar(Paginacao paginacao) {
        return listarUsuarioPort.listarUsuario(paginacao);
    }

    @Override
    public Usuario obterPorId(Long id) {
        return obterUsuarioPort.obterUsuarioPorId(id);
    }

    @Override
    public Usuario atualizar(Long id, AtualizarUsuario atualizar) {
        return atualizarUsuarioPort.atualizarUsuario(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirUsuarioPort.excluirUsuario(id);
    }
}
