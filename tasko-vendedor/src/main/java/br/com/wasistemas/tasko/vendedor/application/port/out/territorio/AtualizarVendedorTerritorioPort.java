package br.com.wasistemas.tasko.vendedor.application.port.out.territorio;

import br.com.wasistemas.tasko.vendedor.domain.territorio.AtualizarVendedorTerritorio;
import br.com.wasistemas.tasko.vendedor.domain.territorio.VendedorTerritorio;

public interface AtualizarVendedorTerritorioPort {
    VendedorTerritorio atualizarVendedorTerritorio(Long id, AtualizarVendedorTerritorio atualizarVendedorTerritorio);
}
