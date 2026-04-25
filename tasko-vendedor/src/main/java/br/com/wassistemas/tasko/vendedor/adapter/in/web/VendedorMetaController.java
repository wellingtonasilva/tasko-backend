package br.com.wassistemas.tasko.vendedor.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.vendedor.adapter.in.web.mapper.VendedorMetaWebMapper;
import br.com.wassistemas.tasko.vendedor.adapter.in.web.request.AdicionarVendedorMetaRequest;
import br.com.wassistemas.tasko.vendedor.application.port.in.usecases.VendedorMetaUseCase;
import br.com.wassistemas.tasko.vendedor.domain.meta.VendedorMeta;
import br.com.wassistemas.tasko.common.domain.vendedor.Vendedor;
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
public class VendedorMetaController {
    private final VendedorMetaUseCase vendedorMetaUseCase;
    private final VendedorMetaWebMapper vendedorMetaWebMapper;

    @PostMapping("/{vendedorId}/metas")
    @Operation(summary = "Adicionar Meta para um Vendedor")
    public GeneralApiResponse<VendedorMeta> adicionar(@RequestBody AdicionarVendedorMetaRequest request) {
        return GeneralApiResponse.<VendedorMeta>builder()
                .status(HttpStatus.OK.value())
                .data(vendedorMetaUseCase.adicionar(vendedorMetaWebMapper.toDomain(request)))
                .build();
    }

    @Operation(
            summary = "Lista de Metas de Vendedor",
            description = "Retorna lista com as Metas de um Vendedor"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuário encontrado",
                    content = @Content(schema = @Schema(implementation = Vendedor.class))),
            @ApiResponse(responseCode = "404", description = "Usuário não encontrado")
    })
    @GetMapping("/{vendedorId}/metas")
    public GeneralApiResponse<List<VendedorMeta>> listarVendedor(@RequestParam(defaultValue = "0") int page,
                                                                 @RequestParam(defaultValue = "10") int size,
                                                                 @RequestParam(defaultValue = "id") String sortBy,
                                                                 @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<VendedorMeta>>builder()
                .status(HttpStatus.OK.value())
                .data(vendedorMetaUseCase.listar(Paginacao.builder()
                        .page(page)
                        .size(size)
                        .sortBy(sortBy)
                        .sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @Operation(
            summary = "Buscar Meta do Vendedor por ID",
            description = "Retorna os detalhes da Meta de um vendedor específico"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Meta do Vendedor encontrado",
                    content = @Content(schema = @Schema(implementation = Vendedor.class))),
            @ApiResponse(responseCode = "404", description = "Meta do Vendedor não encontrado")
    })
    @GetMapping("/{vendedorId}/metas/{id}")
    public GeneralApiResponse<VendedorMeta> obterPorId(@PathVariable Long id) {
        return GeneralApiResponse.<VendedorMeta>builder()
                .status(HttpStatus.OK.value())
                .data(vendedorMetaUseCase.obterPorId(id))
                .build();
    }

    @Operation(
            summary = "Excluir Meta do Vendedor por ID",
            description = "Remove uma Meta do Vendedor do sistema"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Meta do Vendedor excluído com sucesso"),
            @ApiResponse(responseCode = "404", description = "Meta do Vendedor não encontrado"),
            @ApiResponse(responseCode = "403", description = "Sem permissão para excluir")
    })
    @DeleteMapping("/{vendedorId}/metas/{id}")
    public GeneralApiResponse<VendedorMeta> excluirById(@PathVariable Long id) {
        vendedorMetaUseCase.excluirPorId(id);
        return GeneralApiResponse.<VendedorMeta>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
