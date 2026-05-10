package br.com.wassistemas.tasko.produto.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.exception.ResourceDuplicateException;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.produto.adapter.in.web.mapper.ProdutoGrupoWebMapper;
import br.com.wassistemas.tasko.produto.adapter.in.web.request.AdicionarProdutoGrupoRequest;
import br.com.wassistemas.tasko.produto.adapter.in.web.request.AtualizarProdutoGrupoRequest;
import br.com.wassistemas.tasko.produto.adapter.in.web.response.ProdutoGrupoResponse;
import br.com.wassistemas.tasko.produto.application.port.in.usecases.ProdutoGrupoUseCases;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produtos/grupos")
@RequiredArgsConstructor
@Tag(name = "Produto Grupo", description = "Gerenciamento de Grupos de Produto")
public class ProdutoGrupoController {

  private final ProdutoGrupoUseCases useCases;
  private final ProdutoGrupoWebMapper webMapper;

  @PostMapping
  @Operation(summary = "Criar novo Produto Grupo")
  public GeneralApiResponse<ProdutoGrupoResponse> adicionar(
      @RequestBody AdicionarProdutoGrupoRequest request,
      @RequestHeader("X-Empresa-Id") Long empresaId) throws ResourceDuplicateException {
    return GeneralApiResponse.<ProdutoGrupoResponse>builder()
        .status(HttpStatus.OK.value())
        .data(webMapper.toResponse(
            useCases.adicionar(empresaId, webMapper.toDomain(empresaId, request))))
        .build();
  }

  @GetMapping
  @Operation(summary = "Listar Produto Grupo")
  public GeneralApiResponse<List<ProdutoGrupoResponse>> listar(
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "10") int size,
      @RequestParam(defaultValue = "id") String sortBy,
      @RequestParam(defaultValue = "asc") String sortDirection,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<List<ProdutoGrupoResponse>>builder()
        .status(HttpStatus.OK.value())
        .data(webMapper.toList(useCases.listar(empresaId, Paginacao.builder()
            .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
            .build())))
        .build();
  }

  @GetMapping("/{id}")
  @Operation(summary = "Buscar Produto Grupo por ID")
  public GeneralApiResponse<ProdutoGrupoResponse> obterPorId(@PathVariable Long id,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<ProdutoGrupoResponse>builder()
        .status(HttpStatus.OK.value())
        .data(webMapper.toResponse(useCases.obterPorId(empresaId, id)))
        .build();
  }

  @PutMapping("/{id}")
  @Operation(summary = "Buscar Produto Grupo por ID")
  public GeneralApiResponse<ProdutoGrupoResponse> atualizar(@PathVariable Long id,
      @RequestBody AtualizarProdutoGrupoRequest request,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<ProdutoGrupoResponse>builder()
        .status(HttpStatus.OK.value())
        .data(webMapper.toResponse(useCases.atualizar(empresaId, id, webMapper.toDomain(request))))
        .build();
  }

  @DeleteMapping("/{id}")
  @Operation(summary = "Excluir Produto Grupo por ID")
  public GeneralApiResponse<ProdutoGrupoResponse> excluirPorId(@PathVariable Long id,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    useCases.excluirPorId(empresaId, id);
    return GeneralApiResponse.<ProdutoGrupoResponse>builder()
        .status(HttpStatus.OK.value())
        .build();
  }
}
