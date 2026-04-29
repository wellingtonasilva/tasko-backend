package br.com.wassistemas.tasko.usuario.application.service;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.usecases.usuario.UsuarioUseCases;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.AdicionarUsuarioPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.AtualizarUsuarioPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.ExcluirUsuarioPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.ListarUsuarioPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.ObterUsuarioPort;
import br.com.wassistemas.tasko.common.domain.usuario.AdicionarUsuario;
import br.com.wassistemas.tasko.common.domain.usuario.AtualizarUsuario;
import br.com.wassistemas.tasko.common.domain.usuario.Usuario;
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

  @Override
  public Usuario adicionar(Long empresaId, AdicionarUsuario adicionar) {
    return adicionarUsuarioPort.adicionarUsuario(AdicionarUsuario.builder()
        .nomeUsuario(adicionar.getNomeUsuario())
        .vendedorId(adicionar.getVendedorId())
        .senha(passwordEncoder.encode(adicionar.getSenha()))
        .build());
  }

  @Override
  public List<Usuario> listar(Long empresaId, Paginacao paginacao) {
    return listarUsuarioPort.listarUsuario(paginacao);
  }

  @Override
  public Usuario obterPorId(Long empresaId, Long id) {
    return obterUsuarioPort.obterUsuarioPorId(id);
  }

  @Override
  public Usuario atualizar(Long empresaId, Long id, AtualizarUsuario atualizar) {
    return atualizarUsuarioPort.atualizarUsuario(id, atualizar);
  }

  @Override
  public void excluirPorId(Long empresaId, Long id) {
    excluirUsuarioPort.excluirUsuario(id);
  }
}
