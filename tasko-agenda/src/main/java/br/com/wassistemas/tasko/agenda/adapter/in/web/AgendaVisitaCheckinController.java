package br.com.wassistemas.tasko.agenda.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.agenda.adapter.in.web.mapper.AgendaVisitaCheckinWebMapper;
import br.com.wassistemas.tasko.agenda.adapter.in.web.request.AdicionarAgendaVisitaCheckinRequest;
import br.com.wassistemas.tasko.agenda.application.port.in.usecases.AgendaVisitaCheckinUseCases;
import br.com.wassistemas.tasko.agenda.domain.agendavisitacheckin.AgendaVisitaCheckin;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/agenda-visitas/checkins")
@RequiredArgsConstructor
@Tag(name = "Checkins de Visita", description = "Gerenciamento de Checkins de Visita")
public class AgendaVisitaCheckinController {
    private final AgendaVisitaCheckinUseCases useCases;
    private final AgendaVisitaCheckinWebMapper webMapper;

    @PostMapping
    @Operation(summary = "Criar novo Checkins de Visita")
    public GeneralApiResponse<AgendaVisitaCheckin> adicionar(@RequestBody AdicionarAgendaVisitaCheckinRequest request) {
        return GeneralApiResponse.<AgendaVisitaCheckin>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.adicionar(webMapper.toDomain(request)))
                .build();
    }

    @GetMapping
    @Operation(summary = "Listar Checkins de Visita")
    public GeneralApiResponse<List<AgendaVisitaCheckin>> listar(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<AgendaVisitaCheckin>>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.listar(Paginacao.builder()
                        .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar Checkins de Visita por ID")
    public GeneralApiResponse<AgendaVisitaCheckin> obterPorId(@PathVariable Long id) {
        return GeneralApiResponse.<AgendaVisitaCheckin>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.obterPorId(id))
                .build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Excluir Checkins de Visita por ID")
    public GeneralApiResponse<AgendaVisitaCheckin> excluirPorId(@PathVariable Long id) {
        useCases.excluirPorId(id);
        return GeneralApiResponse.<AgendaVisitaCheckin>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
