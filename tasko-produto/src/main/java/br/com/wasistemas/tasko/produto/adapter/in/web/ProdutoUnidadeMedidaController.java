package br.com.wasistemas.tasko.produto.adapter.in.web;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.common.response.GeneralApiResponse;
import br.com.wasistemas.tasko.produto.adapter.in.web.mapper.ProdutoUnidadeMedidaWebMapper;
import br.com.wasistemas.tasko.produto.adapter.in.web.request.AdicionarProdutoUnidadeMedidaRequest;
import br.com.wasistemas.tasko.produto.application.port.in.usecases.ProdutoUnidadeMedidaUseCases;
import br.com.wasistemas.tasko.produto.domain.unidademedida.ProdutoUnidadeMedida;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produtos/unidades-medida")
@RequiredArgsConstructor
@Tag(name = "Unidade de Medida", description = "Gerenciamento de Unidades de Medida")
public class ProdutoUnidadeMedidaController {
    private final ProdutoUnidadeMedidaUseCases useCases;
    private final ProdutoUnidadeMedidaWebMapper webMapper;

    @PostMapping
    @Operation(summary = "Criar novo Unidade de Medida")
    public GeneralApiResponse<ProdutoUnidadeMedida> adicionar(@RequestBody AdicionarProdutoUnidadeMedidaRequest request) {
        return GeneralApiResponse.<ProdutoUnidadeMedida>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.adicionar(webMapper.toDomain(request)))
                .build();
    }

    @GetMapping
    @Operation(summary = "Listar Unidade de Medida")
    public GeneralApiResponse<List<ProdutoUnidadeMedida>> listar(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<ProdutoUnidadeMedida>>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.listar(Paginacao.builder()
                        .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar Unidade de Medida por ID")
    public GeneralApiResponse<ProdutoUnidadeMedida> obterPorId(@PathVariable Long id) {
        return GeneralApiResponse.<ProdutoUnidadeMedida>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.obterPorId(id))
                .build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Excluir Unidade de Medida por ID")
    public GeneralApiResponse<ProdutoUnidadeMedida> excluirPorId(@PathVariable Long id) {
        useCases.excluirPorId(id);
        return GeneralApiResponse.<ProdutoUnidadeMedida>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
