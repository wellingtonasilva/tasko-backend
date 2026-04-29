package br.com.wassistemas.tasko.pedido.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.exception.ResourceDuplicateException;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.pedido.adapter.in.web.mapper.PedidoWebMapper;
import br.com.wassistemas.tasko.pedido.adapter.in.web.request.AdicionarPedidoRequest;
import br.com.wassistemas.tasko.pedido.application.port.in.usecases.PedidoUseCases;
import br.com.wassistemas.tasko.pedido.domain.pedido.Pedido;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pedidos")
@RequiredArgsConstructor
@Tag(name = "Pedidos", description = "Gerenciamento de Pedidos")
public class PedidoController {

  private final PedidoUseCases useCases;
  private final PedidoWebMapper webMapper;

  @PostMapping
  @Operation(summary = "Criar novo Pedidos")
  public GeneralApiResponse<Pedido> adicionar(@RequestBody AdicionarPedidoRequest request,
      @RequestHeader("X-Empresa-Id") Long empresaId)
      throws ResourceDuplicateException {
    return GeneralApiResponse.<Pedido>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.adicionar(empresaId, webMapper.toDomain(request)))
        .build();
  }

  @GetMapping
  @Operation(summary = "Listar Pedidos")
  public GeneralApiResponse<List<Pedido>> listar(
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "10") int size,
      @RequestParam(defaultValue = "id") String sortBy,
      @RequestParam(defaultValue = "asc") String sortDirection,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<List<Pedido>>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.listar(empresaId, Paginacao.builder()
            .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
            .build()))
        .build();
  }

  @GetMapping("/{id}")
  @Operation(summary = "Buscar Pedidos por ID")
  public GeneralApiResponse<Pedido> obterPorId(@PathVariable Long id,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<Pedido>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.obterPorId(empresaId, id))
        .build();
  }

  @DeleteMapping("/{id}")
  @Operation(summary = "Excluir Pedidos por ID")
  public GeneralApiResponse<Pedido> excluirPorId(@PathVariable Long id,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    useCases.excluirPorId(empresaId, id);
    return GeneralApiResponse.<Pedido>builder()
        .status(HttpStatus.OK.value())
        .build();
  }
}
