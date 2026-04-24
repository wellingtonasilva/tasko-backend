package br.com.wassitemas.tasko.produto.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassitemas.tasko.produto.adapter.in.web.mapper.ProdutoEstoqueLocalizacaoWebMapper;
import br.com.wassitemas.tasko.produto.adapter.in.web.request.AdicionarProdutoEstoqueLocalizacaoRequest;
import br.com.wassitemas.tasko.produto.application.port.in.usecases.ProdutoEstoqueLocalizacaoUseCases;
import br.com.wassitemas.tasko.produto.domain.produtoestoque.ProdutoEstoqueLocalizacao;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produtos/estoque")
@RequiredArgsConstructor
@Tag(name = "Produto Estoque", description = "Gerenciamento de Estoque por Localização")
public class ProdutoEstoqueLocalizacaoController {
    private final ProdutoEstoqueLocalizacaoUseCases useCases;
    private final ProdutoEstoqueLocalizacaoWebMapper webMapper;

    @PostMapping
    @Operation(summary = "Criar novo Produto Estoque")
    public GeneralApiResponse<ProdutoEstoqueLocalizacao> adicionar(@RequestBody AdicionarProdutoEstoqueLocalizacaoRequest request) {
        return GeneralApiResponse.<ProdutoEstoqueLocalizacao>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.adicionar(webMapper.toDomain(request)))
                .build();
    }

    @GetMapping
    @Operation(summary = "Listar Produto Estoque")
    public GeneralApiResponse<List<ProdutoEstoqueLocalizacao>> listar(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<ProdutoEstoqueLocalizacao>>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.listar(Paginacao.builder()
                        .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar Produto Estoque por ID")
    public GeneralApiResponse<ProdutoEstoqueLocalizacao> obterPorId(@PathVariable Long id) {
        return GeneralApiResponse.<ProdutoEstoqueLocalizacao>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.obterPorId(id))
                .build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Excluir Produto Estoque por ID")
    public GeneralApiResponse<ProdutoEstoqueLocalizacao> excluirPorId(@PathVariable Long id) {
        useCases.excluirPorId(id);
        return GeneralApiResponse.<ProdutoEstoqueLocalizacao>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
