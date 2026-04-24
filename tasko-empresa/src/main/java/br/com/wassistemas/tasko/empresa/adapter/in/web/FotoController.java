package br.com.wassistemas.tasko.empresa.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.empresa.adapter.in.web.mapper.FotoWebMapper;
import br.com.wassistemas.tasko.empresa.adapter.in.web.request.AdicionarFotoRequest;
import br.com.wassistemas.tasko.empresa.application.port.in.usecases.FotoUseCases;
import br.com.wassistemas.tasko.empresa.domain.foto.Foto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/fotos")
@RequiredArgsConstructor
@Tag(name = "Fotos", description = "Gerenciamento de Fotos")
public class FotoController {
    private final FotoUseCases useCases;
    private final FotoWebMapper webMapper;

    @PostMapping
    @Operation(summary = "Criar novo Fotos")
    public GeneralApiResponse<Foto> adicionar(@RequestBody AdicionarFotoRequest request) {
        return GeneralApiResponse.<Foto>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.adicionar(webMapper.toDomain(request)))
                .build();
    }

    @GetMapping
    @Operation(summary = "Listar Fotos")
    public GeneralApiResponse<List<Foto>> listar(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<Foto>>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.listar(Paginacao.builder()
                        .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar Fotos por ID")
    public GeneralApiResponse<Foto> obterPorId(@PathVariable Long id) {
        return GeneralApiResponse.<Foto>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.obterPorId(id))
                .build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Excluir Fotos por ID")
    public GeneralApiResponse<Foto> excluirPorId(@PathVariable Long id) {
        useCases.excluirPorId(id);
        return GeneralApiResponse.<Foto>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
