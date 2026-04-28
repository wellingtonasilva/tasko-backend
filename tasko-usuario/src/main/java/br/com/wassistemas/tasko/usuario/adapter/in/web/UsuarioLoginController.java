package br.com.wassistemas.tasko.usuario.adapter.in.web;

import br.com.wassistemas.tasko.common.exception.ResourceNotFoundException;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.usuario.adapter.in.web.mapper.UsuarioWebMapper;
import br.com.wassistemas.tasko.usuario.adapter.in.web.request.LoginRequest;
import br.com.wassistemas.tasko.usuario.adapter.in.web.request.ResetarSenhaRequest;
import br.com.wassistemas.tasko.usuario.adapter.in.web.request.SolicitacaoRecuperarSenhaRequest;
import br.com.wassistemas.tasko.usuario.adapter.in.web.response.UsuarioLoginResponse;
import br.com.wassistemas.tasko.usuario.application.port.in.usecases.UsuarioLoginUseCases;
import com.mailjet.client.errors.MailjetException;
import jakarta.validation.Valid;
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
  public GeneralApiResponse<UsuarioLoginResponse> login(@RequestBody LoginRequest request)
      throws ResourceNotFoundException {
    return GeneralApiResponse.<UsuarioLoginResponse>builder()
        .status(HttpStatus.OK.value())
        .data(usuarioWebMapper.toResponse(
            usuarioLoginuseCases.login(usuarioWebMapper.toDomain(request))))
        .build();
  }

  @PostMapping("/recuperar-senha")
  public GeneralApiResponse<UsuarioLoginResponse> recuperarSenha(
      @RequestBody @Valid SolicitacaoRecuperarSenhaRequest request) throws MailjetException {
    usuarioLoginuseCases.solicitarRecuperacaoSenha(usuarioWebMapper.toDomain(request));
    return GeneralApiResponse.<UsuarioLoginResponse>builder()
        .status(HttpStatus.OK.value())
        .build();
  }

  @PostMapping("/resetar-senha")
  public GeneralApiResponse<UsuarioLoginResponse> resetarSenha(
      @RequestBody @Valid ResetarSenhaRequest request)
      throws ResourceNotFoundException {
    usuarioLoginuseCases.resetarSenha(usuarioWebMapper.toDomain(request));
    return GeneralApiResponse.<UsuarioLoginResponse>builder()
        .status(HttpStatus.OK.value())
        .build();
  }
}
