package br.com.wasistemas.tasko.usuario.adapter.in.web;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.common.response.GeneralApiResponse;
import br.com.wasistemas.tasko.usuario.adapter.in.web.mapper.UsuarioWebMapper;
import br.com.wasistemas.tasko.usuario.adapter.in.web.request.AdicionarUsuarioPerfilTipoRequest;
import br.com.wasistemas.tasko.usuario.adapter.in.web.response.UsuarioPerfilTipoResponse;
import br.com.wasistemas.tasko.usuario.application.port.in.usecases.UsuarioPerfilTipoUseCases;
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
@RequestMapping("/api/v1/perfil-tipo")
@RequiredArgsConstructor
public class UsuarioPerfilTipoController {

  private final UsuarioPerfilTipoUseCases usuarioPerfilTipoUseCases;
  private final UsuarioWebMapper usuarioWebMapper;

  @PostMapping
  public GeneralApiResponse<UsuarioPerfilTipoResponse> adicionar(@PathVariable Long usuarioId,
      @RequestBody AdicionarUsuarioPerfilTipoRequest request) {
    return GeneralApiResponse.<UsuarioPerfilTipoResponse>builder().status(HttpStatus.OK.value()).data(
        usuarioWebMapper.toResponse(
            usuarioPerfilTipoUseCases.adicionar(usuarioWebMapper.toDomain(request)))).build();
  }

  @GetMapping
  public GeneralApiResponse<List<UsuarioPerfilTipoResponse>> listar(@PathVariable Long usuarioId,
      @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size,
      @RequestParam(defaultValue = "id") String sortBy,
      @RequestParam(defaultValue = "asc") String sortDirection) {

    return GeneralApiResponse.<List<UsuarioPerfilTipoResponse>>builder().status(HttpStatus.OK.value())
        .data(usuarioWebMapper.toUsuarioPerfilTipoResponse(usuarioPerfilTipoUseCases.listar(
            Paginacao.builder().page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
                .build()))).build();
  }

  @GetMapping("/{id}")
  public GeneralApiResponse<UsuarioPerfilTipoResponse> obterPorId(@PathVariable Long usuarioId,
      @PathVariable Long id) {
    return GeneralApiResponse.<UsuarioPerfilTipoResponse>builder().status(HttpStatus.OK.value())
        .data(usuarioWebMapper.toResponse(usuarioPerfilTipoUseCases.obterPorId(id))).build();
  }

  @DeleteMapping("/{id}")
  public GeneralApiResponse<Void> excluirPorId(@PathVariable Long usuarioId,
      @PathVariable Long id) {
    usuarioPerfilTipoUseCases.excluirPorId(id);
    return GeneralApiResponse.<Void>builder().status(HttpStatus.OK.value()).build();
  }
}
