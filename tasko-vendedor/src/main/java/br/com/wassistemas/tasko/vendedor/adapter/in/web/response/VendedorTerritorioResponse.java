
package br.com.wassistemas.tasko.vendedor.adapter.in.web.response;

import br.com.wassistemas.tasko.common.domain.vendedor.VendedorSupervisor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class VendedorTerritorioResponse {
    private Long id;
    private String nomeTerritorio;
    private String descricaoTerritorio;
    private String nomeRegiao;
    private String estado;
    private String coordenadasPoligono;
    private VendedorSupervisor supervisor;
}
