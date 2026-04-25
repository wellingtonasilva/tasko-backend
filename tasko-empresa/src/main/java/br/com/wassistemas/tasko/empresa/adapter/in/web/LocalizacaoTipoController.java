package br.com.wassistemas.tasko.empresa.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.exception.ResourceDuplicateException;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.empresa.adapter.in.web.mapper.LocalizacaoTipoWebMapper;
import br.com.wassistemas.tasko.empresa.adapter.in.web.request.AdicionarLocalizacaoTipoRequest;
import br.com.wassistemas.tasko.empresa.application.port.in.usecases.LocalizacaoTipoUseCases;
import br.com.wassistemas.tasko.empresa.domain.localizacaotipo.LocalizacaoTipo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/empresas/localizacoes/tipos")
@RequiredArgsConstructor
@Tag(name = "Localização Tipo", description = "Gerenciamento de Tipos de Localização")
public class LocalizacaoTipoController {

  private final LocalizacaoTipoUseCases useCases;
  private final LocalizacaoTipoWebMapper webMapper;

  @PostMapping
  @Operation(summary = "Criar novo Localização Tipo")
  public GeneralApiResponse<LocalizacaoTipo> adicionar(
      @RequestBody AdicionarLocalizacaoTipoRequest request) throws ResourceDuplicateException {
    return GeneralApiResponse.<LocalizacaoTipo>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.adicionar(webMapper.toDomain(request)))
        .build();
  }

  @GetMapping
  @Operation(summary = "Listar Localização Tipo")
  public GeneralApiResponse<List<LocalizacaoTipo>> listar(
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "10") int size,
      @RequestParam(defaultValue = "id") String sortBy,
      @RequestParam(defaultValue = "asc") String sortDirection) {
    return GeneralApiResponse.<List<LocalizacaoTipo>>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.listar(Paginacao.builder()
            .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
            .build()))
        .build();
  }

  @GetMapping("/{id}")
  @Operation(summary = "Buscar Localização Tipo por ID")
  public GeneralApiResponse<LocalizacaoTipo> obterPorId(@PathVariable Long id) {
    return GeneralApiResponse.<LocalizacaoTipo>builder()
        .status(HttpStatus.OK.value())
        .data(useCases.obterPorId(id))
        .build();
  }

  @DeleteMapping("/{id}")
  @Operation(summary = "Excluir Localização Tipo por ID")
  public GeneralApiResponse<LocalizacaoTipo> excluirPorId(@PathVariable Long id) {
    useCases.excluirPorId(id);
    return GeneralApiResponse.<LocalizacaoTipo>builder()
        .status(HttpStatus.OK.value())
        .build();
  }
}
