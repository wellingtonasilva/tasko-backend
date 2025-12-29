package br.com.wasistemas.tasko.vendedor.domain.territorio.cidade;

import br.com.wasistemas.tasko.vendedor.domain.territorio.VendedorTerritorio;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdicionarVendedorTerritorioCidade {
    private String nomeCidade;
    private Long territorioId;
}