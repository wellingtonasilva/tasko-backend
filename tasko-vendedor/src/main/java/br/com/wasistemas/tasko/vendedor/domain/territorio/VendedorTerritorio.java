
package br.com.wasistemas.vendedor.domain.territorio;

import br.com.wasistemas.vendedor.domain.Auditoria;
import br.com.wasistemas.vendedor.domain.supervisor.VendedorSupervisor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VendedorTerritorio {
    private Long id;
    private String nomeTerritorio;
    private String descricaoTerritorio;
    private String nomeRegiao;
    private String estado;
    private String coordenadasPoligono;
    private VendedorSupervisor supervisor;
    private Auditoria auditoria;
}
