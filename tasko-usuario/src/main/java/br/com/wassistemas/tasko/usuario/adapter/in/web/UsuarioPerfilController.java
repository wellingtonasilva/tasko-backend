package br.com.wassistemas.tasko.usuario.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.usuario.adapter.in.web.mapper.UsuarioWebMapper;
import br.com.wassistemas.tasko.usuario.adapter.in.web.request.AdicionarUsuarioPerfilRequest;
import br.com.wassistemas.tasko.usuario.adapter.in.web.response.UsuarioPerfilResponse;
import br.com.wassistemas.tasko.usuario.application.port.in.usecases.UsuarioPerfilUseCases;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/usuarios")
@RequiredArgsConstructor
public class UsuarioPerfilController {

  private final UsuarioWebMapper usuarioWebMapper;
  private final UsuarioPerfilUseCases usuarioPerfilUseCases;

  @PostMapping("/{usuarioId}/perfil")
  public GeneralApiResponse<UsuarioPerfilResponse> adicionar(@PathVariable Long usuarioId,
      @RequestBody AdicionarUsuarioPerfilRequest request) {
    return GeneralApiResponse.<UsuarioPerfilResponse>builder().status(HttpStatus.OK.value()).data(
        usuarioWebMapper.toResponse(
            usuarioPerfilUseCases.adicionar(usuarioWebMapper.toDomain(request)))).build();
  }

  @GetMapping("/{usuarioId}/perfil")
  public GeneralApiResponse<List<UsuarioPerfilResponse>> listar(@PathVariable Long usuarioId,
      @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size,
      @RequestParam(defaultValue = "id") String sortBy,
      @RequestParam(defaultValue = "asc") String sortDirection) {

    return GeneralApiResponse.<List<UsuarioPerfilResponse>>builder().status(HttpStatus.OK.value())
        .data(usuarioWebMapper.toUsuarioPerfilResponse(usuarioPerfilUseCases.listar(
            Paginacao.builder().page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
                .build()))).build();
  }

  @GetMapping("/{usuarioId}/perfil/{id}")
  public GeneralApiResponse<UsuarioPerfilResponse> obterPorId(@PathVariable Long usuarioId,
      @PathVariable Long id) {
    return GeneralApiResponse.<UsuarioPerfilResponse>builder().status(HttpStatus.OK.value())
        .data(usuarioWebMapper.toResponse(usuarioPerfilUseCases.obterPorId(id))).build();
  }

  @DeleteMapping("/{usuarioId}/perfil/{id}")
  public GeneralApiResponse<Void> excluirPorId(@PathVariable Long usuarioId,
      @PathVariable Long id) {
    usuarioPerfilUseCases.excluirPorId(id);
    return GeneralApiResponse.<Void>builder().status(HttpStatus.OK.value()).build();
  }
}
