package br.com.wasistemas.tasko.vendedor.application.port.out.territorio;

import br.com.wasistemas.tasko.vendedor.domain.territorio.AdicionarVendedorTerritorio;
import br.com.wasistemas.tasko.vendedor.domain.territorio.VendedorTerritorio;

public interface AdicionarVendedorTerritorioPort {
    VendedorTerritorio adicionarVendedorTerritorio(AdicionarVendedorTerritorio adicionarVendedorTerritorio);
}
