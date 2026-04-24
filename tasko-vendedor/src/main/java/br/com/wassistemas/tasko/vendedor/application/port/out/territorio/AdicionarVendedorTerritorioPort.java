package br.com.wassistemas.tasko.vendedor.application.port.out.territorio;

import br.com.wassistemas.tasko.vendedor.domain.territorio.AdicionarVendedorTerritorio;
import br.com.wassistemas.tasko.vendedor.domain.territorio.VendedorTerritorio;

public interface AdicionarVendedorTerritorioPort {
    VendedorTerritorio adicionarVendedorTerritorio(AdicionarVendedorTerritorio adicionarVendedorTerritorio);
}
