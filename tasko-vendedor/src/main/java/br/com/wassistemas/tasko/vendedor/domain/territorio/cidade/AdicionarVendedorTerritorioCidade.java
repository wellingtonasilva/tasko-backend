package br.com.wassistemas.tasko.vendedor.domain.territorio.cidade;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdicionarVendedorTerritorioCidade {
    private String nomeCidade;
    private Long territorioId;
}