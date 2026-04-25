package br.com.wassistemas.tasko.vendedor.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.vendedor.adapter.in.web.mapper.VendedorTerritorioWebMapper;
import br.com.wassistemas.tasko.vendedor.adapter.in.web.request.AdicionarVendedorTerritorioRequest;
import br.com.wassistemas.tasko.vendedor.application.port.in.usecases.VendedorTerritorioUseCases;
import br.com.wassistemas.tasko.common.domain.vendedor.VendedorTerritorio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/territorios")
public class VendedorTerritorioController {
    private final VendedorTerritorioUseCases vendedorTerritorioUseCases;
    private final VendedorTerritorioWebMapper vendedorTerritorioWebMapper;

    @PostMapping
    public GeneralApiResponse<VendedorTerritorio> adicionar(@RequestBody AdicionarVendedorTerritorioRequest request) {
        return GeneralApiResponse.<VendedorTerritorio>builder()
                .status(HttpStatus.OK.value())
                .data(vendedorTerritorioUseCases.adicionar(vendedorTerritorioWebMapper.toDomain(request)))
                .build();
    }

    @GetMapping
    public GeneralApiResponse<List<VendedorTerritorio>> listar(@RequestParam(defaultValue = "0") int page,
                                                               @RequestParam(defaultValue = "10") int size,
                                                               @RequestParam(defaultValue = "id") String sortBy,
                                                               @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<VendedorTerritorio>>builder()
                .status(HttpStatus.OK.value())
                .data(vendedorTerritorioUseCases.listar(Paginacao.builder()
                        .page(page)
                        .size(size)
                        .sortBy(sortBy)
                        .sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @GetMapping("/{id}")
    public GeneralApiResponse<VendedorTerritorio> obterPorId(@PathVariable Long id) {
        return GeneralApiResponse.<VendedorTerritorio>builder()
                .status(HttpStatus.OK.value())
                .data(vendedorTerritorioUseCases.obterPorId(id))
                .build();
    }

    @DeleteMapping("/{id}")
    public GeneralApiResponse<VendedorTerritorio>  excluirPorId(@PathVariable Long id) {
        vendedorTerritorioUseCases.excluirPorId(id);
        return GeneralApiResponse.<VendedorTerritorio>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
