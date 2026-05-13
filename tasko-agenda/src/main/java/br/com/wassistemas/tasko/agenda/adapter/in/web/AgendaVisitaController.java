package br.com.wassistemas.tasko.agenda.adapter.in.web;

import br.com.wassistemas.tasko.agenda.adapter.in.web.request.AtualizarAgendaVisitaRequest;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.exception.ResourceDuplicateException;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.agenda.adapter.in.web.mapper.AgendaVisitaWebMapper;
import br.com.wassistemas.tasko.agenda.adapter.in.web.request.AdicionarAgendaVisitaRequest;
import br.com.wassistemas.tasko.agenda.application.port.in.usecases.AgendaVisitaUseCases;
import br.com.wassistemas.tasko.agenda.domain.agendavisita.AgendaVisita;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
  @RequestMapping("/api/v1/agenda-visitas")
@RequiredArgsConstructor
@Tag(name = "Agenda de Visitas", description = "Gerenciamento de Agenda de Visitas")
public class AgendaVisitaController {

  private final AgendaVisitaUseCases useCases;
  private final AgendaVisitaWebMapper webMapper;

  @PostMapping
  @Operation(summary = "Criar novo Agenda de Visitas")
  public GeneralApiResponse<AgendaVisita> adicionar(
      @RequestBody AdicionarAgendaVisitaRequest request,
      @RequestHeader("X-Empresa-Id") Long empresaId) throws ResourceDuplicateException {
    return GeneralApiResponse.<AgendaVisita>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.adicionar(empresaId, webMapper.toDomain(empresaId, request)))
        .build();
  }

  @GetMapping
  @Operation(summary = "Listar Agenda de Visitas")
  public GeneralApiResponse<List<AgendaVisita>> listar(
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "10") int size,
      @RequestParam(defaultValue = "id") String sortBy,
      @RequestParam(defaultValue = "asc") String sortDirection,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<List<AgendaVisita>>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.listar(empresaId, Paginacao.builder()
            .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
            .build()))
        .build();
  }

  @GetMapping("/{id}")
  @Operation(summary = "Buscar Agenda de Visitas por ID")
  public GeneralApiResponse<AgendaVisita> obterPorId(@PathVariable Long id,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<AgendaVisita>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.obterPorId(empresaId, id))
        .build();
  }

  @PutMapping("/{id}")
  @Operation(summary = "Atualizar Agenda de Visitas por ID")
  public GeneralApiResponse<AgendaVisita> atualizar(@PathVariable Long id,
      @RequestBody AtualizarAgendaVisitaRequest request,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<AgendaVisita>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.atualizar(empresaId, id, webMapper.toDomain(request)))
        .build();
  }

  @DeleteMapping("/{id}")
  @Operation(summary = "Excluir Agenda de Visitas por ID")
  public GeneralApiResponse<AgendaVisita> excluirPorId(@PathVariable Long id,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    useCases.excluirPorId(empresaId, id);
    return GeneralApiResponse.<AgendaVisita>builder()
        .status(HttpStatus.OK.value())
        .build();
  }
}
