package br.com.wassistemas.tasko.pedido.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.exception.ResourceDuplicateException;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.pedido.adapter.in.web.mapper.FormaPagamentoWebMapper;
import br.com.wassistemas.tasko.pedido.adapter.in.web.request.AdicionarFormaPagamentoRequest;
import br.com.wassistemas.tasko.pedido.application.port.in.usecases.FormaPagamentoUseCases;
import br.com.wassistemas.tasko.pedido.domain.formapagamento.FormaPagamento;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/formas-pagamento")
@RequiredArgsConstructor
@Tag(name = "Forma de Pagamento", description = "Gerenciamento de Formas de Pagamento")
public class FormaPagamentoController {

  private final FormaPagamentoUseCases useCases;
  private final FormaPagamentoWebMapper webMapper;

  @PostMapping
  @Operation(summary = "Criar novo Forma de Pagamento")
  public GeneralApiResponse<FormaPagamento> adicionar(
      @RequestBody AdicionarFormaPagamentoRequest request,
      @RequestHeader("X-Empresa-Id") Long empresaId) throws ResourceDuplicateException {
    return GeneralApiResponse.<FormaPagamento>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.adicionar(webMapper.toDomain(empresaId, request)))
        .build();
  }

  @GetMapping
  @Operation(summary = "Listar Forma de Pagamento")
  public GeneralApiResponse<List<FormaPagamento>> listar(
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "10") int size,
      @RequestParam(defaultValue = "id") String sortBy,
      @RequestParam(defaultValue = "asc") String sortDirection,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<List<FormaPagamento>>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.listar(Paginacao.builder()
            .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
            .build()))
        .build();
  }

  @GetMapping("/{id}")
  @Operation(summary = "Buscar Forma de Pagamento por ID")
  public GeneralApiResponse<FormaPagamento> obterPorId(@PathVariable Long id,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<FormaPagamento>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.obterPorId(id))
        .build();
  }

  @DeleteMapping("/{id}")
  @Operation(summary = "Excluir Forma de Pagamento por ID")
  public GeneralApiResponse<FormaPagamento> excluirPorId(@PathVariable Long id,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    useCases.excluirPorId(id);
    return GeneralApiResponse.<FormaPagamento>builder()
        .status(HttpStatus.OK.value())
        .build();
  }
}
