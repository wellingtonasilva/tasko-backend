package br.com.wasistemas.tasko.vendedor.application.port.out.territorio;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.vendedor.domain.territorio.VendedorTerritorio;
import java.util.List;

public interface ListarVendedorTerritorioPort {
    List<VendedorTerritorio> listarVendedorTerritorio(Paginacao paginacao);
}
