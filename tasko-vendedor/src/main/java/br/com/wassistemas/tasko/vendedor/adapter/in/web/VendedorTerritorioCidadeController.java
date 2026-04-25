package br.com.wassistemas.tasko.vendedor.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.exception.ResourceDuplicateException;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.vendedor.adapter.in.web.mapper.VendedorTerritorioCidadeWebMapper;
import br.com.wassistemas.tasko.vendedor.adapter.in.web.request.AdicionarVendedorTerritorioCidadeRequest;
import br.com.wassistemas.tasko.vendedor.application.port.in.usecases.VendedorTerritorioCidadeUseCases;
import br.com.wassistemas.tasko.vendedor.domain.territorio.cidade.VendedorTerritorioCidade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/territorios")
public class VendedorTerritorioCidadeController {

  private final VendedorTerritorioCidadeUseCases vendedorTerritorioCidadeUseCases;
  private final VendedorTerritorioCidadeWebMapper vendedorTerritorioCidadeWebMapper;

  @PostMapping("/{territorioId}/cidades")
  public GeneralApiResponse<VendedorTerritorioCidade> adicionar(@PathVariable Long territorioId,
      @RequestBody AdicionarVendedorTerritorioCidadeRequest request)
      throws ResourceDuplicateException {
    return GeneralApiResponse.<VendedorTerritorioCidade>builder()
        .status(HttpStatus.OK.value())
        .data(vendedorTerritorioCidadeUseCases.adicionar(
            vendedorTerritorioCidadeWebMapper.toDomain(request)))
        .build();
  }

  @GetMapping("/{territorioId}/cidades")
  public GeneralApiResponse<List<VendedorTerritorioCidade>> listar(
      @PathVariable Long territorioId,
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "10") int size,
      @RequestParam(defaultValue = "id") String sortBy,
      @RequestParam(defaultValue = "asc") String sortDirection) {
    return GeneralApiResponse.<List<VendedorTerritorioCidade>>builder()
        .status(HttpStatus.OK.value())
        .data(vendedorTerritorioCidadeUseCases.listar(Paginacao.builder()
            .page(page)
            .size(size)
            .sortBy(sortBy)
            .sortDirection(sortDirection)
            .build()))
        .build();
  }

  @GetMapping("/{territorioId}/cidades/{id}")
  public GeneralApiResponse<VendedorTerritorioCidade> obterPorId(@PathVariable Long territorioId,
      @PathVariable Long id) {
    return GeneralApiResponse.<VendedorTerritorioCidade>builder()
        .status(HttpStatus.OK.value())
        .data(vendedorTerritorioCidadeUseCases.obterPorId(id))
        .build();
  }

  @DeleteMapping("/{territorioId}/cidades/{id}")
  public GeneralApiResponse<VendedorTerritorioCidade> excluirPorId(@PathVariable Long territorioId,
      @PathVariable Long id) {
    vendedorTerritorioCidadeUseCases.excluirPorId(id);
    return GeneralApiResponse.<VendedorTerritorioCidade>builder()
        .status(HttpStatus.OK.value())
        .build();
  }
}
