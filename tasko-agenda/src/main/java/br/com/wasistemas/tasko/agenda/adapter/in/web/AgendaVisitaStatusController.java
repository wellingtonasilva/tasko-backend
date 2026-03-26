package br.com.wasistemas.tasko.agenda.adapter.in.web;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.common.response.GeneralApiResponse;
import br.com.wasistemas.tasko.agenda.adapter.in.web.mapper.AgendaVisitaStatusWebMapper;
import br.com.wasistemas.tasko.agenda.adapter.in.web.request.AdicionarAgendaVisitaStatusRequest;
import br.com.wasistemas.tasko.agenda.application.port.in.usecases.AgendaVisitaStatusUseCases;
import br.com.wasistemas.tasko.agenda.domain.agendavisitastatus.AgendaVisitaStatus;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/agenda-visitas/status")
@RequiredArgsConstructor
@Tag(name = "Status de Visita", description = "Gerenciamento de Status de Visita")
public class AgendaVisitaStatusController {
    private final AgendaVisitaStatusUseCases useCases;
    private final AgendaVisitaStatusWebMapper webMapper;

    @PostMapping
    @Operation(summary = "Criar novo Status de Visita")
    public GeneralApiResponse<AgendaVisitaStatus> adicionar(@RequestBody AdicionarAgendaVisitaStatusRequest request) {
        return GeneralApiResponse.<AgendaVisitaStatus>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.adicionar(webMapper.toDomain(request)))
                .build();
    }

    @GetMapping
    @Operation(summary = "Listar Status de Visita")
    public GeneralApiResponse<List<AgendaVisitaStatus>> listar(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<AgendaVisitaStatus>>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.listar(Paginacao.builder()
                        .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar Status de Visita por ID")
    public GeneralApiResponse<AgendaVisitaStatus> obterPorId(@PathVariable Long id) {
        return GeneralApiResponse.<AgendaVisitaStatus>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.obterPorId(id))
                .build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Excluir Status de Visita por ID")
    public GeneralApiResponse<AgendaVisitaStatus> excluirPorId(@PathVariable Long id) {
        useCases.excluirPorId(id);
        return GeneralApiResponse.<AgendaVisitaStatus>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
