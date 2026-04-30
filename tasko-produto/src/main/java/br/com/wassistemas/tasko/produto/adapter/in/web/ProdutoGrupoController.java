package br.com.wassistemas.tasko.produto.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.exception.ResourceDuplicateException;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.produto.adapter.in.web.mapper.ProdutoGrupoWebMapper;
import br.com.wassistemas.tasko.produto.adapter.in.web.request.AdicionarProdutoGrupoRequest;
import br.com.wassistemas.tasko.produto.application.port.in.usecases.ProdutoGrupoUseCases;
import br.com.wassistemas.tasko.produto.domain.grupo.ProdutoGrupo;
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
  public GeneralApiResponse<ProdutoGrupo> adicionar(
      @RequestBody AdicionarProdutoGrupoRequest request,
      @RequestHeader("X-Empresa-Id") Long empresaId) throws ResourceDuplicateException {
    return GeneralApiResponse.<ProdutoGrupo>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.adicionar(empresaId, webMapper.toDomain(empresaId, request)))
        .build();
  }

  @GetMapping
  @Operation(summary = "Listar Produto Grupo")
  public GeneralApiResponse<List<ProdutoGrupo>> listar(
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "10") int size,
      @RequestParam(defaultValue = "id") String sortBy,
      @RequestParam(defaultValue = "asc") String sortDirection,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<List<ProdutoGrupo>>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.listar(empresaId, Paginacao.builder()
            .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
            .build()))
        .build();
  }

  @GetMapping("/{id}")
  @Operation(summary = "Buscar Produto Grupo por ID")
  public GeneralApiResponse<ProdutoGrupo> obterPorId(@PathVariable Long id,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<ProdutoGrupo>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.obterPorId(empresaId, id))
        .build();
  }

  @DeleteMapping("/{id}")
  @Operation(summary = "Excluir Produto Grupo por ID")
  public GeneralApiResponse<ProdutoGrupo> excluirPorId(@PathVariable Long id,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    useCases.excluirPorId(empresaId, id);
    return GeneralApiResponse.<ProdutoGrupo>builder()
        .status(HttpStatus.OK.value())
        .build();
  }
}
