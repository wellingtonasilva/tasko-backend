package br.com.wassistemas.tasko.usuario.adapter.out.persistence;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.mapper.UsuarioEntityMapper;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.repository.UsuarioRepository;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.AdicionarUsuarioPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.AtualizarUsuarioPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.ExcluirUsuarioPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.ListarUsuarioPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.ObterUsuarioPorNomeUsuarioPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.ObterUsuarioPort;
import br.com.wassistemas.tasko.usuario.domain.login.UsuarioLogin;
import br.com.wassistemas.tasko.common.domain.usuario.AdicionarUsuario;
import br.com.wassistemas.tasko.common.domain.usuario.AtualizarUsuario;
import br.com.wassistemas.tasko.common.domain.usuario.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UsuarioPersistenceAdapter implements AdicionarUsuarioPort, AtualizarUsuarioPort,
    ExcluirUsuarioPort, ListarUsuarioPort, ObterUsuarioPort, ObterUsuarioPorNomeUsuarioPort {

  private final UsuarioRepository usuarioRepository;
  private final UsuarioEntityMapper usuarioMapper;

  @Override
  public Usuario atualizarUsuario(Long id, AtualizarUsuario usuario) {
    return usuarioMapper.toDomain(usuarioRepository.save(usuarioMapper.toEntity(id, usuario)));
  }

  @Override
  public void excluirUsuario(Long id) {
    usuarioRepository.deleteById(id);
  }

  @Override
  public List<Usuario> listarUsuario(Paginacao paginacao) {
    Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
        ? Sort.Direction.DESC
        : Sort.Direction.ASC;

    Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
        Sort.by(direction, paginacao.getSortBy()));

    return usuarioRepository.findAll(pageable).map(usuarioMapper::toDomain).toList();
  }

  @Override
  public Usuario obterUsuarioPorId(Long id) {
    return usuarioMapper.toDomain(usuarioRepository.findById(id).orElse(null));
  }

  @Override
  public Usuario adicionarUsuario(AdicionarUsuario usuario) {
    return usuarioMapper.toDomain(usuarioRepository.save(usuarioMapper.toEntity(usuario)));
  }

  @Override
  public UsuarioLogin obterUsuarioPorNomeUsuario(String nomeUsuario) {
    return usuarioRepository.findByNomeUsuario(nomeUsuario)
        .map(usuarioMapper::toUsuarioLogin)
        .orElse(null);
  }
}
