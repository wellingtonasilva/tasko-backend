package br.com.wasistemas.tasko.pedido.adapter.in.web;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.common.response.GeneralApiResponse;
import br.com.wasistemas.tasko.pedido.adapter.in.web.mapper.PedidoItemWebMapper;
import br.com.wasistemas.tasko.pedido.adapter.in.web.request.AdicionarPedidoItemRequest;
import br.com.wasistemas.tasko.pedido.application.port.in.usecases.PedidoItemUseCases;
import br.com.wasistemas.tasko.pedido.domain.pedidoitem.PedidoItem;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pedidos/itens")
@RequiredArgsConstructor
@Tag(name = "Pedido Itens", description = "Gerenciamento de Itens do Pedido")
public class PedidoItemController {
    private final PedidoItemUseCases useCases;
    private final PedidoItemWebMapper webMapper;

    @PostMapping
    @Operation(summary = "Criar novo Pedido Itens")
    public GeneralApiResponse<PedidoItem> adicionar(@RequestBody AdicionarPedidoItemRequest request) {
        return GeneralApiResponse.<PedidoItem>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.adicionar(webMapper.toDomain(request)))
                .build();
    }

    @GetMapping
    @Operation(summary = "Listar Pedido Itens")
    public GeneralApiResponse<List<PedidoItem>> listar(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<PedidoItem>>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.listar(Paginacao.builder()
                        .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar Pedido Itens por ID")
    public GeneralApiResponse<PedidoItem> obterPorId(@PathVariable Long id) {
        return GeneralApiResponse.<PedidoItem>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.obterPorId(id))
                .build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Excluir Pedido Itens por ID")
    public GeneralApiResponse<PedidoItem> excluirPorId(@PathVariable Long id) {
        useCases.excluirPorId(id);
        return GeneralApiResponse.<PedidoItem>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
