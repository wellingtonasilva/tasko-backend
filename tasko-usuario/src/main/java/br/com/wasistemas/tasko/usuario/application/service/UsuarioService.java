package br.com.wasistemas.tasko.usuario.application.service;

import br.com.wasistemas.tasko.usuario.adapter.in.web.mapper.UsuarioWebMapper;
import br.com.wasistemas.tasko.usuario.adapter.in.web.request.UsuarioRequest;
import br.com.wasistemas.tasko.usuario.adapter.in.web.response.UsuarioResponse;
import br.com.wasistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioEntity;
import br.com.wasistemas.tasko.usuario.adapter.out.persistence.repository.UsuarioRepository;
import br.com.wasistemas.tasko.usuario.application.port.in.usecases.UsuarioUseCases;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService implements UsuarioUseCases {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioWebMapper usuarioWebMapper;

    @Override
    public UsuarioResponse adicionar(UsuarioRequest usuarioRequest) {
        UsuarioEntity usuario = usuarioWebMapper.toEntity(usuarioRequest);
        UsuarioEntity saved = usuarioRepository.save(usuario);
        return usuarioWebMapper.toResponse(saved);
    }

    @Override
    public List<UsuarioResponse> listar() {
        return usuarioRepository.findAll().stream()
                .map(usuarioWebMapper::toResponse)
                .toList();
    }

    @Override
    public UsuarioResponse obterPorId(Long id) {
        UsuarioEntity usuario = usuarioRepository.findById(id).orElse(null);
        return usuarioWebMapper.toResponse(usuario);
    }

    @Override
    public void excluirPorId(Long id) {
        usuarioRepository.deleteById(id);
    }
}
