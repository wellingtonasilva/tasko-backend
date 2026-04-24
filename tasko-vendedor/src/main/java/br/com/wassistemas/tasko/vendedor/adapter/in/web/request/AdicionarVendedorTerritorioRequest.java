
package br.com.wassistemas.tasko.vendedor.adapter.in.web.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AdicionarVendedorTerritorioRequest {
    private String nomeTerritorio;
    private String descricaoTerritorio;
    private String nomeRegiao;
    private String estado;
    private String coordenadasPoligono;
    private Long supervisorId;
}
