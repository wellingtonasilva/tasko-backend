package br.com.wasistemas.tasko.produto.adapter.in.web;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.common.response.GeneralApiResponse;
import br.com.wasistemas.tasko.produto.adapter.in.web.mapper.ProdutoPrecoWebMapper;
import br.com.wasistemas.tasko.produto.adapter.in.web.request.AdicionarProdutoPrecoRequest;
import br.com.wasistemas.tasko.produto.application.port.in.usecases.ProdutoPrecoUseCases;
import br.com.wasistemas.tasko.produto.domain.produtopreco.ProdutoPreco;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produtos/precos")
@RequiredArgsConstructor
@Tag(name = "Produto Preços", description = "Gerenciamento de Preços dos Produtos")
public class ProdutoPrecoController {
    private final ProdutoPrecoUseCases useCases;
    private final ProdutoPrecoWebMapper webMapper;

    @PostMapping
    @Operation(summary = "Criar novo Produto Preços")
    public GeneralApiResponse<ProdutoPreco> adicionar(@RequestBody AdicionarProdutoPrecoRequest request) {
        return GeneralApiResponse.<ProdutoPreco>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.adicionar(webMapper.toDomain(request)))
                .build();
    }

    @GetMapping
    @Operation(summary = "Listar Produto Preços")
    public GeneralApiResponse<List<ProdutoPreco>> listar(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<ProdutoPreco>>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.listar(Paginacao.builder()
                        .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar Produto Preços por ID")
    public GeneralApiResponse<ProdutoPreco> obterPorId(@PathVariable Long id) {
        return GeneralApiResponse.<ProdutoPreco>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.obterPorId(id))
                .build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Excluir Produto Preços por ID")
    public GeneralApiResponse<ProdutoPreco> excluirPorId(@PathVariable Long id) {
        useCases.excluirPorId(id);
        return GeneralApiResponse.<ProdutoPreco>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
