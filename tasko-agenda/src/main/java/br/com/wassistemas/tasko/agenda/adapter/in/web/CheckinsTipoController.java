package br.com.wassistemas.tasko.agenda.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.agenda.adapter.in.web.mapper.CheckinsTipoWebMapper;
import br.com.wassistemas.tasko.agenda.adapter.in.web.request.AdicionarCheckinsTipoRequest;
import br.com.wassistemas.tasko.agenda.application.port.in.usecases.CheckinsTipoUseCases;
import br.com.wassistemas.tasko.agenda.domain.checkinstipo.CheckinsTipo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/checkins/tipos")
@RequiredArgsConstructor
@Tag(name = "Checkin Tipo", description = "Gerenciamento de Tipos de Checkin")
public class CheckinsTipoController {
    private final CheckinsTipoUseCases useCases;
    private final CheckinsTipoWebMapper webMapper;

    @PostMapping
    @Operation(summary = "Criar novo Checkin Tipo")
    public GeneralApiResponse<CheckinsTipo> adicionar(@RequestBody AdicionarCheckinsTipoRequest request) {
        return GeneralApiResponse.<CheckinsTipo>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.adicionar(webMapper.toDomain(request)))
                .build();
    }

    @GetMapping
    @Operation(summary = "Listar Checkin Tipo")
    public GeneralApiResponse<List<CheckinsTipo>> listar(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<CheckinsTipo>>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.listar(Paginacao.builder()
                        .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar Checkin Tipo por ID")
    public GeneralApiResponse<CheckinsTipo> obterPorId(@PathVariable Long id) {
        return GeneralApiResponse.<CheckinsTipo>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.obterPorId(id))
                .build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Excluir Checkin Tipo por ID")
    public GeneralApiResponse<CheckinsTipo> excluirPorId(@PathVariable Long id) {
        useCases.excluirPorId(id);
        return GeneralApiResponse.<CheckinsTipo>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
