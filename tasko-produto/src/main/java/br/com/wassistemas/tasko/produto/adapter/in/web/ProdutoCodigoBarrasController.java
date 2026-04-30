package br.com.wassistemas.tasko.produto.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.exception.ResourceDuplicateException;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.produto.adapter.in.web.mapper.ProdutoCodigoBarrasWebMapper;
import br.com.wassistemas.tasko.produto.adapter.in.web.request.AdicionarProdutoCodigoBarrasRequest;
import br.com.wassistemas.tasko.produto.application.port.in.usecases.ProdutoCodigoBarrasUseCases;
import br.com.wassistemas.tasko.produto.domain.produtocodigobarras.ProdutoCodigoBarras;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produtos/codigos-barras")
@RequiredArgsConstructor
@Tag(name = "Produto Código de Barras", description = "Gerenciamento de Códigos de Barras dos Produtos")
public class ProdutoCodigoBarrasController {

  private final ProdutoCodigoBarrasUseCases useCases;
  private final ProdutoCodigoBarrasWebMapper webMapper;

  @PostMapping
  @Operation(summary = "Criar novo Produto Código de Barras")
  public GeneralApiResponse<ProdutoCodigoBarras> adicionar(
      @RequestBody AdicionarProdutoCodigoBarrasRequest request) throws ResourceDuplicateException {
    return GeneralApiResponse.<ProdutoCodigoBarras>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.adicionar(webMapper.toDomain(request)))
        .build();
  }

  @GetMapping
  @Operation(summary = "Listar Produto Código de Barras")
  public GeneralApiResponse<List<ProdutoCodigoBarras>> listar(
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "10") int size,
      @RequestParam(defaultValue = "id") String sortBy,
      @RequestParam(defaultValue = "asc") String sortDirection) {
    return GeneralApiResponse.<List<ProdutoCodigoBarras>>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.listar(Paginacao.builder()
            .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
            .build()))
        .build();
  }

  @GetMapping("/{id}")
  @Operation(summary = "Buscar Produto Código de Barras por ID")
  public GeneralApiResponse<ProdutoCodigoBarras> obterPorId(@PathVariable Long id) {
    return GeneralApiResponse.<ProdutoCodigoBarras>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.obterPorId(id))
        .build();
  }

  @DeleteMapping("/{id}")
  @Operation(summary = "Excluir Produto Código de Barras por ID")
  public GeneralApiResponse<ProdutoCodigoBarras> excluirPorId(@PathVariable Long id) {
    useCases.excluirPorId(id);
    return GeneralApiResponse.<ProdutoCodigoBarras>builder()
        .status(HttpStatus.OK.value())
        .build();
  }
}
