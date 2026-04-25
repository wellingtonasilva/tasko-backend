package br.com.wassistemas.tasko.usuario.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.usuario.adapter.in.web.mapper.UsuarioWebMapper;
import br.com.wassistemas.tasko.usuario.adapter.in.web.request.AdicionarUsuarioEmpresaRequest;
import br.com.wassistemas.tasko.usuario.adapter.in.web.response.UsuarioEmpresaResponse;
import br.com.wassistemas.tasko.common.usecases.usuario.UsuarioEmpresaUseCases;
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
public class UsuarioEmpresaController {

  private final UsuarioEmpresaUseCases usuarioEmpresaUseCases;
  private final UsuarioWebMapper usuarioWebMapper;

  @PostMapping("/{usuarioId}/empresas")
  public GeneralApiResponse<UsuarioEmpresaResponse> adicionar(@PathVariable Long usuarioId,
      @RequestBody AdicionarUsuarioEmpresaRequest request) {
    return GeneralApiResponse.<UsuarioEmpresaResponse>builder().status(HttpStatus.OK.value()).data(
        usuarioWebMapper.toResponse(
            usuarioEmpresaUseCases.adicionar(usuarioWebMapper.toDomain(request)))).build();
  }

  @GetMapping("/{usuarioId}/empresas")
  public GeneralApiResponse<List<UsuarioEmpresaResponse>> listar(@PathVariable Long usuarioId,
      @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size,
      @RequestParam(defaultValue = "id") String sortBy,
      @RequestParam(defaultValue = "asc") String sortDirection) {

    return GeneralApiResponse.<List<UsuarioEmpresaResponse>>builder().status(HttpStatus.OK.value())
        .data(usuarioWebMapper.toUsuarioEmpresaResponse(usuarioEmpresaUseCases.listar(
            Paginacao.builder().page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
                .build()))).build();
  }

  @GetMapping("/{usuarioId}/empresas/{id}")
  public GeneralApiResponse<UsuarioEmpresaResponse> obterPorId(@PathVariable Long usuarioId,
      @PathVariable Long id) {
    return GeneralApiResponse.<UsuarioEmpresaResponse>builder().status(HttpStatus.OK.value())
        .data(usuarioWebMapper.toResponse(usuarioEmpresaUseCases.obterPorId(id))).build();
  }

  @DeleteMapping("/{usuarioId}/empresas/{id}")
  public GeneralApiResponse<Void> excluirPorId(@PathVariable Long usuarioId,
      @PathVariable Long id) {
    usuarioEmpresaUseCases.excluirPorId(id);
    return GeneralApiResponse.<Void>builder().status(HttpStatus.OK.value()).build();
  }
}
