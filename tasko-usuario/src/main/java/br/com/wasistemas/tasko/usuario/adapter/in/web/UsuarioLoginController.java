package br.com.wasistemas.tasko.usuario.adapter.in.web;

import br.com.wasistemas.tasko.common.response.GeneralApiResponse;
import br.com.wasistemas.tasko.usuario.adapter.in.web.mapper.UsuarioWebMapper;
import br.com.wasistemas.tasko.usuario.adapter.in.web.request.LoginRequest;
import br.com.wasistemas.tasko.usuario.adapter.in.web.response.UsuarioLoginResponse;
import br.com.wasistemas.tasko.usuario.application.port.in.usecases.UsuarioLoginUseCases;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/login")
@RequiredArgsConstructor
public class UsuarioLoginController {

  private final UsuarioLoginUseCases usuarioLoginuseCases;
  private final UsuarioWebMapper usuarioWebMapper;

  @PostMapping
  public GeneralApiResponse<UsuarioLoginResponse> login(@RequestBody LoginRequest request) {
    return GeneralApiResponse.<UsuarioLoginResponse>builder()
        .status(HttpStatus.OK.value())
        .data(usuarioWebMapper.toResponse(
            usuarioLoginuseCases.login(usuarioWebMapper.toDomain(request))))
        .build();
  }
}
