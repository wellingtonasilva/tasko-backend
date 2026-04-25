package br.com.wassistemas.tasko.empresa.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.exception.ResourceDuplicateException;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.empresa.adapter.in.web.mapper.EmpresaWebMapper;
import br.com.wassistemas.tasko.empresa.adapter.in.web.request.AdicionarEmpresaRequest;
import br.com.wassistemas.tasko.empresa.adapter.in.web.response.EmpresaResponse;
import br.com.wassistemas.tasko.empresa.application.port.in.usecases.EmpresaUseCases;
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

  @PostMapping("/criar")
  @Operation(summary = "Criar novo Empresas")
  public GeneralApiResponse<EmpresaResponse> adicionar(
      @RequestBody AdicionarEmpresaRequest request) throws ResourceDuplicateException {
    return GeneralApiResponse.<EmpresaResponse>builder()
        .status(HttpStatus.OK.value())
        .data(webMapper.toResponse(useCases.adicionar(webMapper.toDomain(request))))
        .build();
  }

  @GetMapping
  @Operation(summary = "Listar Empresas")
  public GeneralApiResponse<List<EmpresaResponse>> listar(
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "10") int size,
      @RequestParam(defaultValue = "id") String sortBy,
      @RequestParam(defaultValue = "asc") String sortDirection) {
    return GeneralApiResponse.<List<EmpresaResponse>>builder()
        .status(HttpStatus.OK.value())
        .data(webMapper.toEmpresaResponse(useCases.listar(Paginacao.builder()
            .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
            .build())))
        .build();
  }

  @GetMapping("/{id}")
  @Operation(summary = "Buscar Empresas por ID")
  public GeneralApiResponse<EmpresaResponse> obterPorId(@PathVariable Long id) {
    return GeneralApiResponse.<EmpresaResponse>builder()
        .status(HttpStatus.OK.value())
        .data(webMapper.toResponse(useCases.obterPorId(id)))
        .build();
  }

  @DeleteMapping("/{id}")
  @Operation(summary = "Excluir Empresas por ID")
  public GeneralApiResponse<EmpresaResponse> excluirPorId(@PathVariable Long id) {
    useCases.excluirPorId(id);
    return GeneralApiResponse.<EmpresaResponse>builder()
        .status(HttpStatus.OK.value())
        .build();
  }
}
