package br.com.wasistemas.tasko.empresa.adapter.in.web;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.common.response.GeneralApiResponse;
import br.com.wasistemas.tasko.empresa.adapter.in.web.mapper.EmpresaLocalizacaoWebMapper;
import br.com.wasistemas.tasko.empresa.adapter.in.web.request.AdicionarEmpresaLocalizacaoRequest;
import br.com.wasistemas.tasko.empresa.application.port.in.usecases.EmpresaLocalizacaoUseCases;
import br.com.wasistemas.tasko.empresa.domain.empresalocalizacao.EmpresaLocalizacao;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/empresas/localizacoes")
@RequiredArgsConstructor
@Tag(name = "Empresa Localização", description = "Gerenciamento de Localizações da Empresa")
public class EmpresaLocalizacaoController {
    private final EmpresaLocalizacaoUseCases useCases;
    private final EmpresaLocalizacaoWebMapper webMapper;

    @PostMapping
    @Operation(summary = "Criar novo Empresa Localização")
    public GeneralApiResponse<EmpresaLocalizacao> adicionar(@RequestBody AdicionarEmpresaLocalizacaoRequest request) {
        return GeneralApiResponse.<EmpresaLocalizacao>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.adicionar(webMapper.toDomain(request)))
                .build();
    }

    @GetMapping
    @Operation(summary = "Listar Empresa Localização")
    public GeneralApiResponse<List<EmpresaLocalizacao>> listar(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<EmpresaLocalizacao>>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.listar(Paginacao.builder()
                        .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar Empresa Localização por ID")
    public GeneralApiResponse<EmpresaLocalizacao> obterPorId(@PathVariable Long id) {
        return GeneralApiResponse.<EmpresaLocalizacao>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.obterPorId(id))
                .build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Excluir Empresa Localização por ID")
    public GeneralApiResponse<EmpresaLocalizacao> excluirPorId(@PathVariable Long id) {
        useCases.excluirPorId(id);
        return GeneralApiResponse.<EmpresaLocalizacao>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
