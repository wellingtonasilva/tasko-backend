package br.com.wassistemas.tasko.usuario.adapter.out.persistence;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.mapper.UsuarioEntityMapper;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.repository.UsuarioPerfilTipoRepository;
import br.com.wassistemas.tasko.usuario.application.port.out.perfil.AdicionarUsuarioPerfilTipoPort;
import br.com.wassistemas.tasko.usuario.application.port.out.perfil.AtualizarUsuarioPerfilTipoPort;
import br.com.wassistemas.tasko.usuario.application.port.out.perfil.ExcluirUsuarioPerfilTipoPort;
import br.com.wassistemas.tasko.usuario.application.port.out.perfil.ListarUsuarioPerfilTipoPort;
import br.com.wassistemas.tasko.usuario.application.port.out.perfil.ObterUsuarioPerfilTipoPort;
import br.com.wassistemas.tasko.usuario.domain.perfil.AdicionarUsuarioPerfilTipo;
import br.com.wassistemas.tasko.usuario.domain.perfil.AtualizarUsuarioPerfilTipo;
import br.com.wassistemas.tasko.usuario.domain.perfil.UsuarioPerfilTipo;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioPerfilTipoPersistenceAdapter implements AdicionarUsuarioPerfilTipoPort,
    AtualizarUsuarioPerfilTipoPort, ListarUsuarioPerfilTipoPort, ExcluirUsuarioPerfilTipoPort,
    ObterUsuarioPerfilTipoPort {

  private final UsuarioPerfilTipoRepository usuarioPerfilTipoRepository;
  private final UsuarioEntityMapper usuarioEntityMapper;

  @Override
  public UsuarioPerfilTipo adicionarUsuarioPerfilTipo(AdicionarUsuarioPerfilTipo adicionar) {
    return usuarioEntityMapper.toDomain(
        usuarioPerfilTipoRepository.save(usuarioEntityMapper.toEntity(adicionar)));
  }

  @Override
  public UsuarioPerfilTipo atualizarUsuarioPerfilTipo(Long id,
      AtualizarUsuarioPerfilTipo atualizarUsuarioPerfilTipo) {
    return usuarioEntityMapper.toDomain(
        usuarioPerfilTipoRepository.save(
            usuarioEntityMapper.toEntity(id, atualizarUsuarioPerfilTipo)));
  }

  @Override
  public void excluirUsuarioPerfilTipo(Long id) {
    usuarioPerfilTipoRepository.deleteById(id);
  }

  @Override
  public List<UsuarioPerfilTipo> listarUsuarioPerfilTipo(Paginacao paginacao) {
    Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
        ? Sort.Direction.DESC
        : Sort.Direction.ASC;

    Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
        Sort.by(direction, paginacao.getSortBy()));

    return usuarioPerfilTipoRepository.findAll(pageable).map(usuarioEntityMapper::toDomain)
        .toList();
  }

  @Override
  public UsuarioPerfilTipo obterUsuarioPerfilTipoPorId(Long id) {
    return usuarioEntityMapper.toDomain(usuarioPerfilTipoRepository.findById(id).orElse(null));
  }
}
