package br.com.wassistemas.tasko.vendedor.domain.territorio.cidade;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.vendedor.domain.territorio.VendedorTerritorio;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VendedorTerritorioCidade {
    private Long id;
    private String nomeCidade;
    private VendedorTerritorio territorio;
    private Auditoria auditoria;
}