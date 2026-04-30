package br.com.wassistemas.tasko.pedido.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.exception.ResourceDuplicateException;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.pedido.adapter.in.web.mapper.CondicaoPagamentoWebMapper;
import br.com.wassistemas.tasko.pedido.adapter.in.web.request.AdicionarCondicaoPagamentoRequest;
import br.com.wassistemas.tasko.pedido.application.port.in.usecases.CondicaoPagamentoUseCases;
import br.com.wassistemas.tasko.pedido.domain.condicaopagamento.CondicaoPagamento;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/condicoes-pagamento")
@RequiredArgsConstructor
@Tag(name = "Condição de Pagamento", description = "Gerenciamento de Condições de Pagamento")
public class CondicaoPagamentoController {

  private final CondicaoPagamentoUseCases useCases;
  private final CondicaoPagamentoWebMapper webMapper;

  @PostMapping
  @Operation(summary = "Criar novo Condição de Pagamento")
  public GeneralApiResponse<CondicaoPagamento> adicionar(
      @RequestBody AdicionarCondicaoPagamentoRequest request,
      @RequestHeader("X-Empresa-Id") Long empresaId) throws ResourceDuplicateException {
    return GeneralApiResponse.<CondicaoPagamento>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.adicionar(empresaId, webMapper.toDomain(empresaId, request)))
        .build();
  }

  @GetMapping
  @Operation(summary = "Listar Condição de Pagamento")
  public GeneralApiResponse<List<CondicaoPagamento>> listar(
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "10") int size,
      @RequestParam(defaultValue = "id") String sortBy,
      @RequestParam(defaultValue = "asc") String sortDirection,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<List<CondicaoPagamento>>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.listar(empresaId, Paginacao.builder()
            .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
            .build()))
        .build();
  }

  @GetMapping("/{id}")
  @Operation(summary = "Buscar Condição de Pagamento por ID")
  public GeneralApiResponse<CondicaoPagamento> obterPorId(@PathVariable Long id,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<CondicaoPagamento>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.obterPorId(empresaId, id))
        .build();
  }

  @DeleteMapping("/{id}")
  @Operation(summary = "Excluir Condição de Pagamento por ID")
  public GeneralApiResponse<CondicaoPagamento> excluirPorId(@PathVariable Long id,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    useCases.excluirPorId(empresaId, id);
    return GeneralApiResponse.<CondicaoPagamento>builder()
        .status(HttpStatus.OK.value())
        .build();
  }
}
