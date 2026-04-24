package br.com.wassistemas.tasko.vendedor.application.port.out.territorio;

import br.com.wassistemas.tasko.vendedor.domain.territorio.AtualizarVendedorTerritorio;
import br.com.wassistemas.tasko.vendedor.domain.territorio.VendedorTerritorio;

public interface AtualizarVendedorTerritorioPort {
    VendedorTerritorio atualizarVendedorTerritorio(Long id, AtualizarVendedorTerritorio atualizarVendedorTerritorio);
}
