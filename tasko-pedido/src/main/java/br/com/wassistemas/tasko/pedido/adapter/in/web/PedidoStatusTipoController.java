package br.com.wassistemas.tasko.pedido.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.pedido.adapter.in.web.mapper.PedidoStatusTipoWebMapper;
import br.com.wassistemas.tasko.pedido.adapter.in.web.request.AdicionarPedidoStatusTipoRequest;
import br.com.wassistemas.tasko.pedido.application.port.in.usecases.PedidoStatusTipoUseCases;
import br.com.wassistemas.tasko.pedido.domain.pedidostatustipo.PedidoStatusTipo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pedidos/status-tipos")
@RequiredArgsConstructor
@Tag(name = "Pedido Status Tipo", description = "Gerenciamento de Tipos de Status do Pedido")
public class PedidoStatusTipoController {
    private final PedidoStatusTipoUseCases useCases;
    private final PedidoStatusTipoWebMapper webMapper;

    @PostMapping
    @Operation(summary = "Criar novo Pedido Status Tipo")
    public GeneralApiResponse<PedidoStatusTipo> adicionar(@RequestBody AdicionarPedidoStatusTipoRequest request) {
        return GeneralApiResponse.<PedidoStatusTipo>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.adicionar(webMapper.toDomain(request)))
                .build();
    }

    @GetMapping
    @Operation(summary = "Listar Pedido Status Tipo")
    public GeneralApiResponse<List<PedidoStatusTipo>> listar(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<PedidoStatusTipo>>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.listar(Paginacao.builder()
                        .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar Pedido Status Tipo por ID")
    public GeneralApiResponse<PedidoStatusTipo> obterPorId(@PathVariable Long id) {
        return GeneralApiResponse.<PedidoStatusTipo>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.obterPorId(id))
                .build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Excluir Pedido Status Tipo por ID")
    public GeneralApiResponse<PedidoStatusTipo> excluirPorId(@PathVariable Long id) {
        useCases.excluirPorId(id);
        return GeneralApiResponse.<PedidoStatusTipo>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
