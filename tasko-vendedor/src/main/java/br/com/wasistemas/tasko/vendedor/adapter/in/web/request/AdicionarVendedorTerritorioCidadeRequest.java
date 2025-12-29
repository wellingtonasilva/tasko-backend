package br.com.wasistemas.tasko.vendedor.adapter.in.web.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdicionarVendedorTerritorioCidadeRequest {
    private String nomeCidade;
    private Long territorioId;
}