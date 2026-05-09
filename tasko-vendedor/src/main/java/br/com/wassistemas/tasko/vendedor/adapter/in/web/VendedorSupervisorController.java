package br.com.wassistemas.tasko.vendedor.adapter.in.web;

import br.com.wassistemas.tasko.common.exception.ResourceDuplicateException;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.vendedor.adapter.in.web.mapper.VendedorSupervisorWebMapper;
import br.com.wassistemas.tasko.vendedor.adapter.in.web.request.AdicionarVendedorSupervisorRequest;
import br.com.wassistemas.tasko.vendedor.adapter.in.web.request.AtualizarVendedorSupervisorRequest;
import br.com.wassistemas.tasko.vendedor.application.port.in.usecases.VendedorSupervisorUseCase;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.domain.vendedor.VendedorSupervisor;
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
      @RequestBody AdicionarVendedorSupervisorRequest request,
      @RequestHeader("X-Empresa-Id") Long empresaId) throws ResourceDuplicateException {
    return GeneralApiResponse.<VendedorSupervisor>builder()
        .status(HttpStatus.OK.value())
        .data(vendedorSupervisorUseCase.adicionar(empresaId,
            vendedorSupervisorWebMapper.toDomain(empresaId, request)))
        .build();
  }

  @GetMapping
  public GeneralApiResponse<List<VendedorSupervisor>> listarVendedorSupervisor(
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "10") int size,
      @RequestParam(defaultValue = "id") String sortBy,
      @RequestParam(defaultValue = "asc") String sortDirection,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<List<VendedorSupervisor>>builder()
        .status(HttpStatus.OK.value())
        .data(vendedorSupervisorUseCase.listar(empresaId,
            Paginacao.builder()
                .page(page)
                .size(size)
                .sortBy(sortBy)
                .sortDirection(sortDirection)
                .build()))
        .build();
  }

  @GetMapping("/{id}")
  public GeneralApiResponse<VendedorSupervisor> obterVendedorSupervisorPorId(
      @PathVariable Long id,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<VendedorSupervisor>builder()
        .status(HttpStatus.OK.value())
        .data(vendedorSupervisorUseCase.obterPorId(empresaId, id))
        .build();
  }

  @PutMapping("/{id}")
  public GeneralApiResponse<VendedorSupervisor> atualizar(
      @PathVariable Long id,
      @RequestBody AtualizarVendedorSupervisorRequest request,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<VendedorSupervisor>builder()
        .status(HttpStatus.OK.value())
        .data(vendedorSupervisorUseCase.atualizar(empresaId, id, vendedorSupervisorWebMapper.toDomain(request)))
        .build();
  }

  @DeleteMapping("/{id}")
  public GeneralApiResponse<VendedorSupervisor> excluirVendedorSupervisorById(
      @PathVariable Long id, @RequestHeader("X-Empresa-Id") Long empresaId) {
    vendedorSupervisorUseCase.excluirPorId(empresaId, id);
    return GeneralApiResponse.<VendedorSupervisor>builder()
        .status(HttpStatus.OK.value())
        .build();
  }
}
