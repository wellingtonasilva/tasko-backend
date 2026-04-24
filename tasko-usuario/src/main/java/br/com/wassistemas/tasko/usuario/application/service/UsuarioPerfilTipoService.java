package br.com.wassistemas.tasko.usuario.application.service;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.usuario.application.port.in.usecases.UsuarioPerfilTipoUseCases;
import br.com.wassistemas.tasko.usuario.application.port.out.perfil.AdicionarUsuarioPerfilTipoPort;
import br.com.wassistemas.tasko.usuario.application.port.out.perfil.AtualizarUsuarioPerfilTipoPort;
import br.com.wassistemas.tasko.usuario.application.port.out.perfil.ExcluirUsuarioPerfilTipoPort;
import br.com.wassistemas.tasko.usuario.application.port.out.perfil.ListarUsuarioPerfilTipoPort;
import br.com.wassistemas.tasko.usuario.application.port.out.perfil.ObterUsuarioPerfilTipoPort;
import br.com.wassistemas.tasko.usuario.domain.perfil.AdicionarUsuarioPerfilTipo;
import br.com.wassistemas.tasko.usuario.domain.perfil.AtualizarUsuarioPerfilTipo;
import br.com.wassistemas.tasko.usuario.domain.perfil.UsuarioPerfilTipo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioPerfilTipoService implements UsuarioPerfilTipoUseCases {

    private final AdicionarUsuarioPerfilTipoPort adicionarUsuarioPerfilTipoPort;
    private final AtualizarUsuarioPerfilTipoPort atualizarUsuarioPerfilTipoPort;
    private final ListarUsuarioPerfilTipoPort listarUsuarioPerfilTipoPort;
    private final ObterUsuarioPerfilTipoPort obterUsuarioPerfilTipoPort;
    private final ExcluirUsuarioPerfilTipoPort excluirUsuarioPerfilTipoPort;

    @Override
    public UsuarioPerfilTipo adicionar(AdicionarUsuarioPerfilTipo adicionar) {
        return adicionarUsuarioPerfilTipoPort.adicionarUsuarioPerfilTipo(adicionar);
    }

    @Override
    public List<UsuarioPerfilTipo> listar(Paginacao paginacao) {
        return listarUsuarioPerfilTipoPort.listarUsuarioPerfilTipo(paginacao);
    }

    @Override
    public UsuarioPerfilTipo obterPorId(Long id) {
        return obterUsuarioPerfilTipoPort.obterUsuarioPerfilTipoPorId(id);
    }

    @Override
    public UsuarioPerfilTipo atualizar(Long id, AtualizarUsuarioPerfilTipo atualizar) {
        return atualizarUsuarioPerfilTipoPort.atualizarUsuarioPerfilTipo(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirUsuarioPerfilTipoPort.excluirUsuarioPerfilTipo(id);
    }
}
