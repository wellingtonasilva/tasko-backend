package br.com.wassistemas.tasko.vendedor.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.exception.ResourceDuplicateException;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.vendedor.adapter.in.web.mapper.VendedorTerritorioWebMapper;
import br.com.wassistemas.tasko.vendedor.adapter.in.web.request.AdicionarVendedorTerritorioRequest;
import br.com.wassistemas.tasko.vendedor.adapter.in.web.request.AtualizarVendedorTerritorioRequest;
import br.com.wassistemas.tasko.vendedor.adapter.in.web.response.VendedorTerritorioResponse;
import br.com.wassistemas.tasko.vendedor.application.port.in.usecases.VendedorTerritorioUseCases;
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
  public GeneralApiResponse<VendedorTerritorioResponse> adicionar(
      @RequestBody AdicionarVendedorTerritorioRequest request,
      @RequestHeader("X-Empresa-Id") Long empresaId) throws ResourceDuplicateException {
    return GeneralApiResponse.<VendedorTerritorioResponse>builder()
        .status(HttpStatus.OK.value())
        .data(vendedorTerritorioWebMapper.toResponse(vendedorTerritorioUseCases.adicionar(empresaId,
            vendedorTerritorioWebMapper.toDomain(empresaId, request))))
        .build();
  }

  @GetMapping
  public GeneralApiResponse<List<VendedorTerritorioResponse>> listar(
      @RequestHeader("X-Empresa-Id") Long empresaId,
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "10") int size,
      @RequestParam(defaultValue = "id") String sortBy,
      @RequestParam(defaultValue = "asc") String sortDirection) {
    return GeneralApiResponse.<List<VendedorTerritorioResponse>>builder()
        .status(HttpStatus.OK.value())
        .data(vendedorTerritorioWebMapper.toList(
            vendedorTerritorioUseCases.listar(empresaId, Paginacao.builder()
                .page(page)
                .size(size)
                .sortBy(sortBy)
                .sortDirection(sortDirection)
                .build())))
        .build();
  }

  @GetMapping("/{id}")
  public GeneralApiResponse<VendedorTerritorioResponse> obterPorId(@PathVariable Long id,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<VendedorTerritorioResponse>builder()
        .status(HttpStatus.OK.value())
        .data(vendedorTerritorioWebMapper.toResponse(
            vendedorTerritorioUseCases.obterPorId(empresaId, id)))
        .build();
  }

  @PutMapping("/{id}")
  public GeneralApiResponse<VendedorTerritorioResponse> atualizar(@PathVariable Long id,
      @RequestBody AtualizarVendedorTerritorioRequest request,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    return GeneralApiResponse.<VendedorTerritorioResponse>builder()
        .status(HttpStatus.OK.value())
        .data(vendedorTerritorioWebMapper.toResponse(
            vendedorTerritorioUseCases.atualizar(empresaId, id,
                vendedorTerritorioWebMapper.toDomain(request))))
        .build();
  }

  @DeleteMapping("/{id}")
  public GeneralApiResponse<VendedorTerritorioResponse> excluirPorId(@PathVariable Long id,
      @RequestHeader("X-Empresa-Id") Long empresaId) {
    vendedorTerritorioUseCases.excluirPorId(empresaId, id);
    return GeneralApiResponse.<VendedorTerritorioResponse>builder()
        .status(HttpStatus.OK.value())
        .build();
  }
}
