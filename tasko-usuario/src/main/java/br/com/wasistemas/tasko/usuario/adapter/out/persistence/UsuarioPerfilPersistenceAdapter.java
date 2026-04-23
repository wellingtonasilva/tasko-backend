package br.com.wasistemas.tasko.usuario.adapter.out.persistence;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.usuario.adapter.out.persistence.mapper.UsuarioEntityMapper;
import br.com.wasistemas.tasko.usuario.adapter.out.persistence.repository.UsuarioPerfilRepository;
import br.com.wasistemas.tasko.usuario.application.port.out.usuario.perfil.AdicionarUsuarioPerfilPort;
import br.com.wasistemas.tasko.usuario.application.port.out.usuario.perfil.AtualizarUsuarioPerfilPort;
import br.com.wasistemas.tasko.usuario.application.port.out.usuario.perfil.ExcluirUsuarioPerfilPort;
import br.com.wasistemas.tasko.usuario.application.port.out.usuario.perfil.ListarUsuarioPerfilPort;
import br.com.wasistemas.tasko.usuario.application.port.out.usuario.perfil.ObterUsuarioPerfilPorIdPort;
import br.com.wasistemas.tasko.usuario.domain.usuario.perfl.AdicionarUsuarioPerfil;
import br.com.wasistemas.tasko.usuario.domain.usuario.perfl.AtualizarUsuarioPerfil;
import br.com.wasistemas.tasko.usuario.domain.usuario.perfl.UsuarioPerfil;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioPerfilPersistenceAdapter implements AdicionarUsuarioPerfilPort,
    AtualizarUsuarioPerfilPort, ListarUsuarioPerfilPort, ObterUsuarioPerfilPorIdPort,
    ExcluirUsuarioPerfilPort {

  private final UsuarioPerfilRepository usuarioPerfilRepository;
  private final UsuarioEntityMapper usuarioEntityMapper;

  @Override
  public UsuarioPerfil adicionarUsuarioPerfil(AdicionarUsuarioPerfil adicionar) {
    return usuarioEntityMapper.toDomain(
        usuarioPerfilRepository.save(usuarioEntityMapper.toEntity(adicionar)));
  }

  @Override
  public UsuarioPerfil atualizarUsuarioPerfil(Long id, AtualizarUsuarioPerfil atualizar) {
    return usuarioEntityMapper.toDomain(
        usuarioPerfilRepository.save(usuarioEntityMapper.toEntity(id, atualizar)));
  }

  @Override
  public void excluirUsuarioPerfil(Long id) {
    usuarioPerfilRepository.deleteById(id);
  }

  @Override
  public List<UsuarioPerfil> listarUsuarioPerfil(Paginacao paginacao) {
    Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
        ? Sort.Direction.DESC
        : Sort.Direction.ASC;

    Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
        Sort.by(direction, paginacao.getSortBy()));

    return usuarioPerfilRepository.findAll(pageable).map(usuarioEntityMapper::toDomain).toList();
  }

  @Override
  public UsuarioPerfil obterUsuarioPerfilPorId(Long id) {
    return null;
  }
}
