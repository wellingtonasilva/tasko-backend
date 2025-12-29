
package br.com.wasistemas.tasko.vendedor.domain.territorio;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdicionarVendedorTerritorio {
    private String nomeTerritorio;
    private String descricaoTerritorio;
    private String nomeRegiao;
    private String estado;
    private String coordenadasPoligono;
    private Long supervisorId;
}
