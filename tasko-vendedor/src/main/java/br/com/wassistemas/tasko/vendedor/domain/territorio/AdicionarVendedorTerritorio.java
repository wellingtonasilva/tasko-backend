
package br.com.wassistemas.tasko.vendedor.domain.territorio;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdicionarVendedorTerritorio {
    private Long empresaId;
    private Long supervisorId;
    private String nomeTerritorio;
    private String descricaoTerritorio;
    private String nomeRegiao;
    private String estado;
    private String coordenadasPoligono;
}
