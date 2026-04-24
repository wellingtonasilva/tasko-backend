package br.com.wassistemas.tasko.vendedor.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.GenericUseCase;
import br.com.wassistemas.tasko.vendedor.domain.territorio.AdicionarVendedorTerritorio;
import br.com.wassistemas.tasko.vendedor.domain.territorio.AtualizarVendedorTerritorio;
import br.com.wassistemas.tasko.vendedor.domain.territorio.VendedorTerritorio;

public interface VendedorTerritorioUseCases extends GenericUseCase<VendedorTerritorio, AdicionarVendedorTerritorio, AtualizarVendedorTerritorio> {
}
