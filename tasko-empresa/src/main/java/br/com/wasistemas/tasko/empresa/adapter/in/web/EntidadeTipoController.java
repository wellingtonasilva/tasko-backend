package br.com.wasistemas.tasko.empresa.adapter.in.web;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.common.response.GeneralApiResponse;
import br.com.wasistemas.tasko.empresa.adapter.in.web.mapper.EntidadeTipoWebMapper;
import br.com.wasistemas.tasko.empresa.adapter.in.web.request.AdicionarEntidadeTipoRequest;
import br.com.wasistemas.tasko.empresa.application.port.in.usecases.EntidadeTipoUseCases;
import br.com.wasistemas.tasko.empresa.domain.entidadetipo.EntidadeTipo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/entidades/tipos")
@RequiredArgsConstructor
@Tag(name = "Entidade Tipo", description = "Gerenciamento de Tipos de Entidade")
public class EntidadeTipoController {
    private final EntidadeTipoUseCases useCases;
    private final EntidadeTipoWebMapper webMapper;

    @PostMapping
    @Operation(summary = "Criar novo Entidade Tipo")
    public GeneralApiResponse<EntidadeTipo> adicionar(@RequestBody AdicionarEntidadeTipoRequest request) {
        return GeneralApiResponse.<EntidadeTipo>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.adicionar(webMapper.toDomain(request)))
                .build();
    }

    @GetMapping
    @Operation(summary = "Listar Entidade Tipo")
    public GeneralApiResponse<List<EntidadeTipo>> listar(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<EntidadeTipo>>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.listar(Paginacao.builder()
                        .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar Entidade Tipo por ID")
    public GeneralApiResponse<EntidadeTipo> obterPorId(@PathVariable Long id) {
        return GeneralApiResponse.<EntidadeTipo>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.obterPorId(id))
                .build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Excluir Entidade Tipo por ID")
    public GeneralApiResponse<EntidadeTipo> excluirPorId(@PathVariable Long id) {
        useCases.excluirPorId(id);
        return GeneralApiResponse.<EntidadeTipo>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
