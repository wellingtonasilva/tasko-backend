package br.com.wassistemas.tasko.vendedor.adapter.in.web.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AdicionarVendedorTerritorioCidadeRequest {
    private String nomeCidade;
    private Long territorioId;
}