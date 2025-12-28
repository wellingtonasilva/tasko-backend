package br.com.wasistemas.tasko.vendedor.adapter.in.web;

import br.com.wasistemas.tasko.common.response.GeneralApiResponse;
import br.com.wasistemas.tasko.vendedor.adapter.in.web.mapper.VendedorSupervisorWebMapper;
import br.com.wasistemas.tasko.vendedor.adapter.in.web.request.AdicionarVendedorSupervisorRequest;
import br.com.wasistemas.tasko.vendedor.application.port.in.usecases.VendedorSupervisorUseCase;
import br.com.wasistemas.tasko.vendedor.domain.Paginacao;
import br.com.wasistemas.tasko.vendedor.domain.supervisor.VendedorSupervisor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/supervisores")
public class VendedorSupervisorController {
    private final VendedorSupervisorUseCase vendedorSupervisorUseCase;
    private final VendedorSupervisorWebMapper vendedorSupervisorWebMapper;

    @PostMapping
    public GeneralApiResponse<VendedorSupervisor> adicionarVendedorSupervisor(
            @RequestBody AdicionarVendedorSupervisorRequest request) {
        return GeneralApiResponse.<VendedorSupervisor>builder()
                .status(HttpStatus.OK.value())
                .data(vendedorSupervisorUseCase.adicionarVendedorSupervisor(vendedorSupervisorWebMapper.toDomain(request)))
                .build();
    }

    @GetMapping
    public GeneralApiResponse<List<VendedorSupervisor>> listarVendedorSupervisor(@RequestParam(defaultValue = "0") int page,
                                                                                 @RequestParam(defaultValue = "10") int size,
                                                                                 @RequestParam(defaultValue = "sortBy") String sortBy,
                                                                                 @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<VendedorSupervisor>>builder()
                .status(HttpStatus.OK.value())
                .data(vendedorSupervisorUseCase.listarVendedorSupervisor(Paginacao.builder()
                        .page(page)
                        .size(size)
                        .sortBy(sortBy)
                        .sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @GetMapping("/{id}")
    public GeneralApiResponse<VendedorSupervisor>  obterVendedorSupervisorPorId(@PathVariable Long id) {
        return GeneralApiResponse.<VendedorSupervisor>builder()
                .status(HttpStatus.OK.value())
                .data(vendedorSupervisorUseCase.obterVendedorSupervisorPorId(id))
                .build();
    }

    @DeleteMapping("/{id}")
    public GeneralApiResponse<VendedorSupervisor>  excluirVendedorSupervisorById(@PathVariable Long id) {
        vendedorSupervisorUseCase.excluirVendedorSupervisorById(id);
        return GeneralApiResponse.<VendedorSupervisor>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
