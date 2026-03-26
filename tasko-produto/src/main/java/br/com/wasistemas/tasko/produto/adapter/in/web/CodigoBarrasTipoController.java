package br.com.wasistemas.tasko.produto.adapter.in.web;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.common.response.GeneralApiResponse;
import br.com.wasistemas.tasko.produto.adapter.in.web.mapper.CodigoBarrasTipoWebMapper;
import br.com.wasistemas.tasko.produto.adapter.in.web.request.AdicionarCodigoBarrasTipoRequest;
import br.com.wasistemas.tasko.produto.application.port.in.usecases.CodigoBarrasTipoUseCases;
import br.com.wasistemas.tasko.produto.domain.codigobarrastipo.CodigoBarrasTipo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produtos/codigos-barras-tipos")
@RequiredArgsConstructor
@Tag(name = "Código de Barras Tipo", description = "Gerenciamento de Tipos de Código de Barras")
public class CodigoBarrasTipoController {
    private final CodigoBarrasTipoUseCases useCases;
    private final CodigoBarrasTipoWebMapper webMapper;

    @PostMapping
    @Operation(summary = "Criar novo Código de Barras Tipo")
    public GeneralApiResponse<CodigoBarrasTipo> adicionar(@RequestBody AdicionarCodigoBarrasTipoRequest request) {
        return GeneralApiResponse.<CodigoBarrasTipo>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.adicionar(webMapper.toDomain(request)))
                .build();
    }

    @GetMapping
    @Operation(summary = "Listar Código de Barras Tipo")
    public GeneralApiResponse<List<CodigoBarrasTipo>> listar(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<CodigoBarrasTipo>>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.listar(Paginacao.builder()
                        .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar Código de Barras Tipo por ID")
    public GeneralApiResponse<CodigoBarrasTipo> obterPorId(@PathVariable Long id) {
        return GeneralApiResponse.<CodigoBarrasTipo>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.obterPorId(id))
                .build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Excluir Código de Barras Tipo por ID")
    public GeneralApiResponse<CodigoBarrasTipo> excluirPorId(@PathVariable Long id) {
        useCases.excluirPorId(id);
        return GeneralApiResponse.<CodigoBarrasTipo>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
