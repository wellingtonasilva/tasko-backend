package br.com.wasistemas.tasko.usuario.adapter.out.persistence;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.usuario.adapter.out.persistence.mapper.UsuarioEntityMapper;
import br.com.wasistemas.tasko.usuario.adapter.out.persistence.repository.UsuarioEmpresaRepository;
import br.com.wasistemas.tasko.usuario.application.port.out.usuario.empresa.*;
import br.com.wasistemas.tasko.usuario.domain.usuario.empresa.AdicionarUsuarioEmpresa;
import br.com.wasistemas.tasko.usuario.domain.usuario.empresa.AtualizarUsuarioEmpresa;
import br.com.wasistemas.tasko.usuario.domain.usuario.empresa.UsuarioEmpresa;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UsuarioEmpresaPersistenceAdapter implements AdicionarUsuarioEmpresaPort,
    AtualizarUsuarioEmpresaPort, ListarUsuarioEmpresaPort, ObterUsuarioEmpresaPort,
    ExcluirUsuarioEmpresaPort {

  private final UsuarioEntityMapper usuarioEntityMapper;
  private final UsuarioEmpresaRepository usuarioEmpresaRepository;

  @Override
  public UsuarioEmpresa adicionarUsuarioEmpresa(AdicionarUsuarioEmpresa adicionarUsuarioEmpresa) {
    return usuarioEntityMapper.toDomain(
        usuarioEmpresaRepository.save(usuarioEntityMapper.toEntity(adicionarUsuarioEmpresa)));
  }

  @Override
  public UsuarioEmpresa atualizarUsuarioEmpresa(Long id,
      AtualizarUsuarioEmpresa atualizarUsuarioEmpresa) {
    return usuarioEntityMapper.toDomain(
        usuarioEmpresaRepository.save(usuarioEntityMapper.toEntity(id, atualizarUsuarioEmpresa)));
  }

  @Override
  public void excluirUsuarioEmpresa(Long id) {
    usuarioEmpresaRepository.deleteById(id);
  }

  @Override
  public List<UsuarioEmpresa> listarUsuarioEmpresa(Paginacao paginacao) {
    Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
        ? Sort.Direction.DESC
        : Sort.Direction.ASC;

    Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
        Sort.by(direction, paginacao.getSortBy()));

    return usuarioEmpresaRepository.findAll(pageable).map(usuarioEntityMapper::toDomain).toList();
  }

  @Override
  public UsuarioEmpresa obterUsuarioEmpresa(Long id) {
    return usuarioEntityMapper.toDomain(usuarioEmpresaRepository.findById(id).orElse(null));
  }
}
