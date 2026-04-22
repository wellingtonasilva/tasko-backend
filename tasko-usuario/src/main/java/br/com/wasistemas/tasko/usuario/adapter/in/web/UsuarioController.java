package br.com.wasistemas.tasko.usuario.adapter.in.web;

import br.com.wasistemas.tasko.usuario.adapter.in.web.request.UsuarioRequest;
import br.com.wasistemas.tasko.usuario.adapter.in.web.response.UsuarioResponse;
import br.com.wasistemas.tasko.usuario.adapter.in.web.mapper.UsuarioWebMapper;
import br.com.wasistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioEntity;
import br.com.wasistemas.tasko.usuario.application.port.in.usecases.UsuarioUseCases;
import br.com.wasistemas.tasko.common.response.GeneralApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/usuarios")
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioUseCases usuarioUseCases;
    private final UsuarioWebMapper usuarioWebMapper;

    @PostMapping
    public GeneralApiResponse<UsuarioResponse> adicionar(@RequestBody UsuarioRequest usuarioRequest) {
        var usuarioEntity = usuarioWebMapper.toEntity(usuarioRequest);
        var saved = usuarioUseCases.adicionar(usuarioEntity);
        return GeneralApiResponse.<UsuarioResponse>builder()
                .status(HttpStatus.OK.value())
                .data(usuarioWebMapper.toResponse(saved))
                .build();
    }

    @GetMapping
    public GeneralApiResponse<List<UsuarioResponse>> listar() {
        var usuarios = usuarioUseCases.listar();
        var responses = usuarios.stream().map(usuarioWebMapper::toResponse).toList();
        return GeneralApiResponse.<List<UsuarioResponse>>builder()
                .status(HttpStatus.OK.value())
                .data(responses)
                .build();
    }

    @GetMapping("/{id}")
    public GeneralApiResponse<UsuarioResponse> obterPorId(@PathVariable Long id) {
        var usuario = usuarioUseCases.obterPorId(id);
        return GeneralApiResponse.<UsuarioResponse>builder()
                .status(HttpStatus.OK.value())
                .data(usuarioWebMapper.toResponse(usuario))
                .build();
    }

    @DeleteMapping("/{id}")
    public GeneralApiResponse<Void> excluirPorId(@PathVariable Long id) {
        usuarioUseCases.excluirPorId(id);
        return GeneralApiResponse.<Void>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
