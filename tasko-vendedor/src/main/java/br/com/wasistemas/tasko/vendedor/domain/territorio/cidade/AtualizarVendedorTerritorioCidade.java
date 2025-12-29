package br.com.wasistemas.tasko.vendedor.domain.territorio.cidade;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AtualizarVendedorTerritorioCidade {
    private Long id;
    private String nomeCidade;
    private Long territorioId;
}