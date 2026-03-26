package br.com.wasistemas.tasko.produto.adapter.in.web;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.common.response.GeneralApiResponse;
import br.com.wasistemas.tasko.produto.adapter.in.web.mapper.ProdutoSubgrupoWebMapper;
import br.com.wasistemas.tasko.produto.adapter.in.web.request.AdicionarProdutoSubgrupoRequest;
import br.com.wasistemas.tasko.produto.application.port.in.usecases.ProdutoSubgrupoUseCases;
import br.com.wasistemas.tasko.produto.domain.subgrupo.ProdutoSubgrupo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produtos/subgrupos")
@RequiredArgsConstructor
@Tag(name = "Produto Subgrupo", description = "Gerenciamento de Subgrupos de Produto")
public class ProdutoSubgrupoController {
    private final ProdutoSubgrupoUseCases useCases;
    private final ProdutoSubgrupoWebMapper webMapper;

    @PostMapping
    @Operation(summary = "Criar novo Produto Subgrupo")
    public GeneralApiResponse<ProdutoSubgrupo> adicionar(@RequestBody AdicionarProdutoSubgrupoRequest request) {
        return GeneralApiResponse.<ProdutoSubgrupo>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.adicionar(webMapper.toDomain(request)))
                .build();
    }

    @GetMapping
    @Operation(summary = "Listar Produto Subgrupo")
    public GeneralApiResponse<List<ProdutoSubgrupo>> listar(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<ProdutoSubgrupo>>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.listar(Paginacao.builder()
                        .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar Produto Subgrupo por ID")
    public GeneralApiResponse<ProdutoSubgrupo> obterPorId(@PathVariable Long id) {
        return GeneralApiResponse.<ProdutoSubgrupo>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.obterPorId(id))
                .build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Excluir Produto Subgrupo por ID")
    public GeneralApiResponse<ProdutoSubgrupo> excluirPorId(@PathVariable Long id) {
        useCases.excluirPorId(id);
        return GeneralApiResponse.<ProdutoSubgrupo>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
