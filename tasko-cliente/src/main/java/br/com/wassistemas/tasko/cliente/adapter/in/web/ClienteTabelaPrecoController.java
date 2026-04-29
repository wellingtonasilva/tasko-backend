package br.com.wassistemas.tasko.cliente.adapter.in.web;

import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.cliente.adapter.in.web.mapper.ClienteTabelaPrecoWebMapper;
import br.com.wassistemas.tasko.cliente.adapter.in.web.request.AdicionarClienteTabelaPrecoRequest;
import br.com.wassistemas.tasko.cliente.application.port.in.usecases.ClienteTabelaPrecoUseCases;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.cliente.domain.tabelapreco.ClienteTabelaPreco;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clientes-tabela-preco")
@RequiredArgsConstructor
@Tag(name = "Cliente Tabela de Preço", description = "Vinculação de Tabelas de Preço a Clientes")
public class ClienteTabelaPrecoController {

  private final ClienteTabelaPrecoUseCases useCases;
  private final ClienteTabelaPrecoWebMapper webMapper;

  @PostMapping
  @Operation(summary = "Vincular Tabela de Preço ao Cliente")
  public GeneralApiResponse<ClienteTabelaPreco> adicionar(
      @RequestBody AdicionarClienteTabelaPrecoRequest request,
      @RequestHeader("X-Empresa-Id") Long empresaId) throws Exception {
    return GeneralApiResponse.<ClienteTabelaPreco>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.adicionar(empresaId, webMapper.toDomain(request)))
        .build();
  }

  @GetMapping
  @Operation(summary = "Listar vinculações de Tabelas de Preço")
  public GeneralApiResponse<List<ClienteTabelaPreco>> listar(
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "10") int size,
      @RequestParam(defaultValue = "id") String sortBy,
      @RequestParam(defaultValue = "asc") String sortDirection,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<List<ClienteTabelaPreco>>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.listar(empresaId, Paginacao.builder()
            .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
            .build()))
        .build();
  }

  @GetMapping("/{id}")
  @Operation(summary = "Buscar vinculação por ID")
  public GeneralApiResponse<ClienteTabelaPreco> obterPorId(@PathVariable Long id,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<ClienteTabelaPreco>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.obterPorId(empresaId, id))
        .build();
  }

  @DeleteMapping("/{id}")
  @Operation(summary = "Remover vinculação por ID")
  public GeneralApiResponse<ClienteTabelaPreco> excluirPorId(@PathVariable Long id,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    useCases.excluirPorId(empresaId, id);
    return GeneralApiResponse.<ClienteTabelaPreco>builder()
        .status(HttpStatus.OK.value())
        .build();
  }
}

