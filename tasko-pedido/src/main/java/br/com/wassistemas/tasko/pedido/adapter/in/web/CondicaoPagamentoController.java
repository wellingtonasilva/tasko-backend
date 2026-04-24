package br.com.wassistemas.tasko.pedido.adapter.in.web;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import br.com.wassistemas.tasko.pedido.adapter.in.web.mapper.CondicaoPagamentoWebMapper;
import br.com.wassistemas.tasko.pedido.adapter.in.web.request.AdicionarCondicaoPagamentoRequest;
import br.com.wassistemas.tasko.pedido.application.port.in.usecases.CondicaoPagamentoUseCases;
import br.com.wassistemas.tasko.pedido.domain.condicaopagamento.CondicaoPagamento;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/condicoes-pagamento")
@RequiredArgsConstructor
@Tag(name = "Condição de Pagamento", description = "Gerenciamento de Condições de Pagamento")
public class CondicaoPagamentoController {
    private final CondicaoPagamentoUseCases useCases;
    private final CondicaoPagamentoWebMapper webMapper;

    @PostMapping
    @Operation(summary = "Criar novo Condição de Pagamento")
    public GeneralApiResponse<CondicaoPagamento> adicionar(@RequestBody AdicionarCondicaoPagamentoRequest request) {
        return GeneralApiResponse.<CondicaoPagamento>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.adicionar(webMapper.toDomain(request)))
                .build();
    }

    @GetMapping
    @Operation(summary = "Listar Condição de Pagamento")
    public GeneralApiResponse<List<CondicaoPagamento>> listar(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {
        return GeneralApiResponse.<List<CondicaoPagamento>>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.listar(Paginacao.builder()
                        .page(page).size(size).sortBy(sortBy).sortDirection(sortDirection)
                        .build()))
                .build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar Condição de Pagamento por ID")
    public GeneralApiResponse<CondicaoPagamento> obterPorId(@PathVariable Long id) {
        return GeneralApiResponse.<CondicaoPagamento>builder()
                .status(HttpStatus.OK.value())
                .data(useCases.obterPorId(id))
                .build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Excluir Condição de Pagamento por ID")
    public GeneralApiResponse<CondicaoPagamento> excluirPorId(@PathVariable Long id) {
        useCases.excluirPorId(id);
        return GeneralApiResponse.<CondicaoPagamento>builder()
                .status(HttpStatus.OK.value())
                .build();
    }
}
