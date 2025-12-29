
package br.com.wasistemas.tasko.vendedor.domain.territorio;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
@Getter
public class AtualizarVendedorTerritorio {
    private Long id;
    private String nomeTerritorio;
    private String descricaoTerritorio;
    private String nomeRegiao;
    private String estado;
    private String coordenadasPoligono;
    private Long supervisorId;
}
