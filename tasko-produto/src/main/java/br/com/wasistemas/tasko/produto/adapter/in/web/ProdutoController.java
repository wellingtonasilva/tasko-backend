package br.com.wasistemas.tasko.produto.adapter.in.web;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.common.response.GeneralApiResponse;
import br.com.wasistemas.tasko.produto.adapter.in.web.mapper.ProdutoWebMapper;
import br.com.wasistemas.tasko.produto.adapter.in.web.request.AdicionarProdutoRequest;
import br.com.wasistemas.tasko.produto.application.port.in.usecases.ProdutoUseCases;
import br.com.wasistemas.tasko.produto.domain.produto.Produto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produtos")
@RequiredArgsConstructor
@Tag(name = "Produtos", description = "Gerenciamento de Produtos")
public class ProdutoController {
    private final ProdutoUseCases useCases;
    private final ProdutoWebMapper webMapper;

    @PostMapping
    @Operation(summary = "Criar novo Produtos")
    public GeneralApiResponse<Produto> adicionar(@RequestBody AdicionarProdutoRequest request) {
        return GeneralApiResponse.<Produto>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.adicionar(webMapper.toDomain(request)))
                .build();
    }

    @GetMapping
    @Operation(summary = "Listar Produtos")
    public GeneralApiResponse<List<Produto>> listar(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<Produto>>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.listar(Paginacao.builder()
                        .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar Produtos por ID")
    public GeneralApiResponse<Produto> obterPorId(@PathVariable Long id) {
        return GeneralApiResponse.<Produto>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.obterPorId(id))
                .build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Excluir Produtos por ID")
    public GeneralApiResponse<Produto> excluirPorId(@PathVariable Long id) {
        useCases.excluirPorId(id);
        return GeneralApiResponse.<Produto>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
