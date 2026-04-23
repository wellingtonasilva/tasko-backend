package br.com.wasistemas.tasko.usuario.adapter.out.persistence;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.usuario.adapter.out.persistence.mapper.UsuarioEntityMapper;
import br.com.wasistemas.tasko.usuario.adapter.out.persistence.repository.UsuarioRepository;
import br.com.wasistemas.tasko.usuario.application.port.out.usuario.*;
import br.com.wasistemas.tasko.usuario.domain.usuario.AdicionarUsuario;
import br.com.wasistemas.tasko.usuario.domain.usuario.AtualizarUsuario;
import br.com.wasistemas.tasko.usuario.domain.usuario.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UsuarioPersistenceAdapter implements AdicionarUsuarioPort, AtualizarUsuarioPort,
    ExcluirUsuarioPort, ListarUsuarioPort, ObterUsuarioPort {

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
}
