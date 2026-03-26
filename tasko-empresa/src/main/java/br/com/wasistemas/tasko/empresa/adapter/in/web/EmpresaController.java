package br.com.wasistemas.tasko.empresa.adapter.in.web;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.common.response.GeneralApiResponse;
import br.com.wasistemas.tasko.empresa.adapter.in.web.mapper.EmpresaWebMapper;
import br.com.wasistemas.tasko.empresa.adapter.in.web.request.AdicionarEmpresaRequest;
import br.com.wasistemas.tasko.empresa.application.port.in.usecases.EmpresaUseCases;
import br.com.wasistemas.tasko.empresa.domain.empresa.Empresa;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/empresas")
@RequiredArgsConstructor
@Tag(name = "Empresas", description = "Gerenciamento de Empresas")
public class EmpresaController {
    private final EmpresaUseCases useCases;
    private final EmpresaWebMapper webMapper;

    @PostMapping
    @Operation(summary = "Criar novo Empresas")
    public GeneralApiResponse<Empresa> adicionar(@RequestBody AdicionarEmpresaRequest request) {
        return GeneralApiResponse.<Empresa>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.adicionar(webMapper.toDomain(request)))
                .build();
    }

    @GetMapping
    @Operation(summary = "Listar Empresas")
    public GeneralApiResponse<List<Empresa>> listar(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<Empresa>>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.listar(Paginacao.builder()
                        .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar Empresas por ID")
    public GeneralApiResponse<Empresa> obterPorId(@PathVariable Long id) {
        return GeneralApiResponse.<Empresa>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.obterPorId(id))
                .build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Excluir Empresas por ID")
    public GeneralApiResponse<Empresa> excluirPorId(@PathVariable Long id) {
        useCases.excluirPorId(id);
        return GeneralApiResponse.<Empresa>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
