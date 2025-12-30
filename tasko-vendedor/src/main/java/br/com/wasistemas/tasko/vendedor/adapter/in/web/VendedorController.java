package br.com.wasistemas.tasko.vendedor.adapter.in.web;

import br.com.wasistemas.tasko.common.response.GeneralApiResponse;
import br.com.wasistemas.tasko.vendedor.adapter.in.web.mapper.VendedorWebMapper;
import br.com.wasistemas.tasko.vendedor.adapter.in.web.request.AdicionarVendedorRequest;
import br.com.wasistemas.tasko.vendedor.application.port.in.usecases.VendedorUseCases;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.Vendedor;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vendedores")
@RequiredArgsConstructor
@Tag(name = "Vendedores", description = "Gerenciamento de Vendedores")
public class VendedorController {
    private final VendedorUseCases vendedorUseCases;
    private final VendedorWebMapper vendedorWebMapper;

    @PostMapping
    @Operation(summary = "Criar novo Vendedor")
    public GeneralApiResponse<Vendedor> adicionar(@RequestBody AdicionarVendedorRequest request) {
        return GeneralApiResponse.<Vendedor>builder()
                .status(HttpStatus.OK.value())
                .data(vendedorUseCases.adicionar(vendedorWebMapper.toDomain(request)))
                .build();
    }

    @Operation(
            summary = "Lista de Vendedores",
            description = "Retorna lista com todos os Vendedores"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuário encontrado",
                    content = @Content(schema = @Schema(implementation = Vendedor.class))),
            @ApiResponse(responseCode = "404", description = "Usuário não encontrado")
    })
    @GetMapping
    public GeneralApiResponse<List<Vendedor>> listarVendedor(@RequestParam(defaultValue = "0") int page,
                                                             @RequestParam(defaultValue = "10") int size,
                                                             @RequestParam(defaultValue = "id") String sortBy,
                                                             @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<Vendedor>>builder()
                .status(HttpStatus.OK.value())
                .data(vendedorUseCases.listar(Paginacao.builder()
                                .page(page)
                                .size(size)
                                .sortBy(sortBy)
                                .sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @Operation(
            summary = "Buscar Vendedor por ID",
            description = "Retorna os detalhes de um vendedor específico"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Vendedor encontrado",
                    content = @Content(schema = @Schema(implementation = Vendedor.class))),
            @ApiResponse(responseCode = "404", description = "Vendedor não encontrado")
    })
    @GetMapping("/{id}")
    public GeneralApiResponse<Vendedor>  obterPorId(@PathVariable Long id) {
        return GeneralApiResponse.<Vendedor>builder()
                .status(HttpStatus.OK.value())
                .data(vendedorUseCases.obterPorId(id))
                .build();
    }

    @Operation(
            summary = "Excluir Vendedor por ID",
            description = "Remove um Vendedor do sistema"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Vendedor excluído com sucesso"),
            @ApiResponse(responseCode = "404", description = "Vendedor não encontrado"),
            @ApiResponse(responseCode = "403", description = "Sem permissão para excluir")
    })
    @DeleteMapping("/{id}")
    public GeneralApiResponse<Vendedor>  excluirById(@PathVariable Long id) {
        vendedorUseCases.excluirPorId(id);
        return GeneralApiResponse.<Vendedor>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
