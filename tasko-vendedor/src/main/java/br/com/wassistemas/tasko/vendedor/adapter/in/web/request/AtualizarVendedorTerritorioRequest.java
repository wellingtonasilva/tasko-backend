
package br.com.wassistemas.tasko.vendedor.adapter.in.web.request;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
@Getter
public class AtualizarVendedorTerritorioRequest {
    private Long id;
    private Long empresaId;
    private Long supervisorId;
    private String nomeTerritorio;
    private String descricaoTerritorio;
    private String nomeRegiao;
    private String estado;
    private String coordenadasPoligono;
}
