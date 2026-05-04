package br.com.wassistemas.tasko.usuario.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.exception.ResourceDuplicateException;
import br.com.wassistemas.tasko.common.exception.UserUnauthorizedException;
import br.com.wassistemas.tasko.usuario.adapter.in.web.request.AdicionarUsuarioRequest;
import br.com.wassistemas.tasko.usuario.adapter.in.web.request.AtualizarUsuarioRequest;
import br.com.wassistemas.tasko.usuario.adapter.in.web.response.UsuarioResponse;
import br.com.wassistemas.tasko.usuario.adapter.in.web.mapper.UsuarioWebMapper;
import br.com.wassistemas.tasko.common.usecases.usuario.UsuarioUseCases;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
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
  public GeneralApiResponse<UsuarioResponse> adicionar(
      @RequestBody AdicionarUsuarioRequest request,
      @RequestHeader("X-Empresa-Id") Long empresaId) throws ResourceDuplicateException {
    return GeneralApiResponse.<UsuarioResponse>builder()
        .status(HttpStatus.OK.value())
        .data(usuarioWebMapper.toResponse(
            usuarioUseCases.adicionarUsuarioComEmpresa(empresaId, usuarioWebMapper.toDomain(request))))
        .build();
  }

  @GetMapping
  public GeneralApiResponse<List<UsuarioResponse>> listar(
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "10") int size,
      @RequestParam(defaultValue = "id") String sortBy,
      @RequestParam(defaultValue = "asc") String sortDirection,
      @RequestHeader("X-Empresa-Id") Long empresaId) throws UserUnauthorizedException {

    return GeneralApiResponse.<List<UsuarioResponse>>builder()
        .status(HttpStatus.OK.value())
        .data(usuarioWebMapper.toResponse(usuarioUseCases.listar(empresaId, Paginacao.builder()
            .page(page)
            .size(size)
            .sortBy(sortBy)
            .sortDirection(sortDirection)
            .build())))
        .build();
  }

  @GetMapping("/{id}")
  public GeneralApiResponse<UsuarioResponse> obterPorId(@PathVariable Long id,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<UsuarioResponse>builder()
        .status(HttpStatus.OK.value())
        .data(usuarioWebMapper.toResponse(usuarioUseCases.obterPorId(empresaId, id)))
        .build();
  }

  @PutMapping("/{id}")
  public GeneralApiResponse<UsuarioResponse> atualizar(@PathVariable Long id,
      @RequestBody AtualizarUsuarioRequest request,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<UsuarioResponse>builder()
        .status(HttpStatus.OK.value())
        .data(usuarioWebMapper.toResponse(
            usuarioUseCases.atualizar(empresaId, id, usuarioWebMapper.toDomain(request))))
        .build();
  }

  @DeleteMapping("/{id}")
  public GeneralApiResponse<Void> excluirPorId(@PathVariable Long id,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    usuarioUseCases.excluirPorId(empresaId, id);
    return GeneralApiResponse.<Void>builder()
        .status(HttpStatus.OK.value())
        .build();
  }
}
