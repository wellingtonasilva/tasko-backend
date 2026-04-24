package br.com.wassistemas.tasko.empresa.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.empresa.adapter.in.web.mapper.TabelaPrecoTipoWebMapper;
import br.com.wassistemas.tasko.empresa.adapter.in.web.request.AdicionarTabelaPrecoTipoRequest;
import br.com.wassistemas.tasko.empresa.application.port.in.usecases.TabelaPrecoTipoUseCases;
import br.com.wassistemas.tasko.empresa.domain.tabelaprecotipo.TabelaPrecoTipo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tabelas-preco/tipos")
@RequiredArgsConstructor
@Tag(name = "Tabela de Preço Tipo", description = "Gerenciamento de Tipos de Tabela de Preço")
public class TabelaPrecoTipoController {
    private final TabelaPrecoTipoUseCases useCases;
    private final TabelaPrecoTipoWebMapper webMapper;

    @PostMapping
    @Operation(summary = "Criar novo Tabela de Preço Tipo")
    public GeneralApiResponse<TabelaPrecoTipo> adicionar(@RequestBody AdicionarTabelaPrecoTipoRequest request) {
        return GeneralApiResponse.<TabelaPrecoTipo>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.adicionar(webMapper.toDomain(request)))
                .build();
    }

    @GetMapping
    @Operation(summary = "Listar Tabela de Preço Tipo")
    public GeneralApiResponse<List<TabelaPrecoTipo>> listar(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<TabelaPrecoTipo>>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.listar(Paginacao.builder()
                        .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar Tabela de Preço Tipo por ID")
    public GeneralApiResponse<TabelaPrecoTipo> obterPorId(@PathVariable Long id) {
        return GeneralApiResponse.<TabelaPrecoTipo>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.obterPorId(id))
                .build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Excluir Tabela de Preço Tipo por ID")
    public GeneralApiResponse<TabelaPrecoTipo> excluirPorId(@PathVariable Long id) {
        useCases.excluirPorId(id);
        return GeneralApiResponse.<TabelaPrecoTipo>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
