package br.com.wasistemas.tasko.usuario.application.service;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.usuario.application.port.in.usecases.UsuarioPerfilUseCases;
import br.com.wasistemas.tasko.usuario.application.port.out.usuario.perfil.*;
import br.com.wasistemas.tasko.usuario.domain.usuario.perfl.AdicionarUsuarioPerfil;
import br.com.wasistemas.tasko.usuario.domain.usuario.perfl.AtualizarUsuarioPerfil;
import br.com.wasistemas.tasko.usuario.domain.usuario.perfl.UsuarioPerfil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioPerfilService implements UsuarioPerfilUseCases {

    private final AdicionarUsuarioPerfilPort adicionarUsuarioPerfilPort;
    private final AtualizarUsuarioPerfilPort atualizarUsuarioPerfilPort;
    private final ListarUsuarioPerfilPort listarUsuarioPerfilPort;
    private final ExcluirUsuarioPerfilPort excluirUsuarioPerfilPort;
    private final ObterUsuarioPerfilPorIdPort obterUsuarioPerfilPorIdPort;

    @Override
    public UsuarioPerfil adicionar(AdicionarUsuarioPerfil adicionar) {
        return adicionarUsuarioPerfilPort.adicionarUsuarioPerfil(adicionar);
    }

    @Override
    public List<UsuarioPerfil> listar(Paginacao paginacao) {
        return listarUsuarioPerfilPort.listarUsuarioPerfil(paginacao);
    }

    @Override
    public UsuarioPerfil obterPorId(Long id) {
        return obterUsuarioPerfilPorIdPort.obterUsuarioPerfilPorId(id);
    }

    @Override
    public UsuarioPerfil atualizar(Long id, AtualizarUsuarioPerfil atualizar) {
        return atualizarUsuarioPerfilPort.atualizarUsuarioPerfil(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirUsuarioPerfilPort.excluirUsuarioPerfil(id);
    }
}
