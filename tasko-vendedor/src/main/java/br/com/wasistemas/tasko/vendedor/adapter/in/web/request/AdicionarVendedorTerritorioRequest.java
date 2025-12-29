
package br.com.wasistemas.tasko.vendedor.adapter.in.web.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdicionarVendedorTerritorioRequest {
    private String nomeTerritorio;
    private String descricaoTerritorio;
    private String nomeRegiao;
    private String estado;
    private String coordenadasPoligono;
    private Long supervisorId;
}
