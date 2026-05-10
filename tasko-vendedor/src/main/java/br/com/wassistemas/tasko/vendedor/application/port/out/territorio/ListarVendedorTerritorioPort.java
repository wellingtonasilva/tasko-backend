package br.com.wassistemas.tasko.vendedor.application.port.out.territorio;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.domain.vendedor.VendedorTerritorio;
import java.util.List;

public interface ListarVendedorTerritorioPort {
    List<VendedorTerritorio> listarVendedorTerritorio(Long empresaId, Paginacao paginacao);
}
