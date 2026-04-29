package br.com.wassistemas.tasko.empresa.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.exception.ResourceDuplicateException;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.empresa.adapter.in.web.mapper.TabelaPrecoWebMapper;
import br.com.wassistemas.tasko.empresa.adapter.in.web.request.AdicionarTabelaPrecoRequest;
import br.com.wassistemas.tasko.empresa.application.port.in.usecases.TabelaPrecoUseCases;
import br.com.wassistemas.tasko.empresa.domain.tabelapreco.TabelaPreco;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tabelas-preco")
@RequiredArgsConstructor
@Tag(name = "Tabela de Preço", description = "Gerenciamento de Tabelas de Preço")
public class TabelaPrecoController {

  private final TabelaPrecoUseCases useCases;
  private final TabelaPrecoWebMapper webMapper;

  @PostMapping
  @Operation(summary = "Criar novo Tabela de Preço")
  public GeneralApiResponse<TabelaPreco> adicionar(@RequestBody AdicionarTabelaPrecoRequest request,
      @RequestHeader("X-Empresa-Id") Long empresaId)
      throws ResourceDuplicateException {
    return GeneralApiResponse.<TabelaPreco>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.adicionar(empresaId, webMapper.toDomain(request)))
        .build();
  }

  @GetMapping
  @Operation(summary = "Listar Tabela de Preço")
  public GeneralApiResponse<List<TabelaPreco>> listar(
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "10") int size,
      @RequestParam(defaultValue = "id") String sortBy,
      @RequestParam(defaultValue = "asc") String sortDirection,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<List<TabelaPreco>>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.listar(empresaId, Paginacao.builder()
            .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
            .build()))
        .build();
  }

  @GetMapping("/{id}")
  @Operation(summary = "Buscar Tabela de Preço por ID")
  public GeneralApiResponse<TabelaPreco> obterPorId(@PathVariable Long id,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<TabelaPreco>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.obterPorId(empresaId, id))
        .build();
  }

  @DeleteMapping("/{id}")
  @Operation(summary = "Excluir Tabela de Preço por ID")
  public GeneralApiResponse<TabelaPreco> excluirPorId(@PathVariable Long id,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    useCases.excluirPorId(empresaId, id);
    return GeneralApiResponse.<TabelaPreco>builder()
        .status(HttpStatus.OK.value())
        .build();
  }
}
