package br.com.wasistemas.vendedor.adapter.in.web;

import br.com.wasistemas.common.response.GeneralApiResponse;
import br.com.wasistemas.vendedor.adapter.in.web.mapper.VendedorWebMapper;
import br.com.wasistemas.vendedor.adapter.in.web.request.AdicionarVendedorRequest;
import br.com.wasistemas.vendedor.application.port.in.usecases.VendedorUseCases;
import br.com.wasistemas.vendedor.domain.Paginacao;
import br.com.wasistemas.vendedor.domain.vendedor.Vendedor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vendedores")
@RequiredArgsConstructor
public class VendedorController {
    private final VendedorUseCases vendedorUseCases;
    private final VendedorWebMapper vendedorWebMapper;

    @PostMapping
    public GeneralApiResponse<Vendedor> adicionar(@RequestBody AdicionarVendedorRequest request) {
        return GeneralApiResponse.<Vendedor>builder()
                .status(HttpStatus.OK.value())
                .data(vendedorUseCases.adicionarVendedor(vendedorWebMapper.toDomain(request)))
                .build();
    }

    @GetMapping
    public GeneralApiResponse<List<Vendedor>> listarVendedor(@RequestParam(defaultValue = "0") int page,
                                                             @RequestParam(defaultValue = "10") int size,
                                                             @RequestParam(defaultValue = "sortBy") String sortBy,
                                                             @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<Vendedor>>builder()
                .status(HttpStatus.OK.value())
                .data(vendedorUseCases.listarVendedor(Paginacao.builder()
                                .page(page)
                                .size(size)
                                .sortBy(sortBy)
                                .sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @GetMapping("/{id}")
    public GeneralApiResponse<Vendedor>  obterPorId(@PathVariable Long id) {
        return GeneralApiResponse.<Vendedor>builder()
                .status(HttpStatus.OK.value())
                .data(vendedorUseCases.obterPorId(id))
                .build();
    }

    @DeleteMapping("/{id}")
    public GeneralApiResponse<Vendedor>  excluirById(@PathVariable Long id) {
        vendedorUseCases.excluirById(id);
        return GeneralApiResponse.<Vendedor>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
