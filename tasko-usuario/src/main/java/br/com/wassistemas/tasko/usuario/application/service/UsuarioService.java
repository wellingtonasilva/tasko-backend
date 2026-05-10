package br.com.wassistemas.tasko.usuario.application.service;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.domain.usuario.empresa.AdicionarUsuarioEmpresa;
import br.com.wassistemas.tasko.common.domain.usuario.perfil.AdicionarUsuarioPerfil;
import br.com.wassistemas.tasko.common.enumerations.PerfilTipo;
import br.com.wassistemas.tasko.common.usecases.usuario.UsuarioUseCases;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.AdicionarUsuarioPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.AtualizarUsuarioPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.ExcluirUsuarioPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.ListarUsuarioPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.ObterUsuarioPort;
import br.com.wassistemas.tasko.common.domain.usuario.AdicionarUsuario;
import br.com.wassistemas.tasko.common.domain.usuario.AtualizarUsuario;
import br.com.wassistemas.tasko.common.domain.usuario.Usuario;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.empresa.AdicionarUsuarioEmpresaPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.perfil.AdicionarUsuarioPerfilPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.perfil.ObterUsuarioPerfilPorUsuarioIdPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
  private final BCryptPasswordEncoder passwordEncoder;
  private final AdicionarUsuarioEmpresaPort adicionarUsuarioEmpresaPort;
  private final AdicionarUsuarioPerfilPort adicionarUsuarioPerfilPort;
  private final ObterUsuarioPerfilPorUsuarioIdPort obterUsuarioPerfilPorUsuarioIdPort;

  @Override
  public Usuario adicionar(Long empresaId, AdicionarUsuario adicionar) {
    return adicionarUsuarioPort.adicionarUsuario(AdicionarUsuario.builder()
        .nomeUsuario(adicionar.getNomeUsuario())
        .vendedorId(adicionar.getVendedorId())
        .nomeCompleto(adicionar.getNomeCompleto())
        .numeroTelefone(adicionar.getNumeroTelefone())
        .senha(passwordEncoder.encode(adicionar.getSenha()))
        .build());
  }

  @Override
  public List<Usuario> listar(Long empresaId, Paginacao paginacao) {
    return listarUsuarioPort.listarUsuario(empresaId, paginacao);
  }

  @Override
  public Usuario obterPorId(Long empresaId, Long id) {
    Usuario usuario = obterUsuarioPort.obterUsuarioPorId(id);
    usuario.setPerfis(obterUsuarioPerfilPorUsuarioIdPort.obterUsuarioPerfilPorUsuarioId(id));
    return usuario;
  }

  @Override
  @Transactional
  public Usuario atualizar(Long empresaId, Long id, AtualizarUsuario atualizar) {
    return atualizarUsuarioPort.atualizarUsuario(id, atualizar);
  }

  @Override
  public void excluirPorId(Long empresaId, Long id) {
    excluirUsuarioPort.excluirUsuario(id);
  }

  @Override
  @Transactional
  public Usuario adicionarUsuarioComEmpresa(Long empresaId, AdicionarUsuario adicionarUsuario) {
    Usuario usuario = this.adicionar(empresaId, adicionarUsuario);

    adicionarUsuarioEmpresaPort.adicionarUsuarioEmpresa(AdicionarUsuarioEmpresa.builder()
        .usuarioId(usuario.getId())
        .empresaId(empresaId)
        .build());

    adicionarUsuarioPerfilPort.adicionarUsuarioPerfil(AdicionarUsuarioPerfil.builder()
        .usuarioId(usuario.getId())
        .perfilTipo(PerfilTipo.ROLE_STAFF)
        .build());

    return obterPorId(empresaId, usuario.getId());
  }
}
