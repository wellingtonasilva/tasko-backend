package br.com.wassistemas.tasko.cliente.adapter.in.web;

import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.cliente.adapter.in.web.mapper.ClienteWebMapper;
import br.com.wassistemas.tasko.cliente.adapter.in.web.request.AdicionarClienteRequest;
import br.com.wassistemas.tasko.cliente.application.port.in.usecases.ClienteUseCases;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.cliente.domain.cliente.Cliente;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clientes")
@RequiredArgsConstructor
@Tag(name = "Clientes", description = "Gerenciamento de Clientes")
public class ClienteController {

  private final ClienteUseCases clienteUseCases;
  private final ClienteWebMapper clienteWebMapper;

  @PostMapping
  @Operation(summary = "Criar novo Cliente")
  public GeneralApiResponse<Cliente> adicionar(@RequestBody AdicionarClienteRequest request)
      throws Exception {
    return GeneralApiResponse.<Cliente>builder()
        .status(HttpStatus.OK.value())
        .data(clienteUseCases.adicionar(clienteWebMapper.toDomain(request)))
        .build();
  }

  @GetMapping
  @Operation(summary = "Lista de Clientes", description = "Retorna lista paginada de Clientes")
  public GeneralApiResponse<List<Cliente>> listar(@RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "10") int size,
      @RequestParam(defaultValue = "id") String sortBy,
      @RequestParam(defaultValue = "asc") String sortDirection) {
    return GeneralApiResponse.<List<Cliente>>builder()
        .status(HttpStatus.OK.value())
        .data(clienteUseCases.listar(Paginacao.builder()
            .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
            .build()))
        .build();
  }

  @GetMapping("/{id}")
  @Operation(summary = "Buscar Cliente por ID")
  public GeneralApiResponse<Cliente> obterPorId(@PathVariable Long id) {
    return GeneralApiResponse.<Cliente>builder()
        .status(HttpStatus.OK.value())
        .data(clienteUseCases.obterPorId(id))
        .build();
  }

  @DeleteMapping("/{id}")
  @Operation(summary = "Excluir Cliente por ID")
  public GeneralApiResponse<Cliente> excluirPorId(@PathVariable Long id) {
    clienteUseCases.excluirPorId(id);
    return GeneralApiResponse.<Cliente>builder()
        .status(HttpStatus.OK.value())
        .build();
  }
}

